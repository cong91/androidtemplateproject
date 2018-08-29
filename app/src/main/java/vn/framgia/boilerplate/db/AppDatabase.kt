package vn.framgia.boilerplate.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import vn.framgia.boilerplate.db.dao.ExampleDao
import vn.framgia.boilerplate.db.entities.Example

import vn.framgia.boilerplate.db.entities.Post
import vn.framgia.boilerplate.db.dao.PostDao


@Database(entities = arrayOf(Example::class, Post::class), version = 1)


abstract class AppDatabase : RoomDatabase() {
    abstract fun exampleDao(): ExampleDao
    
    abstract fun postDao(): PostDao
    
}