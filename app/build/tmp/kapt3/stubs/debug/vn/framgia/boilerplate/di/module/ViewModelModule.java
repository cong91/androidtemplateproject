package vn.framgia.boilerplate.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\'\u00a8\u0006\u0011"}, d2 = {"Lvn/framgia/boilerplate/di/module/ViewModelModule;", "", "()V", "bindLoginActivityViewModel", "Landroid/arch/lifecycle/ViewModel;", "loginViewModel", "Lvn/framgia/boilerplate/ui/login/LoginViewModel;", "bindPostListViewModel", "mainViewModel", "Lvn/framgia/boilerplate/ui/list/PostListViewModel;", "bindRegisterFragmentViewModel", "registerFragmentViewModel", "Lvn/framgia/boilerplate/ui/login/RegisterViewModel;", "bindViewModelFactory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "factory", "Lvn/framgia/boilerplate/core/ViewModelFactory;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = vn.framgia.boilerplate.ui.list.PostListViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel bindPostListViewModel(@org.jetbrains.annotations.NotNull()
    vn.framgia.boilerplate.ui.list.PostListViewModel mainViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = vn.framgia.boilerplate.ui.login.LoginViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel bindLoginActivityViewModel(@org.jetbrains.annotations.NotNull()
    vn.framgia.boilerplate.ui.login.LoginViewModel loginViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = vn.framgia.boilerplate.ui.login.RegisterViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel bindRegisterFragmentViewModel(@org.jetbrains.annotations.NotNull()
    vn.framgia.boilerplate.ui.login.RegisterViewModel registerFragmentViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    vn.framgia.boilerplate.core.ViewModelFactory factory);
    
    public ViewModelModule() {
        super();
    }
}