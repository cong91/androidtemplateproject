package vn.bolierplate.di.component

import android.content.Context
import android.content.SharedPreferences
import vn.bolierplate.App
import vn.bolierplate.di.module.ApplicationModule
import vn.bolierplate.di.module.DatabaseModule
import vn.bolierplate.ui.main.MainActivityViewModel
import vn.bolierplate.di.module.ViewModelModule

import vn.bolierplate.di.module.NetModule
import vn.bolierplate.ui.list.PostListViewModel




import dagger.Component
import javax.inject.Singleton


@Singleton

@Component(modules = arrayOf(ApplicationModule::class,NetModule::class,DatabaseModule::class,ViewModelModule::class))


interface ApplicationComponent {
    fun app(): App
    fun context(): Context
    fun preferences(): SharedPreferences
    fun inject(mainActivityViewModel: MainActivityViewModel)
	
	fun inject(postListActivityViewModel: PostListViewModel)
    
    
}
