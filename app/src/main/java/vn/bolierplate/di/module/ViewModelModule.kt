package vn.bolierplate.di.module

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import vn.bolierplate.core.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

import vn.bolierplate.ui.list.PostListViewModel


@Module
abstract class ViewModelModule {

	
    @Binds
    @IntoMap
    @ViewModelKey( PostListViewModel::class )
    // Bind your View Model here
    abstract fun bindPostListViewModel( mainViewModel: PostListViewModel ): ViewModel
    
    


    @Binds
    abstract fun bindViewModelFactory( factory: ViewModelFactory):
            ViewModelProvider.Factory

}