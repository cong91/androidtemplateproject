package vn.bolierplate.db;

import java.lang.System;

@android.arch.persistence.room.Database(entities = {vn.bolierplate.db.entities.Post.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lvn/bolierplate/db/AppDatabase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "postDao", "Lvn/bolierplate/db/dao/PostDao;", "app_debug"})
public abstract class AppDatabase extends android.arch.persistence.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract vn.bolierplate.db.dao.PostDao postDao();
    
    public AppDatabase() {
        super();
    }
}