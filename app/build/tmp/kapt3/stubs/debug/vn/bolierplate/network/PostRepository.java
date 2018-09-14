package vn.bolierplate.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e0\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lvn/bolierplate/network/PostRepository;", "", "postAPI", "Lvn/bolierplate/network/PostApi;", "appDB", "Lvn/bolierplate/db/AppDatabase;", "(Lvn/bolierplate/network/PostApi;Lvn/bolierplate/db/AppDatabase;)V", "repoRateLimiter", "Lvn/bolierplate/core/api/RateLimiter;", "", "getRepoRateLimiter", "()Lvn/bolierplate/core/api/RateLimiter;", "fetchPost", "Landroid/arch/lifecycle/LiveData;", "Lvn/bolierplate/core/api/Resource;", "", "Lvn/bolierplate/db/entities/Post;", "app_debug"})
public final class PostRepository {
    @org.jetbrains.annotations.NotNull()
    private final vn.bolierplate.core.api.RateLimiter<java.lang.String> repoRateLimiter = null;
    private final vn.bolierplate.network.PostApi postAPI = null;
    private final vn.bolierplate.db.AppDatabase appDB = null;
    
    @org.jetbrains.annotations.NotNull()
    public final vn.bolierplate.core.api.RateLimiter<java.lang.String> getRepoRateLimiter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<vn.bolierplate.core.api.Resource<java.util.List<vn.bolierplate.db.entities.Post>>> fetchPost() {
        return null;
    }
    
    @javax.inject.Inject()
    public PostRepository(@org.jetbrains.annotations.NotNull()
    vn.bolierplate.network.PostApi postAPI, @org.jetbrains.annotations.NotNull()
    vn.bolierplate.db.AppDatabase appDB) {
        super();
    }
}