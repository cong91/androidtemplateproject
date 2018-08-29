package vn.framgia.boilerplate.core.recyclerview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002:\u0002\'(B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u001c\u0010!\u001a\u00020\u001e2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010#\u001a\u00020 H\u0016J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020 H\u0016J\u000e\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000eX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001aX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006)"}, d2 = {"Lvn/framgia/boilerplate/core/recyclerview/BaseViewAdapter;", "T", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lvn/framgia/boilerplate/core/recyclerview/BindingViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "listener", "Lvn/framgia/boilerplate/core/recyclerview/BaseViewAdapter$Listener;", "getListener", "()Lvn/framgia/boilerplate/core/recyclerview/BaseViewAdapter$Listener;", "setListener", "(Lvn/framgia/boilerplate/core/recyclerview/BaseViewAdapter$Listener;)V", "mCollection", "", "getMCollection", "()Ljava/util/List;", "setMCollection", "(Ljava/util/List;)V", "mDecorator", "Lvn/framgia/boilerplate/core/recyclerview/BaseViewAdapter$Decorator;", "getMDecorator", "()Lvn/framgia/boilerplate/core/recyclerview/BaseViewAdapter$Decorator;", "setMDecorator", "(Lvn/framgia/boilerplate/core/recyclerview/BaseViewAdapter$Decorator;)V", "mLayoutInflater", "Landroid/view/LayoutInflater;", "getMLayoutInflater", "()Landroid/view/LayoutInflater;", "clear", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "remove", "setDecorator", "decorator", "Decorator", "Listener", "app_debug"})
public abstract class BaseViewAdapter<T extends java.lang.Object> extends android.support.v7.widget.RecyclerView.Adapter<vn.framgia.boilerplate.core.recyclerview.BindingViewHolder<?>> {
    @org.jetbrains.annotations.NotNull()
    private final android.view.LayoutInflater mLayoutInflater = null;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<T> mCollection;
    @org.jetbrains.annotations.Nullable()
    private vn.framgia.boilerplate.core.recyclerview.BaseViewAdapter.Listener listener;
    @org.jetbrains.annotations.Nullable()
    private vn.framgia.boilerplate.core.recyclerview.BaseViewAdapter.Decorator mDecorator;
    
    @org.jetbrains.annotations.NotNull()
    protected final android.view.LayoutInflater getMLayoutInflater() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final java.util.List<T> getMCollection() {
        return null;
    }
    
    protected final void setMCollection(@org.jetbrains.annotations.Nullable()
    java.util.List<T> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final vn.framgia.boilerplate.core.recyclerview.BaseViewAdapter.Listener getListener() {
        return null;
    }
    
    protected final void setListener(@org.jetbrains.annotations.Nullable()
    vn.framgia.boilerplate.core.recyclerview.BaseViewAdapter.Listener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final vn.framgia.boilerplate.core.recyclerview.BaseViewAdapter.Decorator getMDecorator() {
        return null;
    }
    
    protected final void setMDecorator(@org.jetbrains.annotations.Nullable()
    vn.framgia.boilerplate.core.recyclerview.BaseViewAdapter.Decorator p0) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    vn.framgia.boilerplate.core.recyclerview.BindingViewHolder<?> holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public void remove(int position) {
    }
    
    public void clear() {
    }
    
    public final void setDecorator(@org.jetbrains.annotations.NotNull()
    vn.framgia.boilerplate.core.recyclerview.BaseViewAdapter.Decorator decorator) {
    }
    
    public BaseViewAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"Lvn/framgia/boilerplate/core/recyclerview/BaseViewAdapter$Listener;", "", "app_debug"})
    public static abstract interface Listener {
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lvn/framgia/boilerplate/core/recyclerview/BaseViewAdapter$Decorator;", "", "decorator", "", "holder", "Lvn/framgia/boilerplate/core/recyclerview/BindingViewHolder;", "position", "", "viewType", "app_debug"})
    public static abstract interface Decorator {
        
        public abstract void decorator(@org.jetbrains.annotations.NotNull()
        vn.framgia.boilerplate.core.recyclerview.BindingViewHolder<?> holder, int position, int viewType);
    }
}