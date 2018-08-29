package vn.framgia.boilerplate.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import vn.framgia.boilerplate.db.entities.Post

@Dao
interface PostDao {
    @get:Query("SELECT * FROM post")
    val all: List<Post>

    @Insert
    fun insertAll(vararg users: Post)
}