package vn.bolierplate.network

import android.app.Application
import android.arch.lifecycle.LiveData
import android.content.Context
import vn.bolierplate.core.BaseViewModel
import vn.bolierplate.core.api.ApiResponse
import vn.bolierplate.core.api.NetworkBoundResource
import vn.bolierplate.core.api.RateLimiter
import vn.bolierplate.core.api.Resource
import vn.bolierplate.db.AppDatabase
import vn.bolierplate.db.entities.Post
import vn.bolierplate.utils.extensions.logI
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class PostRepository  @Inject constructor(private val postAPI : PostApi,private val appDB : AppDatabase) {

    val repoRateLimiter = RateLimiter<String>(10, TimeUnit.MINUTES)

    fun fetchPost(): LiveData<Resource<List<Post>>> {
        return object : NetworkBoundResource<List<Post>, Resource<List<Post>>>() {
            override fun saveCallResult(item: Resource<List<Post>>) {
                appDB.postDao().insertAll(item.data!!)
            }

            override fun shouldFetch(data: List<Post>?): Boolean = repoRateLimiter.shouldFetch("posts")
            override fun loadFromDb(): LiveData<List<Post>> {
                return appDB.postDao().getAllPosts()
            }

            override fun createCall(): LiveData<ApiResponse<Resource<List<Post>>>> {
                return postAPI.getPosts()
            }

            override fun onFetchFailed() {
                repoRateLimiter.reset("posts")
            }
        }.asLiveData()
    }
}