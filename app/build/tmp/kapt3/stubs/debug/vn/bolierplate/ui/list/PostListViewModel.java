package vn.bolierplate.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u001e0\u001dJ\b\u0010\u001f\u001a\u00020 H\u0014J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#H\u0002J\u0006\u0010$\u001a\u00020 J\u0006\u0010%\u001a\u00020 R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u001b\u00a8\u0006&"}, d2 = {"Lvn/bolierplate/ui/list/PostListViewModel;", "Lvn/bolierplate/core/BaseViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "errorClickListener", "Landroid/view/View$OnClickListener;", "getErrorClickListener", "()Landroid/view/View$OnClickListener;", "errorMessage", "Landroid/arch/lifecycle/MutableLiveData;", "", "getErrorMessage", "()Landroid/arch/lifecycle/MutableLiveData;", "loadingVisibility", "getLoadingVisibility", "postRepository", "Lvn/bolierplate/network/PostRepository;", "getPostRepository", "()Lvn/bolierplate/network/PostRepository;", "setPostRepository", "(Lvn/bolierplate/network/PostRepository;)V", "posts", "", "Lvn/bolierplate/db/entities/Post;", "getPosts", "setPosts", "(Landroid/arch/lifecycle/MutableLiveData;)V", "loadPosts", "Landroid/arch/lifecycle/LiveData;", "Lvn/bolierplate/core/api/Resource;", "onCleared", "", "onRetrievePostListError", "error", "", "onRetrievePostListFinish", "onRetrievePostListStart", "app_debug"})
public final class PostListViewModel extends vn.bolierplate.core.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Integer> loadingVisibility = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Integer> errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final android.view.View.OnClickListener errorClickListener = null;
    @org.jetbrains.annotations.NotNull()
    private android.arch.lifecycle.MutableLiveData<java.util.List<vn.bolierplate.db.entities.Post>> posts;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public vn.bolierplate.network.PostRepository postRepository;
    
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
    public final android.arch.lifecycle.MutableLiveData<java.util.List<vn.bolierplate.db.entities.Post>> getPosts() {
        return null;
    }
    
    public final void setPosts(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.MutableLiveData<java.util.List<vn.bolierplate.db.entities.Post>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final vn.bolierplate.network.PostRepository getPostRepository() {
        return null;
    }
    
    public final void setPostRepository(@org.jetbrains.annotations.NotNull()
    vn.bolierplate.network.PostRepository p0) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<vn.bolierplate.core.api.Resource<java.util.List<vn.bolierplate.db.entities.Post>>> loadPosts() {
        return null;
    }
    
    public final void onRetrievePostListStart() {
    }
    
    public final void onRetrievePostListFinish() {
    }
    
    private final void onRetrievePostListError(java.lang.Throwable error) {
    }
    
    @javax.inject.Inject()
    public PostListViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}