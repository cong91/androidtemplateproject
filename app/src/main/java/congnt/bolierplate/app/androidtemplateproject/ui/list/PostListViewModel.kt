package congnt.bolierplate.app.androidtemplateproject.ui.list

import android.app.Application
import android.arch.lifecycle.MutableLiveData
import android.view.View
import congnt.bolierplate.app.androidtemplateproject.App
import congnt.bolierplate.app.androidtemplateproject.R
import congnt.bolierplate.app.androidtemplateproject.core.BaseViewModel
import congnt.bolierplate.app.androidtemplateproject.db.AppDatabase
import congnt.bolierplate.app.androidtemplateproject.db.entities.Post
import congnt.bolierplate.app.androidtemplateproject.network.PostApi
import congnt.bolierplate.app.androidtemplateproject.utils.extensions.logI
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class PostListViewModel  @Inject constructor(app: Application) : BaseViewModel(app){

    @Inject
    lateinit var db: AppDatabase
    @Inject
    lateinit var postApi: PostApi
    init {
        (app as? App)?.component?.inject(this)
    }
    val loadingVisibility: MutableLiveData<Int> = MutableLiveData()
    val errorMessage: MutableLiveData<Int> = MutableLiveData()
    val errorClickListener = View.OnClickListener { loadPosts() }
    var posts: MutableLiveData<List<Post>> = MutableLiveData()
    private lateinit var subscription: Disposable

    override fun onCleared() {
        super.onCleared()
        subscription.dispose()
    }

    fun loadPosts(){
        subscription = Observable.fromCallable { db.postDao().all }
                .concatMap {
                    dbPostList ->
                        if(dbPostList.isEmpty())
                            postApi.getPosts().concatMap {
                                            apiPostList -> db.postDao().insertAll(*apiPostList.toTypedArray())
                                 Observable.just(apiPostList)
                                       }
                        else
                            Observable.just(dbPostList)
                }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe { onRetrievePostListStart() }
                .doOnTerminate { onRetrievePostListFinish() }
                .subscribe(
                        { result ->
                            posts.value = result
                        },
                        { error -> onRetrievePostListError(error) }
                )
    }

    private fun onRetrievePostListStart(){
        loadingVisibility.value = View.VISIBLE
        errorMessage.value = null
    }

    private fun onRetrievePostListFinish(){
        loadingVisibility.value = View.GONE
    }

    private fun onRetrievePostListSuccess(postList:List<Post>){

    }

    private fun onRetrievePostListError(error: Throwable) {
        error.printStackTrace()
        errorMessage.value = R.string.post_error
    }
}