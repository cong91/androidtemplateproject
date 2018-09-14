package vn.bolierplate.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import vn.bolierplate.R
import vn.bolierplate.core.BaseActivity
import vn.bolierplate.databinding.ActivityMainBinding

import vn.bolierplate.ui.list.PostListActivity



class MainActivity : BaseActivity<MainActivityViewModel, ActivityMainBinding>(MainActivityViewModel::class.java) {
    override fun getLayoutRes() = R.layout.activity_main
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
		
        showListActivity()
     	
        
    }
    
    fun showListActivity(){
        var button = Button(this)
        button.text = "Posts List"
        button.setOnClickListener { v ->
            run {
                var intent = Intent(v.context, PostListActivity::class.java)
                startActivity(intent)
            }
        }
        binding.rootView.addView(button)
    }
    
    
}
