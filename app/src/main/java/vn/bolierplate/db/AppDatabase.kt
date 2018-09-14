package vn.bolierplate.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

import vn.bolierplate.db.entities.Post
import vn.bolierplate.db.dao.PostDao


@Database(entities = [Post::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
    
}