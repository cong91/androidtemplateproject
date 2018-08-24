package congnt.bolierplate.app.androidtemplateproject.di.component

import android.content.Context
import android.content.SharedPreferences
import congnt.bolierplate.app.androidtemplateproject.App
import congnt.bolierplate.app.androidtemplateproject.di.module.ApplicationModule
import congnt.bolierplate.app.androidtemplateproject.di.module.DatabaseModule
import congnt.bolierplate.app.androidtemplateproject.ui.main.MainActivityViewModel

import congnt.bolierplate.app.androidtemplateproject.di.module.NetModule
import congnt.bolierplate.app.androidtemplateproject.di.module.ViewModelModule
import congnt.bolierplate.app.androidtemplateproject.ui.list.PostListViewModel

import dagger.Component
import javax.inject.Singleton


@Singleton

@Component(modules = [ApplicationModule::class, NetModule::class, DatabaseModule::class, ViewModelModule::class])


interface ApplicationComponent {
    fun app(): App


    fun context(): Context

    fun preferences(): SharedPreferences

    fun inject(mainActivityViewModel: MainActivityViewModel)
    fun inject(postListActivityViewModel: PostListViewModel)
}
