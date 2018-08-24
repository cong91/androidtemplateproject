package congnt.bolierplate.app.androidtemplateproject.di.module

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import congnt.bolierplate.app.androidtemplateproject.core.ViewModelFactory
import congnt.bolierplate.app.androidtemplateproject.ui.list.PostListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

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