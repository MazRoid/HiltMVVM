package com.mazroid.hilttest.ui.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2\u0006\u0010\f\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/mazroid/hilttest/ui/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lcom/mazroid/hilttest/ui/repo/MainRepo;", "(Lcom/mazroid/hilttest/ui/repo/MainRepo;)V", "getRepo", "()Lcom/mazroid/hilttest/ui/repo/MainRepo;", "getAllUser", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/mazroid/hilttest/ui/model/ResultUser;", "replaceUser", "value", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.mazroid.hilttest.ui.repo.MainRepo repo = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.repo.MainRepo repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mazroid.hilttest.ui.repo.MainRepo getRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.mazroid.hilttest.ui.model.ResultUser>> getAllUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.mazroid.hilttest.ui.model.ResultUser> replaceUser(@org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.ResultUser value) {
        return null;
    }
}