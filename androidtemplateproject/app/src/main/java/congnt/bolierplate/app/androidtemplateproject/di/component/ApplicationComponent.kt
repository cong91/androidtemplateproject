package congnt.bolierplate.app.androidtemplateproject.di.component

import android.content.Context
import android.content.SharedPreferences
import congnt.bolierplate.app.androidtemplateproject.App
import congnt.bolierplate.app.androidtemplateproject.di.module.ApplicationModule
import congnt.bolierplate.app.androidtemplateproject.di.module.DatabaseModule
import congnt.bolierplate.app.androidtemplateproject.ui.main.MainActivityViewModel

import congnt.bolierplate.app.androidtemplateproject.di.module.NetModule

import dagger.Component
import javax.inject.Singleton


@Singleton

@Component(modules = arrayOf(ApplicationModule::class,NetModule::class,DatabaseModule::class))


interface ApplicationComponent {
    fun app(): App


    fun context(): Context

    fun preferences(): SharedPreferences

    fun inject(mainActivityViewModel: MainActivityViewModel)
}
