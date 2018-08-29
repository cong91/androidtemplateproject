package vn.framgia.boilerplate.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&\u00a8\u0006\u0012"}, d2 = {"Lvn/framgia/boilerplate/di/component/ApplicationComponent;", "", "app", "Lvn/framgia/boilerplate/App;", "context", "Landroid/content/Context;", "inject", "", "postListActivityViewModel", "Lvn/framgia/boilerplate/ui/list/PostListViewModel;", "loginActivityViewModel", "Lvn/framgia/boilerplate/ui/login/LoginViewModel;", "registerViewModel", "Lvn/framgia/boilerplate/ui/login/RegisterViewModel;", "mainActivityViewModel", "Lvn/framgia/boilerplate/ui/main/MainActivityViewModel;", "preferences", "Landroid/content/SharedPreferences;", "app_debug"})
@dagger.Component(modules = {vn.framgia.boilerplate.di.module.ApplicationModule.class, vn.framgia.boilerplate.di.module.NetModule.class, vn.framgia.boilerplate.di.module.DatabaseModule.class, vn.framgia.boilerplate.di.module.ViewModelModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract vn.framgia.boilerplate.App app();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context context();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.SharedPreferences preferences();
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    vn.framgia.boilerplate.ui.main.MainActivityViewModel mainActivityViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    vn.framgia.boilerplate.ui.list.PostListViewModel postListActivityViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    vn.framgia.boilerplate.ui.login.LoginViewModel loginActivityViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    vn.framgia.boilerplate.ui.login.RegisterViewModel registerViewModel);
}