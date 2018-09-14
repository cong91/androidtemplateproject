package vn.bolierplate.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000e"}, d2 = {"Lvn/bolierplate/di/component/ApplicationComponent;", "", "app", "Lvn/bolierplate/App;", "context", "Landroid/content/Context;", "inject", "", "postListActivityViewModel", "Lvn/bolierplate/ui/list/PostListViewModel;", "mainActivityViewModel", "Lvn/bolierplate/ui/main/MainActivityViewModel;", "preferences", "Landroid/content/SharedPreferences;", "app_debug"})
@dagger.Component(modules = {vn.bolierplate.di.module.ApplicationModule.class, vn.bolierplate.di.module.NetModule.class, vn.bolierplate.di.module.DatabaseModule.class, vn.bolierplate.di.module.ViewModelModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract vn.bolierplate.App app();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context context();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.SharedPreferences preferences();
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    vn.bolierplate.ui.main.MainActivityViewModel mainActivityViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    vn.bolierplate.ui.list.PostListViewModel postListActivityViewModel);
}