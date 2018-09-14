package vn.bolierplate

import vn.bolierplate.di.component.DaggerApplicationComponent
import vn.bolierplate.di.module.ApplicationModule

class App : android.app.Application() {

    val component by lazy {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}

