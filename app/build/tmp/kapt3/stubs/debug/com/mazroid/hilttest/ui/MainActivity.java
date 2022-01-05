package com.mazroid.hilttest.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\fH\u0016J\u0012\u0010#\u001a\u00020\u001e2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\u0018\u0010&\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\fH\u0016J\u0018\u0010\'\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\fH\u0016J\u0016\u0010\b\u001a\u00020\u001e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0016\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+2\u0006\u0010\"\u001a\u00020\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006,"}, d2 = {"Lcom/mazroid/hilttest/ui/MainActivity;", "Lcom/mazroid/hilttest/util/BaseActivity;", "Lcom/mazroid/hilttest/ui/adapter/MainAdapter$MainAdapterCallback;", "()V", "adapter", "Lcom/mazroid/hilttest/ui/adapter/MainAdapter;", "getAdapter", "()Lcom/mazroid/hilttest/ui/adapter/MainAdapter;", "setAdapter", "(Lcom/mazroid/hilttest/ui/adapter/MainAdapter;)V", "adapterList", "", "Lcom/mazroid/hilttest/ui/model/ResultUser;", "getAdapterList", "()Ljava/util/List;", "setAdapterList", "(Ljava/util/List;)V", "binding", "Lcom/mazroid/hilttest/databinding/ActivityMainBinding;", "getBinding", "()Lcom/mazroid/hilttest/databinding/ActivityMainBinding;", "setBinding", "(Lcom/mazroid/hilttest/databinding/ActivityMainBinding;)V", "viewModel", "Lcom/mazroid/hilttest/ui/viewmodel/MainViewModel;", "getViewModel", "()Lcom/mazroid/hilttest/ui/viewmodel/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initialize", "", "onAccept", "position", "", "value", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onReject", "onTapped", "list", "updateUser", "isAccepted", "", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends com.mazroid.hilttest.util.BaseActivity implements com.mazroid.hilttest.ui.adapter.MainAdapter.MainAdapterCallback {
    public com.mazroid.hilttest.databinding.ActivityMainBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.mazroid.hilttest.ui.adapter.MainAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.mazroid.hilttest.ui.model.ResultUser> adapterList;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mazroid.hilttest.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.databinding.ActivityMainBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.mazroid.hilttest.ui.adapter.MainAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.Nullable()
    com.mazroid.hilttest.ui.adapter.MainAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mazroid.hilttest.ui.viewmodel.MainViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mazroid.hilttest.ui.model.ResultUser> getAdapterList() {
        return null;
    }
    
    public final void setAdapterList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mazroid.hilttest.ui.model.ResultUser> p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initialize() {
    }
    
    private final void setAdapter(java.util.List<com.mazroid.hilttest.ui.model.ResultUser> list) {
    }
    
    public final void updateUser(boolean isAccepted, @org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.ResultUser value) {
    }
    
    @java.lang.Override()
    public void onTapped(int position, @org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.ResultUser value) {
    }
    
    @java.lang.Override()
    public void onAccept(int position, @org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.ResultUser value) {
    }
    
    @java.lang.Override()
    public void onReject(int position, @org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.ResultUser value) {
    }
}