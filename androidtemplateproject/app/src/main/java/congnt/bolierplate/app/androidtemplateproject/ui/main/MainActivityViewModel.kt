package congnt.bolierplate.app.androidtemplateproject.ui.main

import android.app.Application
import congnt.bolierplate.app.androidtemplateproject.db.AppDatabase
import congnt.bolierplate.app.androidtemplateproject.R
import congnt.bolierplate.app.androidtemplateproject.App
import congnt.bolierplate.app.androidtemplateproject.core.BaseViewModel
import javax.inject.Inject

class MainActivityViewModel(app: Application) : BaseViewModel(app) {
    // private var examples: LiveData<List<Example>>? = null

    @Inject
    lateinit var db: AppDatabase

    init {
        (app as? App)?.component?.inject(this)
    }

    fun getAppName() = getApplication<Application>().resources.getString(R.string.app_name)

    /* Example Usage Of LiveData
    fun getExamples(): LiveData<List<Example>> {
        if (examples == null) {
            examples = MutableLiveData<List<Note>>()
            loadExamples()
        }

        return examples!!;
    }

    private fun loadExamples() {
        examples = db.exampleDao().getExamples()
    }
    */

}