package com.mazroid.hilttest.ui.model;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006!"}, d2 = {"Lcom/mazroid/hilttest/ui/model/MainUserModel;", "Landroid/os/Parcelable;", "info", "Lcom/mazroid/hilttest/ui/model/Info;", "results", "", "Lcom/mazroid/hilttest/ui/model/ResultUser;", "(Lcom/mazroid/hilttest/ui/model/Info;Ljava/util/List;)V", "getInfo", "()Lcom/mazroid/hilttest/ui/model/Info;", "setInfo", "(Lcom/mazroid/hilttest/ui/model/Info;)V", "getResults", "()Ljava/util/List;", "setResults", "(Ljava/util/List;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class MainUserModel implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "info")
    @com.google.gson.annotations.SerializedName(value = "info")
    private com.mazroid.hilttest.ui.model.Info info;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "results")
    @com.google.gson.annotations.SerializedName(value = "results")
    private java.util.List<com.mazroid.hilttest.ui.model.ResultUser> results;
    public static final android.os.Parcelable.Creator<com.mazroid.hilttest.ui.model.MainUserModel> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mazroid.hilttest.ui.model.MainUserModel copy(@org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.Info info, @org.jetbrains.annotations.NotNull()
    java.util.List<com.mazroid.hilttest.ui.model.ResultUser> results) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public MainUserModel(@org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.Info info, @org.jetbrains.annotations.NotNull()
    java.util.List<com.mazroid.hilttest.ui.model.ResultUser> results) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mazroid.hilttest.ui.model.Info component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mazroid.hilttest.ui.model.Info getInfo() {
        return null;
    }
    
    public final void setInfo(@org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.Info p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mazroid.hilttest.ui.model.ResultUser> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mazroid.hilttest.ui.model.ResultUser> getResults() {
        return null;
    }
    
    public final void setResults(@org.jetbrains.annotations.NotNull()
    java.util.List<com.mazroid.hilttest.ui.model.ResultUser> p0) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator<com.mazroid.hilttest.ui.model.MainUserModel> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.mazroid.hilttest.ui.model.MainUserModel createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.mazroid.hilttest.ui.model.MainUserModel[] newArray(int size) {
            return null;
        }
    }
}