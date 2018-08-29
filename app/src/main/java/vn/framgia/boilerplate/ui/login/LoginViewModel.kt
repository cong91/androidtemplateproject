package vn.framgia.boilerplate.ui.login

import android.app.Application
import vn.framgia.boilerplate.App
import vn.framgia.boilerplate.core.BaseViewModel
import vn.framgia.boilerplate.db.AppDatabase
import vn.framgia.boilerplate.network.PostApi
import javax.inject.Inject

class LoginViewModel  @Inject constructor(app: Application) : BaseViewModel(app) {
    @Inject
    lateinit var db: AppDatabase
    @Inject
    lateinit var postApi: PostApi
    init {
        (app as? App)?.component?.inject(this)
    }
}