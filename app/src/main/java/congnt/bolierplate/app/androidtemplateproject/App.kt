package congnt.bolierplate.app.androidtemplateproject

import congnt.bolierplate.app.androidtemplateproject.di.component.DaggerApplicationComponent
import congnt.bolierplate.app.androidtemplateproject.di.module.ApplicationModule

class App : android.app.Application() {

    val component by lazy {
        DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()
    }
}

