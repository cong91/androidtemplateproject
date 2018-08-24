package congnt.bolierplate.app.androidtemplateproject.db.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\n\"\u00020\u0004H\'\u00a2\u0006\u0002\u0010\u000bR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcongnt/bolierplate/app/androidtemplateproject/db/dao/PostDao;", "", "all", "", "Lcongnt/bolierplate/app/androidtemplateproject/db/entities/Post;", "getAll", "()Ljava/util/List;", "insertAll", "", "users", "", "([Lcongnt/bolierplate/app/androidtemplateproject/db/entities/Post;)V", "app_debug"})
public abstract interface PostDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM post")
    public abstract java.util.List<congnt.bolierplate.app.androidtemplateproject.db.entities.Post> getAll();
    
    @android.arch.persistence.room.Insert()
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    congnt.bolierplate.app.androidtemplateproject.db.entities.Post... users);
}