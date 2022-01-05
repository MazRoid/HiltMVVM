package com.mazroid.hilttest.network;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J \u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0007J\u0010\u0010\u0015\u001a\n \u0016*\u0004\u0018\u00010\u00130\u0013H\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/mazroid/hilttest/network/NetworkModule;", "", "()V", "provideConverterFactory", "Lretrofit2/Converter$Factory;", "provideLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideNetworkServices", "Lcom/mazroid/hilttest/network/NetworkServices;", "retrofit", "Lretrofit2/Retrofit;", "provideOkHttpBuilder", "Lokhttp3/OkHttpClient;", "logger", "myApplication", "Lcom/mazroid/hilttest/MyApplication;", "provideRetrofit", "converterFactory", "rxJava2CallAdapterFactory", "Lretrofit2/adapter/rxjava2/RxJava2CallAdapterFactory;", "okHttpClient", "provideRxJava2CallAdapterFactory", "kotlin.jvm.PlatformType", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.mazroid.hilttest.network.NetworkModule INSTANCE = null;
    
    private NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    retrofit2.Converter.Factory converterFactory, @org.jetbrains.annotations.NotNull()
    retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory rxJava2CallAdapterFactory, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.mazroid.hilttest.network.NetworkServices provideNetworkServices(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor provideLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpBuilder(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor logger, @org.jetbrains.annotations.NotNull()
    com.mazroid.hilttest.MyApplication myApplication) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final retrofit2.Converter.Factory provideConverterFactory() {
        return null;
    }
    
    @dagger.Provides()
    public final retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory provideRxJava2CallAdapterFactory() {
        return null;
    }
}