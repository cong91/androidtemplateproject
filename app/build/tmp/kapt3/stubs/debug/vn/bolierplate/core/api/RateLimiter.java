package vn.bolierplate.core.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\bH\u0002J\u0013\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lvn/bolierplate/core/api/RateLimiter;", "KEY", "", "timeout", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(ILjava/util/concurrent/TimeUnit;)V", "", "timestamps", "Landroid/support/v4/util/ArrayMap;", "now", "reset", "", "key", "(Ljava/lang/Object;)V", "shouldFetch", "", "(Ljava/lang/Object;)Z", "app_debug"})
public final class RateLimiter<KEY extends java.lang.Object> {
    private final android.support.v4.util.ArrayMap<KEY, java.lang.Long> timestamps = null;
    private final long timeout = 0L;
    
    public final synchronized boolean shouldFetch(KEY key) {
        return false;
    }
    
    private final long now() {
        return 0L;
    }
    
    public final synchronized void reset(KEY key) {
    }
    
    public RateLimiter(int timeout, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.TimeUnit timeUnit) {
        super();
    }
}