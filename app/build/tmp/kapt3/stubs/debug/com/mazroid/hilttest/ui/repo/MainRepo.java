package com.mazroid.hilttest.ui.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016J\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016J*\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0016\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00162\u0006\u0010\u001f\u001a\u00020\u0018R\u0014\u0010\u000b\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/mazroid/hilttest/ui/repo/MainRepo;", "", "networkServices", "Lcom/mazroid/hilttest/network/NetworkServices;", "appDatabase", "Lcom/mazroid/hilttest/database/AppDatabase;", "myApplication", "Lcom/mazroid/hilttest/MyApplication;", "gson", "Lcom/google/gson/Gson;", "(Lcom/mazroid/hilttest/network/NetworkServices;Lcom/mazroid/hilttest/database/AppDatabase;Lcom/mazroid/hilttest/MyApplication;Lcom/google/gson/Gson;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "bag", "Lio/reactivex/disposables/CompositeDisposable;", "getBag", "()Lio/reactivex/disposables/CompositeDisposable;", "setBag", "(Lio/reactivex/disposables/CompositeDisposable;)V", "getAllUser", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/mazroid/hilttest/ui/model/ResultUser;", "getFromDatabase", "insertAll", "Lio/reactivex/disposables/Disposable;", "liveData", "responseData", "replaceUser", "value", "app_debug"})
public final class MainRepo {
    private final com.mazroid.hilttest.network.NetworkServices networkServices = null;
    private final com.mazroid.hilttest.database.AppDatabase appDatabase = null;
    private final com.mazroid.hilttest.MyApplication myApplication = null;
    private final com.google.gson.Gson gson = null;
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.disposables.CompositeDisposable bag;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "MZD=={MainRepo}==";
    
    @javax.inject.Inject()
    public MainRepo(@org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.network.NetworkServices networkServices, @org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.database.AppDatabase appDatabase, @org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.MyApplication myApplication, @org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getBag() {
        return null;
    }
    
    public final void setBag(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.mazroid.hilttest.ui.model.ResultUser>> getAllUser() {
        return null;
    }
    
    private final io.reactivex.disposables.Disposable insertAll(androidx.lifecycle.MutableLiveData<java.util.List<com.mazroid.hilttest.ui.model.ResultUser>> liveData, java.util.List<com.mazroid.hilttest.ui.model.ResultUser> responseData) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.mazroid.hilttest.ui.model.ResultUser>> getFromDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.mazroid.hilttest.ui.model.ResultUser> replaceUser(@org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.ResultUser value) {
        return null;
    }
}