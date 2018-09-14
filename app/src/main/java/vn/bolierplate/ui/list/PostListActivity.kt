package vn.bolierplate.ui.list

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.annotation.StringRes
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import vn.bolierplate.R
import vn.bolierplate.core.BaseActivity
import vn.bolierplate.core.api.Resource
import vn.bolierplate.core.api.Status
import vn.bolierplate.core.recyclerview.SingleTypeAdapter
import vn.bolierplate.databinding.ActivityPostListBinding
import vn.bolierplate.db.entities.Post
import vn.bolierplate.utils.extensions.logI

class PostListActivity : BaseActivity<PostListViewModel, ActivityPostListBinding>(PostListViewModel::class.java) {
    override fun getLayoutRes(): Int {
        return R.layout.activity_post_list
    }
    private lateinit var observerPost: Observer<Resource<List<Post>>>
    private var errorSnackbar: Snackbar? = null
    private var postsAdapter: SingleTypeAdapter<Post>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.errorMessage.observe(this, Observer { errorMessage ->
            if (errorMessage != null) showError(errorMessage) else hideError()
        })

        postsAdapter = SingleTypeAdapter(applicationContext, R.layout.item_post)
        binding.postList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.postList.adapter = postsAdapter

        observerPost = Observer { postsResource ->
            logI("=======> " + postsResource!!.status)
            when(postsResource!!.status){
                Status.LOADING -> viewModel.onRetrievePostListStart()
                Status.ERROR -> {
                    viewModel.onRetrievePostListFinish()
                    logI("=======> " + postsResource!!.message)
                }
                Status.SUCCESS -> {
                    viewModel.onRetrievePostListFinish()
                    logI("=======> " + postsResource!!.data!!.size)
                    if (postsResource.data != null) postsAdapter!!.addAll(postsResource.data)
                }
            }
        }
        viewModel.loadPosts().observe(this,observerPost)
    }

    private fun showError(@StringRes errorMessage: Int) {
        errorSnackbar = Snackbar.make(binding.root, errorMessage, Snackbar.LENGTH_INDEFINITE)
        errorSnackbar?.setAction(R.string.retry, viewModel.errorClickListener)
        errorSnackbar?.show()
    }

    private fun hideError() {
        errorSnackbar?.dismiss()
    }
}