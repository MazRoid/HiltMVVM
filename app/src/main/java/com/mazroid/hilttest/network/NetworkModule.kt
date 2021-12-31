package com.mazroid.hilttest.network

import android.content.Context
import android.util.Log
import com.mazroid.hilttest.MyApplication
import com.mazroid.hilttest.util.AppConstants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.io.IOException
import java.util.concurrent.TimeUnit


@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    @Provides
    fun provideRetrofit(
        converterFactory: Converter.Factory,
        rxJava2CallAdapterFactory: RxJava2CallAdapterFactory,
        okHttpClient: OkHttpClient
    ): Retrofit = Retrofit.Builder()
        .baseUrl(AppConstants.baseUrl)
        .addConverterFactory(converterFactory)
        .addCallAdapterFactory(rxJava2CallAdapterFactory)
        .client(okHttpClient)
        .build()

//    @Singleton
//    fun provideOkHttpClient() = if (BuildConfig.DEBUG) {
//        val loggingInterceptor = HttpLoggingInterceptor()
//        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
//        OkHttpClient.Builder()
//            .addInterceptor(loggingInterceptor)
//            .build()
//    } else OkHttpClient
//        .Builder()
//        .build()


    @Provides
    fun provideNetworkServices(retrofit: Retrofit)
            : NetworkServices = retrofit.create(NetworkServices::class.java)


    @Provides
    fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }



    @Provides
    fun provideOkHttpBuilder(logger: HttpLoggingInterceptor,myApplication: MyApplication): OkHttpClient {
        val okHttpBuilder = OkHttpClient.Builder()
        val cacheSize = (40 * 1024 * 1024).toLong() //40mb
        val OKHTTP_CACHE_DIR_NAME: String = "http.cache.directory"

        fun provideCache(cacheFile: File): Cache = Cache(cacheFile, cacheSize)

         fun provideHttpCacheFile(context: Context): File {
            Log.e(
                "RETAILER_CACHE",
                "cache-Dir: ${context.cacheDir.toString() + File.separator + OKHTTP_CACHE_DIR_NAME}"
            )
            val directory =
                File(context.cacheDir.toString() + File.separator + OKHTTP_CACHE_DIR_NAME)
            if (!directory.exists())
                directory.mkdirs()
            return directory

        }

       /* okHttpBuilder.addInterceptor(object : Interceptor {
            @Throws(IOException::class)
            override fun intercept(chain: Interceptor.Chain): Response {
                val original = chain.request()
                val request = original.newBuilder()
                    .header("Accept", "application/json")
                    .header("Content-Type", "application/json")
                    .method(original.method, original.body)
                    .build()
                return chain.proceed(request)
            }
        })*/
        okHttpBuilder.cache(provideCache(provideHttpCacheFile(myApplication)))
        okHttpBuilder.addInterceptor(logger)
        okHttpBuilder.callTimeout(60, TimeUnit.SECONDS)
        okHttpBuilder.connectTimeout(60, TimeUnit.SECONDS)
        okHttpBuilder.writeTimeout(60, TimeUnit.SECONDS)
        okHttpBuilder.readTimeout(60, TimeUnit.SECONDS)
        okHttpBuilder.retryOnConnectionFailure(true)

        val okhttp = okHttpBuilder.build()
        return okhttp

    }

    @Provides
    fun provideConverterFactory(): Converter.Factory {
        return GsonConverterFactory.create()
    }

    @Provides
    fun provideRxJava2CallAdapterFactory() = RxJava2CallAdapterFactory.create()


}