package vn.framgia.boilerplate.ui.login

import android.app.Application
import vn.framgia.boilerplate.App
import vn.framgia.boilerplate.core.BaseViewModel
import vn.framgia.boilerplate.core.recyclerview.BaseViewAdapter
import javax.inject.Inject

class RegisterViewModel @Inject constructor(app : Application) : BaseViewModel(app) {
    init {
        (app as? App)?.component?.inject(this)
    }
}