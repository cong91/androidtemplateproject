package vn.framgia.boilerplate.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010$\u001a\u00020%J\b\u0010&\u001a\u00020%H\u0014J\u0010\u0010\'\u001a\u00020%2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020%H\u0002J\b\u0010+\u001a\u00020%H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lvn/framgia/boilerplate/ui/list/PostListViewModel;", "Lvn/framgia/boilerplate/core/BaseViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "db", "Lvn/framgia/boilerplate/db/AppDatabase;", "getDb", "()Lvn/framgia/boilerplate/db/AppDatabase;", "setDb", "(Lvn/framgia/boilerplate/db/AppDatabase;)V", "errorClickListener", "Landroid/view/View$OnClickListener;", "getErrorClickListener", "()Landroid/view/View$OnClickListener;", "errorMessage", "Landroid/arch/lifecycle/MutableLiveData;", "", "getErrorMessage", "()Landroid/arch/lifecycle/MutableLiveData;", "loadingVisibility", "getLoadingVisibility", "postApi", "Lvn/framgia/boilerplate/network/PostApi;", "getPostApi", "()Lvn/framgia/boilerplate/network/PostApi;", "setPostApi", "(Lvn/framgia/boilerplate/network/PostApi;)V", "posts", "", "Lvn/framgia/boilerplate/db/entities/Post;", "getPosts", "setPosts", "(Landroid/arch/lifecycle/MutableLiveData;)V", "subscription", "Lio/reactivex/disposables/Disposable;", "loadPosts", "", "onCleared", "onRetrievePostListError", "error", "", "onRetrievePostListFinish", "onRetrievePostListStart", "app_debug"})
public final class PostListViewModel extends vn.framgia.boilerplate.core.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public vn.framgia.boilerplate.db.AppDatabase db;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public vn.framgia.boilerplate.network.PostApi postApi;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Integer> loadingVisibility = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Integer> errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View.OnClickListener errorClickListener = null;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.util.List<vn.framgia.boilerplate.db.entities.Post>> posts;
    private io.reactivex.disposables.Disposable subscription;
    
    @org.jetbrains.annotations.NotNull()
    public final vn.framgia.boilerplate.db.AppDatabase getDb() {
        return null;
    }
    
    public final void setDb(@org.jetbrains.annotations.NotNull()
    vn.framgia.boilerplate.db.AppDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final vn.framgia.boilerplate.network.PostApi getPostApi() {
        return null;
    }
    
    public final void setPostApi(@org.jetbrains.annotations.NotNull()
    vn.framgia.boilerplate.network.PostApi p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Integer> getLoadingVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Integer> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View.OnClickListener getErrorClickListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.util.List<vn.framgia.boilerplate.db.entities.Post>> getPosts() {
        return null;
    }
    
    public final void setPosts(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.util.List<vn.framgia.boilerplate.db.entities.Post>> p0) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void loadPosts() {
    }
    
    private final void onRetrievePostListStart() {
    }
    
    private final void onRetrievePostListFinish() {
    }
    
    private final void onRetrievePostListError(java.lang.Throwable error) {
    }
    
    @javax.inject.Inject()
    public PostListViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}