package vn.bolierplate.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0012\u0010\u0015\u001a\u00020\u00112\b\b\u0001\u0010\u0016\u001a\u00020\u000fH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lvn/bolierplate/ui/list/PostListActivity;", "Lvn/bolierplate/core/BaseActivity;", "Lvn/bolierplate/ui/list/PostListViewModel;", "error/NonExistentClass", "()V", "errorSnackbar", "Landroid/support/design/widget/Snackbar;", "observerPost", "Landroid/arch/lifecycle/Observer;", "Lvn/bolierplate/core/api/Resource;", "", "Lvn/bolierplate/db/entities/Post;", "postsAdapter", "Lvn/bolierplate/core/recyclerview/SingleTypeAdapter;", "getLayoutRes", "", "hideError", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showError", "errorMessage", "app_debug"})
public final class PostListActivity extends vn.bolierplate.core.BaseActivity<vn.bolierplate.ui.list.PostListViewModel, error.NonExistentClass> {
    private android.arch.lifecycle.Observer<vn.bolierplate.core.api.Resource<java.util.List<vn.bolierplate.db.entities.Post>>> observerPost;
    private android.support.design.widget.Snackbar errorSnackbar;
    private vn.bolierplate.core.recyclerview.SingleTypeAdapter<vn.bolierplate.db.entities.Post> postsAdapter;
    
    @java.lang.Override()
    public int getLayoutRes() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showError(@android.support.annotation.StringRes()
    int errorMessage) {
    }
    
    private final void hideError() {
    }
    
    public PostListActivity() {
        super(null);
    }
}