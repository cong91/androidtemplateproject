package congnt.bolierplate.app.androidtemplateproject.ui.main

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import congnt.bolierplate.app.androidtemplateproject.R
import congnt.bolierplate.app.androidtemplateproject.core.BaseActivity
import congnt.bolierplate.app.androidtemplateproject.databinding.ActivityMainBinding

class MainActivity : BaseActivity<MainActivityViewModel, ActivityMainBinding>(MainActivityViewModel::class.java) {

    override fun getLayoutRes() = R.layout.activity_main
}
