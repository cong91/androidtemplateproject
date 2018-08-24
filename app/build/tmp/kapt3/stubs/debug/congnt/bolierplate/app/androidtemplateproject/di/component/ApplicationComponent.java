package congnt.bolierplate.app.androidtemplateproject.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000e"}, d2 = {"Lcongnt/bolierplate/app/androidtemplateproject/di/component/ApplicationComponent;", "", "app", "Lcongnt/bolierplate/app/androidtemplateproject/App;", "context", "Landroid/content/Context;", "inject", "", "postListActivityViewModel", "Lcongnt/bolierplate/app/androidtemplateproject/ui/list/PostListViewModel;", "mainActivityViewModel", "Lcongnt/bolierplate/app/androidtemplateproject/ui/main/MainActivityViewModel;", "preferences", "Landroid/content/SharedPreferences;", "app_debug"})
@dagger.Component(modules = {congnt.bolierplate.app.androidtemplateproject.di.module.ApplicationModule.class, congnt.bolierplate.app.androidtemplateproject.di.module.NetModule.class, congnt.bolierplate.app.androidtemplateproject.di.module.DatabaseModule.class, congnt.bolierplate.app.androidtemplateproject.di.module.ViewModelModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract congnt.bolierplate.app.androidtemplateproject.App app();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context context();
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.SharedPreferences preferences();
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    congnt.bolierplate.app.androidtemplateproject.ui.main.MainActivityViewModel mainActivityViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    congnt.bolierplate.app.androidtemplateproject.ui.list.PostListViewModel postListActivityViewModel);
}