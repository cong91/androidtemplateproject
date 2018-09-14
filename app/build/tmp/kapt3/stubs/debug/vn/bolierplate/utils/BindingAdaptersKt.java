package vn.bolierplate.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0007\u001a\u001a\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u001a \u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0007\u00a8\u0006\u000f"}, d2 = {"setAdapter", "", "view", "Landroid/support/v7/widget/RecyclerView;", "adapter", "Landroid/support/v7/widget/RecyclerView$Adapter;", "setMutableText", "Landroid/widget/TextView;", "text", "", "setMutableVisibility", "Landroid/view/View;", "visibility", "Landroid/arch/lifecycle/MutableLiveData;", "", "app_debug"})
public final class BindingAdaptersKt {
    
    @android.databinding.BindingAdapter(value = {"adapter"})
    public static final void setAdapter(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView view, @org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.Adapter<?> adapter) {
    }
    
    @android.databinding.BindingAdapter(value = {"mutableVisibility"})
    public static final void setMutableVisibility(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.arch.lifecycle.MutableLiveData<java.lang.Integer> visibility) {
    }
    
    @android.databinding.BindingAdapter(value = {"mutableText"})
    public static final void setMutableText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
}