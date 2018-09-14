package vn.bolierplate.network;

import java.lang.System;

/**
 * * The interface which provides methods to get result of webservices
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00040\u0003H\'\u00a8\u0006\b"}, d2 = {"Lvn/bolierplate/network/PostApi;", "", "getPosts", "Landroid/arch/lifecycle/LiveData;", "Lvn/bolierplate/core/api/ApiResponse;", "Lvn/bolierplate/core/api/Resource;", "", "Lvn/bolierplate/db/entities/Post;", "app_debug"})
public abstract interface PostApi {
    
    /**
     * * Get the list of the pots from the API
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/bins/chc9c")
    public abstract android.arch.lifecycle.LiveData<vn.bolierplate.core.api.ApiResponse<vn.bolierplate.core.api.Resource<java.util.List<vn.bolierplate.db.entities.Post>>>> getPosts();
}