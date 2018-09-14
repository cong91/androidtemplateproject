package vn.bolierplate.di.module

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import vn.bolierplate.App
import dagger.Module
import dagger.Provides
import vn.bolierplate.db.AppDatabase
import vn.bolierplate.network.PostApi
import vn.bolierplate.network.PostRepository
import javax.inject.Singleton

@Module
class ApplicationModule(var app: App) {


    @Provides
    @Singleton
    fun provideApp(): App = app

    @Provides
    @Singleton
    fun provideContext(): Context = app.applicationContext

    @Provides
    @Singleton
    fun provideSharedPreferences(): SharedPreferences = PreferenceManager.getDefaultSharedPreferences(app)


    @Provides
    @Singleton
    fun providePostRepository(postAPI : PostApi, appDB : AppDatabase): PostRepository {
        return PostRepository(postAPI,appDB)
    }
}
