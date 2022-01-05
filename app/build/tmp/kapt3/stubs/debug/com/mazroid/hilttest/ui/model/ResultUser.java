package com.mazroid.hilttest.ui.model;

import java.lang.System;

@androidx.room.Entity(tableName = "ResultUser", primaryKeys = {"email", "gender"})
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004NOPQB]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0002\u0010\u0013J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0010H\u00c6\u0003J\t\u00107\u001a\u00020\u0012H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0006H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\nH\u00c6\u0003J\t\u0010=\u001a\u00020\fH\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003Jw\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u00c6\u0001J\t\u0010A\u001a\u00020BH\u00d6\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FH\u00d6\u0003J\t\u0010G\u001a\u00020BH\u00d6\u0001J\t\u0010H\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020BH\u00d6\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0015\"\u0004\b \u0010\u0017R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0015\"\u0004\b*\u0010\u0017R\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104\u00a8\u0006R"}, d2 = {"Lcom/mazroid/hilttest/ui/model/ResultUser;", "Landroid/os/Parcelable;", "isAccepted", "", "cell", "dob", "Lcom/mazroid/hilttest/ui/model/ResultUser$Dob;", "email", "gender", "location", "Lcom/mazroid/hilttest/ui/model/UserLocation;", "name", "Lcom/mazroid/hilttest/ui/model/ResultUser$Name;", "nat", "phone", "picture", "Lcom/mazroid/hilttest/ui/model/ResultUser$Picture;", "registered", "Lcom/mazroid/hilttest/ui/model/ResultUser$Registered;", "(Ljava/lang/String;Ljava/lang/String;Lcom/mazroid/hilttest/ui/model/ResultUser$Dob;Ljava/lang/String;Ljava/lang/String;Lcom/mazroid/hilttest/ui/model/UserLocation;Lcom/mazroid/hilttest/ui/model/ResultUser$Name;Ljava/lang/String;Ljava/lang/String;Lcom/mazroid/hilttest/ui/model/ResultUser$Picture;Lcom/mazroid/hilttest/ui/model/ResultUser$Registered;)V", "getCell", "()Ljava/lang/String;", "setCell", "(Ljava/lang/String;)V", "getDob", "()Lcom/mazroid/hilttest/ui/model/ResultUser$Dob;", "setDob", "(Lcom/mazroid/hilttest/ui/model/ResultUser$Dob;)V", "getEmail", "setEmail", "getGender", "setGender", "setAccepted", "getLocation", "()Lcom/mazroid/hilttest/ui/model/UserLocation;", "setLocation", "(Lcom/mazroid/hilttest/ui/model/UserLocation;)V", "getName", "()Lcom/mazroid/hilttest/ui/model/ResultUser$Name;", "setName", "(Lcom/mazroid/hilttest/ui/model/ResultUser$Name;)V", "getNat", "setNat", "getPhone", "setPhone", "getPicture", "()Lcom/mazroid/hilttest/ui/model/ResultUser$Picture;", "setPicture", "(Lcom/mazroid/hilttest/ui/model/ResultUser$Picture;)V", "getRegistered", "()Lcom/mazroid/hilttest/ui/model/ResultUser$Registered;", "setRegistered", "(Lcom/mazroid/hilttest/ui/model/ResultUser$Registered;)V", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Dob", "Name", "Picture", "Registered", "app_debug"})
public final class ResultUser implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "isAccepted")
    private java.lang.String isAccepted;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "cell")
    @com.google.gson.annotations.SerializedName(value = "cell")
    private java.lang.String cell;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "dob")
    @com.google.gson.annotations.SerializedName(value = "dob")
    private com.mazroid.hilttest.ui.model.ResultUser.Dob dob;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "email")
    @com.google.gson.annotations.SerializedName(value = "email")
    private java.lang.String email;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "gender")
    @com.google.gson.annotations.SerializedName(value = "gender")
    private java.lang.String gender;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "location")
    @com.google.gson.annotations.SerializedName(value = "location")
    private com.mazroid.hilttest.ui.model.UserLocation location;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "name")
    @com.google.gson.annotations.SerializedName(value = "name")
    private com.mazroid.hilttest.ui.model.ResultUser.Name name;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "nat")
    @com.google.gson.annotations.SerializedName(value = "nat")
    private java.lang.String nat;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "phone")
    @com.google.gson.annotations.SerializedName(value = "phone")
    private java.lang.String phone;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "picture")
    @com.google.gson.annotations.SerializedName(value = "picture")
    private com.mazroid.hilttest.ui.model.ResultUser.Picture picture;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "registered")
    @com.google.gson.annotations.SerializedName(value = "registered")
    private com.mazroid.hilttest.ui.model.ResultUser.Registered registered;
    public static final android.os.Parcelable.Creator<com.mazroid.hilttest.ui.model.ResultUser> CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mazroid.hilttest.ui.model.ResultUser copy(@org.jetbrains.annotations.NotNull()
    java.lang.String isAccepted, @org.jetbrains.annotations.NotNull()
    java.lang.String cell, @org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.ResultUser.Dob dob, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String gender, @org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.UserLocation location, @org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.ResultUser.Name name, @org.jetbrains.annotations.NotNull()
    java.lang.String nat, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.ResultUser.Picture picture, @org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.ResultUser.Registered registered) {
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
    
    public ResultUser(@org.jetbrains.annotations.NotNull()
    java.lang.String isAccepted, @org.jetbrains.annotations.NotNull()
    java.lang.String cell, @org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.ResultUser.Dob dob, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String gender, @org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.UserLocation location, @org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.ResultUser.Name name, @org.jetbrains.annotations.NotNull()
    java.lang.String nat, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.ResultUser.Picture picture, @org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.ResultUser.Registered registered) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String isAccepted() {
        return null;
    }
    
    public final void setAccepted(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCell() {
        return null;
    }
    
    public final void setCell(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mazroid.hilttest.ui.model.ResultUser.Dob component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mazroid.hilttest.ui.model.ResultUser.Dob getDob() {
        return null;
    }
    
    public final void setDob(@org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.ResultUser.Dob p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGender() {
        return null;
    }
    
    public final void setGender(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mazroid.hilttest.ui.model.UserLocation component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mazroid.hilttest.ui.model.UserLocation getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.UserLocation p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mazroid.hilttest.ui.model.ResultUser.Name component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mazroid.hilttest.ui.model.ResultUser.Name getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.ResultUser.Name p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNat() {
        return null;
    }
    
    public final void setNat(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhone() {
        return null;
    }
    
    public final void setPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mazroid.hilttest.ui.model.ResultUser.Picture component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mazroid.hilttest.ui.model.ResultUser.Picture getPicture() {
        return null;
    }
    
    public final void setPicture(@org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.ResultUser.Picture p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mazroid.hilttest.ui.model.ResultUser.Registered component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mazroid.hilttest.ui.model.ResultUser.Registered getRegistered() {
        return null;
    }
    
    public final void setRegistered(@org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.ui.model.ResultUser.Registered p0) {
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
    public static final class Creator implements android.os.Parcelable.Creator<com.mazroid.hilttest.ui.model.ResultUser> {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.mazroid.hilttest.ui.model.ResultUser createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public final com.mazroid.hilttest.ui.model.ResultUser[] newArray(int size) {
            return null;
        }
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001e"}, d2 = {"Lcom/mazroid/hilttest/ui/model/ResultUser$Dob;", "Landroid/os/Parcelable;", "age", "", "date", "", "(ILjava/lang/String;)V", "getAge", "()I", "setAge", "(I)V", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    public static final class Dob implements android.os.Parcelable {
        @androidx.room.ColumnInfo(name = "age")
        @com.google.gson.annotations.SerializedName(value = "age")
        private int age;
        @org.jetbrains.annotations.NotNull()
        @androidx.room.ColumnInfo(name = "date")
        @com.google.gson.annotations.SerializedName(value = "date")
        private java.lang.String date;
        public static final android.os.Parcelable.Creator<com.mazroid.hilttest.ui.model.ResultUser.Dob> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mazroid.hilttest.ui.model.ResultUser.Dob copy(int age, @org.jetbrains.annotations.NotNull()
        java.lang.String date) {
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
        
        public Dob(int age, @org.jetbrains.annotations.NotNull()
        java.lang.String date) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getAge() {
            return 0;
        }
        
        public final void setAge(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDate() {
            return null;
        }
        
        public final void setDate(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.mazroid.hilttest.ui.model.ResultUser.Dob> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.mazroid.hilttest.ui.model.ResultUser.Dob createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.mazroid.hilttest.ui.model.ResultUser.Dob[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n\u00a8\u0006 "}, d2 = {"Lcom/mazroid/hilttest/ui/model/ResultUser$Name;", "Landroid/os/Parcelable;", "first", "", "last", "title", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFirst", "()Ljava/lang/String;", "setFirst", "(Ljava/lang/String;)V", "getLast", "setLast", "getTitle", "setTitle", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    public static final class Name implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        @androidx.room.ColumnInfo(name = "first")
        @com.google.gson.annotations.SerializedName(value = "first")
        private java.lang.String first;
        @org.jetbrains.annotations.NotNull()
        @androidx.room.ColumnInfo(name = "last")
        @com.google.gson.annotations.SerializedName(value = "last")
        private java.lang.String last;
        @org.jetbrains.annotations.NotNull()
        @androidx.room.ColumnInfo(name = "title")
        @com.google.gson.annotations.SerializedName(value = "title")
        private java.lang.String title;
        public static final android.os.Parcelable.Creator<com.mazroid.hilttest.ui.model.ResultUser.Name> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mazroid.hilttest.ui.model.ResultUser.Name copy(@org.jetbrains.annotations.NotNull()
        java.lang.String first, @org.jetbrains.annotations.NotNull()
        java.lang.String last, @org.jetbrains.annotations.NotNull()
        java.lang.String title) {
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
        
        public Name(@org.jetbrains.annotations.NotNull()
        java.lang.String first, @org.jetbrains.annotations.NotNull()
        java.lang.String last, @org.jetbrains.annotations.NotNull()
        java.lang.String title) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFirst() {
            return null;
        }
        
        public final void setFirst(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLast() {
            return null;
        }
        
        public final void setLast(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.mazroid.hilttest.ui.model.ResultUser.Name> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.mazroid.hilttest.ui.model.ResultUser.Name createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.mazroid.hilttest.ui.model.ResultUser.Name[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n\u00a8\u0006 "}, d2 = {"Lcom/mazroid/hilttest/ui/model/ResultUser$Picture;", "Landroid/os/Parcelable;", "large", "", "medium", "thumbnail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLarge", "()Ljava/lang/String;", "setLarge", "(Ljava/lang/String;)V", "getMedium", "setMedium", "getThumbnail", "setThumbnail", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    public static final class Picture implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        @androidx.room.ColumnInfo(name = "large")
        @com.google.gson.annotations.SerializedName(value = "large")
        private java.lang.String large;
        @org.jetbrains.annotations.NotNull()
        @androidx.room.ColumnInfo(name = "medium")
        @com.google.gson.annotations.SerializedName(value = "medium")
        private java.lang.String medium;
        @org.jetbrains.annotations.NotNull()
        @androidx.room.ColumnInfo(name = "thumbnail")
        @com.google.gson.annotations.SerializedName(value = "thumbnail")
        private java.lang.String thumbnail;
        public static final android.os.Parcelable.Creator<com.mazroid.hilttest.ui.model.ResultUser.Picture> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mazroid.hilttest.ui.model.ResultUser.Picture copy(@org.jetbrains.annotations.NotNull()
        java.lang.String large, @org.jetbrains.annotations.NotNull()
        java.lang.String medium, @org.jetbrains.annotations.NotNull()
        java.lang.String thumbnail) {
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
        
        public Picture(@org.jetbrains.annotations.NotNull()
        java.lang.String large, @org.jetbrains.annotations.NotNull()
        java.lang.String medium, @org.jetbrains.annotations.NotNull()
        java.lang.String thumbnail) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLarge() {
            return null;
        }
        
        public final void setLarge(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMedium() {
            return null;
        }
        
        public final void setMedium(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getThumbnail() {
            return null;
        }
        
        public final void setThumbnail(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.mazroid.hilttest.ui.model.ResultUser.Picture> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.mazroid.hilttest.ui.model.ResultUser.Picture createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.mazroid.hilttest.ui.model.ResultUser.Picture[] newArray(int size) {
                return null;
            }
        }
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001e"}, d2 = {"Lcom/mazroid/hilttest/ui/model/ResultUser$Registered;", "Landroid/os/Parcelable;", "age", "", "date", "", "(ILjava/lang/String;)V", "getAge", "()I", "setAge", "(I)V", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    public static final class Registered implements android.os.Parcelable {
        @androidx.room.ColumnInfo(name = "age")
        @com.google.gson.annotations.SerializedName(value = "age")
        private int age;
        @org.jetbrains.annotations.NotNull()
        @androidx.room.ColumnInfo(name = "date")
        @com.google.gson.annotations.SerializedName(value = "date")
        private java.lang.String date;
        public static final android.os.Parcelable.Creator<com.mazroid.hilttest.ui.model.ResultUser.Registered> CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mazroid.hilttest.ui.model.ResultUser.Registered copy(int age, @org.jetbrains.annotations.NotNull()
        java.lang.String date) {
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
        
        public Registered(int age, @org.jetbrains.annotations.NotNull()
        java.lang.String date) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getAge() {
            return 0;
        }
        
        public final void setAge(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDate() {
            return null;
        }
        
        public final void setDate(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
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
        public static final class Creator implements android.os.Parcelable.Creator<com.mazroid.hilttest.ui.model.ResultUser.Registered> {
            
            public Creator() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.mazroid.hilttest.ui.model.ResultUser.Registered createFromParcel(@org.jetbrains.annotations.NotNull()
            android.os.Parcel in) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public final com.mazroid.hilttest.ui.model.ResultUser.Registered[] newArray(int size) {
                return null;
            }
        }
    }
}