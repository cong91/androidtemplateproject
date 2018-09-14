package vn.bolierplate.core.recyclerview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u001cB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0013\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\u001c\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0006H\u0016J\u0014\u0010\u001b\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014R\u001c\u0010\u0005\u001a\u00020\u00068\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lvn/bolierplate/core/recyclerview/SingleTypeAdapter;", "T", "Lvn/bolierplate/core/recyclerview/BaseViewAdapter;", "context", "Landroid/content/Context;", "layoutRes", "", "(Landroid/content/Context;I)V", "getLayoutRes", "()I", "setLayoutRes", "(I)V", "add", "", "viewModel", "(Ljava/lang/Object;)V", "position", "(ILjava/lang/Object;)V", "addAll", "viewModels", "", "getItemCount", "onCreateViewHolder", "Lvn/bolierplate/core/recyclerview/BindingViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "set", "Presenter", "app_debug"})
public final class SingleTypeAdapter<T extends java.lang.Object> extends vn.bolierplate.core.recyclerview.BaseViewAdapter<T> {
    private int layoutRes;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public vn.bolierplate.core.recyclerview.BindingViewHolder<?> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void add(T viewModel) {
    }
    
    public final void add(int position, T viewModel) {
    }
    
    public final void set(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> viewModels) {
    }
    
    public final void addAll(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> viewModels) {
    }
    
    @android.support.annotation.LayoutRes()
    protected final int getLayoutRes() {
        return 0;
    }
    
    protected final void setLayoutRes(int p0) {
    }
    
    public SingleTypeAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int layoutRes) {
        super(null);
    }
    
    public SingleTypeAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lvn/bolierplate/core/recyclerview/SingleTypeAdapter$Presenter;", "T", "Lvn/bolierplate/core/recyclerview/BaseViewAdapter$Listener;", "onItemClick", "", "t", "(Ljava/lang/Object;)V", "app_debug"})
    public static abstract interface Presenter<T extends java.lang.Object> extends vn.bolierplate.core.recyclerview.BaseViewAdapter.Listener {
        
        public abstract void onItemClick(T t);
    }
}