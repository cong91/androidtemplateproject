package vn.bolierplate.utils.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a&\u0010\u0007\u001a\u00020\b*\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\b\rH\u0086\b\u001a&\u0010\u000e\u001a\u00020\u0001*\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u000b\u00a2\u0006\u0002\b\rH\u0086\b\u001a\u001a\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u00a8\u0006\u0017"}, d2 = {"addFragment", "", "Landroid/support/v7/app/AppCompatActivity;", "fragment", "Landroid/support/v4/app/Fragment;", "frameId", "", "alertDialog", "Landroid/support/v7/app/AlertDialog;", "Landroid/app/Activity;", "body", "Lkotlin/Function1;", "Landroid/support/v7/app/AlertDialog$Builder;", "Lkotlin/ExtensionFunctionType;", "inTransaction", "Landroid/support/v4/app/FragmentManager;", "func", "Landroid/support/v4/app/FragmentTransaction;", "replaceFragment", "toast", "message", "", "duration", "app_debug"})
public final class ActivityExtKt {
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    android.app.Activity $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence message, int duration) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.support.v7.app.AlertDialog alertDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.support.v7.app.AlertDialog.Builder, ? extends android.support.v7.app.AlertDialog.Builder> body) {
        return null;
    }
    
    public static final void inTransaction(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.FragmentManager $receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.support.v4.app.FragmentTransaction, ? extends android.support.v4.app.FragmentTransaction> func) {
    }
    
    public static final void addFragment(@org.jetbrains.annotations.NotNull()
    android.support.v7.app.AppCompatActivity $receiver, @org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment, int frameId) {
    }
    
    public static final void replaceFragment(@org.jetbrains.annotations.NotNull()
    android.support.v7.app.AppCompatActivity $receiver, @org.jetbrains.annotations.NotNull()
    android.support.v4.app.Fragment fragment, int frameId) {
    }
}