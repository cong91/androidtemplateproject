package congnt.bolierplate.app.androidtemplateproject.network;

import java.lang.System;

/**
 * * The interface which provides methods to get result of webservices
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'\u00a8\u0006\u0006"}, d2 = {"Lcongnt/bolierplate/app/androidtemplateproject/network/PostApi;", "", "getPosts", "Lio/reactivex/Observable;", "", "Lcongnt/bolierplate/app/androidtemplateproject/db/entities/Post;", "app_debug"})
public abstract interface PostApi {
    
    /**
     * * Get the list of the pots from the API
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/posts")
    public abstract io.reactivex.Observable<java.util.List<congnt.bolierplate.app.androidtemplateproject.db.entities.Post>> getPosts();
}