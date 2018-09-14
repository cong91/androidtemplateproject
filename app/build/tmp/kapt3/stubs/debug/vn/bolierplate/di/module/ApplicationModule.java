package vn.bolierplate.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\u0003H\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0013"}, d2 = {"Lvn/bolierplate/di/module/ApplicationModule;", "", "app", "Lvn/bolierplate/App;", "(Lvn/bolierplate/App;)V", "getApp", "()Lvn/bolierplate/App;", "setApp", "provideApp", "provideContext", "Landroid/content/Context;", "providePostRepository", "Lvn/bolierplate/network/PostRepository;", "postAPI", "Lvn/bolierplate/network/PostApi;", "appDB", "Lvn/bolierplate/db/AppDatabase;", "provideSharedPreferences", "Landroid/content/SharedPreferences;", "app_debug"})
@dagger.Module()
public final class ApplicationModule {
    @org.jetbrains.annotations.NotNull()
    private vn.bolierplate.App app;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final vn.bolierplate.App provideApp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.SharedPreferences provideSharedPreferences() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final vn.bolierplate.network.PostRepository providePostRepository(@org.jetbrains.annotations.NotNull()
    vn.bolierplate.network.PostApi postAPI, @org.jetbrains.annotations.NotNull()
    vn.bolierplate.db.AppDatabase appDB) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final vn.bolierplate.App getApp() {
        return null;
    }
    
    public final void setApp(@org.jetbrains.annotations.NotNull()
    vn.bolierplate.App p0) {
    }
    
    public ApplicationModule(@org.jetbrains.annotations.NotNull()
    vn.bolierplate.App app) {
        super();
    }
}