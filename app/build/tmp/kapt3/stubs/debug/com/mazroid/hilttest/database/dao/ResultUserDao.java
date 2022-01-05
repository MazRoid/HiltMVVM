package com.mazroid.hilttest.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\'J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\'J\u0018\u0010\u000b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\'\u00a8\u0006\f"}, d2 = {"Lcom/mazroid/hilttest/database/dao/ResultUserDao;", "", "deleteAll", "", "getAll", "Lio/reactivex/Single;", "", "Lcom/mazroid/hilttest/ui/model/ResultUser;", "insert", "", "list", "insertAll", "app_debug"})
public abstract interface ResultUserDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ResultUser")
    public abstract io.reactivex.Single<java.util.List<com.mazroid.hilttest.ui.model.ResultUser>> getAll();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.Nullable()
    com.mazroid.hilttest.ui.model.ResultUser list);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.Nullable()
    java.util.List<com.mazroid.hilttest.ui.model.ResultUser> list);
    
    @androidx.room.Query(value = "DELETE FROM ResultUser")
    public abstract int deleteAll();
}