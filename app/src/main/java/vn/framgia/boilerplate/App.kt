package vn.framgia.boilerplate

import vn.framgia.boilerplate.di.component.DaggerApplicationComponent
import vn.framgia.boilerplate.di.module.ApplicationModule

class App : android.app.Application() {

    val component by lazy {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}

