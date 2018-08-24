package congnt.bolierplate.app.androidtemplateproject.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import congnt.bolierplate.app.androidtemplateproject.db.dao.ExampleDao
import congnt.bolierplate.app.androidtemplateproject.db.dao.PostDao
import congnt.bolierplate.app.androidtemplateproject.db.entities.Example
import congnt.bolierplate.app.androidtemplateproject.db.entities.Post

@Database(entities = arrayOf(Example::class, Post::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exampleDao(): ExampleDao
    abstract fun postDao(): PostDao
}