package vn.framgia.boilerplate.di.component

import android.content.Context
import android.content.SharedPreferences
import vn.framgia.boilerplate.App
import vn.framgia.boilerplate.di.module.ApplicationModule
import vn.framgia.boilerplate.di.module.DatabaseModule
import vn.framgia.boilerplate.ui.main.MainActivityViewModel
import vn.framgia.boilerplate.di.module.ViewModelModule

import vn.framgia.boilerplate.di.module.NetModule
import vn.framgia.boilerplate.ui.list.PostListViewModel


import dagger.Component
import vn.framgia.boilerplate.ui.login.LoginViewModel
import vn.framgia.boilerplate.ui.login.RegisterViewModel
import javax.inject.Singleton


@Singleton

@Component(modules = arrayOf(ApplicationModule::class, NetModule::class, DatabaseModule::class, ViewModelModule::class))


interface ApplicationComponent {
    fun app(): App


    fun context(): Context

    fun preferences(): SharedPreferences

    fun inject(mainActivityViewModel: MainActivityViewModel)

    fun inject(postListActivityViewModel: PostListViewModel)

    fun inject(loginActivityViewModel: LoginViewModel)

    fun inject(registerViewModel: RegisterViewModel)

}
