package vn.bolierplate.db.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\'\u00a8\u0006\t"}, d2 = {"Lvn/bolierplate/db/dao/PostDao;", "", "getAllPosts", "Landroid/arch/lifecycle/LiveData;", "", "Lvn/bolierplate/db/entities/Post;", "insertAll", "", "posts", "app_debug"})
public abstract interface PostDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM post")
    public abstract android.arch.lifecycle.LiveData<java.util.List<vn.bolierplate.db.entities.Post>> getAllPosts();
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<vn.bolierplate.db.entities.Post> posts);
}