package vn.framgia.boilerplate.di.module

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import vn.framgia.boilerplate.core.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

import vn.framgia.boilerplate.ui.list.PostListViewModel
import vn.framgia.boilerplate.ui.login.LoginViewModel
import vn.framgia.boilerplate.ui.login.RegisterViewModel

@Module
abstract class ViewModelModule {

	
    @Binds
    @IntoMap
    @ViewModelKey( PostListViewModel::class )
    // Bind your View Model here
    abstract fun bindPostListViewModel( mainViewModel: PostListViewModel ): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey( LoginViewModel::class )
    // Bind your View Model here
    abstract fun bindLoginActivityViewModel( loginViewModel: LoginViewModel ): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey( RegisterViewModel::class )
    // Bind your View Model here
    abstract fun bindRegisterFragmentViewModel( registerFragmentViewModel: RegisterViewModel): ViewModel


    @Binds
    abstract fun bindViewModelFactory( factory: ViewModelFactory):
            ViewModelProvider.Factory

}