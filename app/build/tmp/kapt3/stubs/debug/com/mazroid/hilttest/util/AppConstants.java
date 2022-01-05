package com.mazroid.hilttest.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/mazroid/hilttest/util/AppConstants;", "", "()V", "Companion", "Status", "app_debug"})
public final class AppConstants {
    @org.jetbrains.annotations.NotNull()
    public static final com.mazroid.hilttest.util.AppConstants.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String baseUrl = "https://randomuser.me/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_NAME = "mazroidTest";
    
    public AppConstants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/mazroid/hilttest/util/AppConstants$Status;", "", "()V", "ACCEPTED", "", "PENDING", "REJECTED", "app_debug"})
    public static final class Status {
        @org.jetbrains.annotations.NotNull()
        public static final com.mazroid.hilttest.util.AppConstants.Status INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String ACCEPTED = "ACCEPTED";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String REJECTED = "REJECTED";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PENDING = "PENDING";
        
        private Status() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/mazroid/hilttest/util/AppConstants$Companion;", "", "()V", "DATABASE_NAME", "", "baseUrl", "getBaseUrl", "()Ljava/lang/String;", "setBaseUrl", "(Ljava/lang/String;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBaseUrl() {
            return null;
        }
        
        public final void setBaseUrl(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
}