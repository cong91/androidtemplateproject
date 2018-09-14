package vn.bolierplate.core.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\tJ\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\tH%J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\tH%J\b\u0010\u0010\u001a\u00020\rH\u0014J\u001d\u0010\u0011\u001a\u0004\u0018\u00018\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0003\u00a2\u0006\u0002\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00028\u0001H%\u00a2\u0006\u0002\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00018\u0000H%\u00a2\u0006\u0002\u0010\u001aR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lvn/bolierplate/core/api/NetworkBoundResource;", "ResultType", "RequestType", "", "()V", "result", "Landroid/arch/lifecycle/MediatorLiveData;", "Lvn/bolierplate/core/api/Resource;", "asLiveData", "Landroid/arch/lifecycle/LiveData;", "createCall", "Lvn/bolierplate/core/api/ApiResponse;", "fetchFromNetwork", "", "dbSource", "loadFromDb", "onFetchFailed", "processResponse", "response", "(Lvn/bolierplate/core/api/ApiResponse;)Ljava/lang/Object;", "saveCallResult", "item", "(Ljava/lang/Object;)V", "shouldFetch", "", "data", "(Ljava/lang/Object;)Z", "app_debug"})
public abstract class NetworkBoundResource<ResultType extends java.lang.Object, RequestType extends java.lang.Object> {
    private final android.arch.lifecycle.MediatorLiveData<vn.bolierplate.core.api.Resource<ResultType>> result = null;
    
    private final void fetchFromNetwork(android.arch.lifecycle.LiveData<ResultType> dbSource) {
    }
    
    protected void onFetchFailed() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<vn.bolierplate.core.api.Resource<ResultType>> asLiveData() {
        return null;
    }
    
    @android.support.annotation.WorkerThread()
    private final RequestType processResponse(vn.bolierplate.core.api.ApiResponse<RequestType> response) {
        return null;
    }
    
    @android.support.annotation.WorkerThread()
    protected abstract void saveCallResult(RequestType item);
    
    @android.support.annotation.MainThread()
    protected abstract boolean shouldFetch(@org.jetbrains.annotations.Nullable()
    ResultType data);
    
    @org.jetbrains.annotations.NotNull()
    @android.support.annotation.MainThread()
    protected abstract android.arch.lifecycle.LiveData<ResultType> loadFromDb();
    
    @org.jetbrains.annotations.NotNull()
    @android.support.annotation.MainThread()
    protected abstract android.arch.lifecycle.LiveData<vn.bolierplate.core.api.ApiResponse<RequestType>> createCall();
    
    @android.support.annotation.MainThread()
    public NetworkBoundResource() {
        super();
    }
}