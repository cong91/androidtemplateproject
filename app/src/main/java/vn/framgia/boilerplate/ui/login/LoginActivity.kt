package vn.framgia.boilerplate.ui.login

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.ActivityOptionsCompat
import android.transition.Explode
import android.view.View
import vn.framgia.boilerplate.R
import vn.framgia.boilerplate.core.BaseActivity
import vn.framgia.boilerplate.databinding.ActivityLoginBinding
import vn.framgia.boilerplate.ui.main.MainActivity
import vn.framgia.boilerplate.utils.extensions.addFragment
import vn.framgia.boilerplate.utils.extensions.replaceFragment

class LoginActivity  : BaseActivity<LoginViewModel, ActivityLoginBinding>(LoginViewModel::class.java) {
    override fun getLayoutRes(): Int {
       return R.layout.activity_login
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setListener()
    }

    private fun setListener() {
        binding.btGo.setOnClickListener(View.OnClickListener {
            val explode = Explode()
            explode.duration = 500

            window.exitTransition = explode
            window.enterTransition = explode
            val oc2 = ActivityOptionsCompat.makeSceneTransitionAnimation(this)
            val i2 = Intent(this, MainActivity::class.java)
            startActivity(i2, oc2.toBundle())
        })
        binding.fab.setOnClickListener {
            window.exitTransition = null
            window.enterTransition = null
            val options = ActivityOptions.makeSceneTransitionAnimation(this, binding.fab, binding.fab.transitionName)
            startActivity(Intent(this, RegisterActivity::class.java), options.toBundle())
        }
    }

    override fun onRestart() {
        super.onRestart()
        binding.fab.visibility = View.GONE
    }

    override fun onResume() {
        super.onResume()
        binding.fab.visibility = View.VISIBLE
    }
}