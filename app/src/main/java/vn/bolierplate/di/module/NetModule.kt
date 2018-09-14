package vn.bolierplate.di.module

import android.os.Environment
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import javax.inject.Named
import javax.inject.Singleton
import okhttp3.Cache
import java.util.concurrent.TimeUnit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit
import com.google.gson.Gson
import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder

import vn.bolierplate.network.PostApi
import vn.bolierplate.BuildConfig
import vn.bolierplate.core.api.LiveDataCallAdapterFactory
import vn.bolierplate.network.PostRepository
import okhttp3.logging.HttpLoggingInterceptor



@Module
class NetModule {
    @Singleton
    @Provides
    @Named("cached")
    fun provideOkHttpClient(): OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        val cache = Cache(Environment.getDownloadCacheDirectory(), 10 * 1024 * 1024)
        return OkHttpClient.Builder().addInterceptor(interceptor)
                .readTimeout(1, TimeUnit.MINUTES)
                .writeTimeout(1, TimeUnit.MINUTES)
                .cache(cache)
                .build()
    }

    @Singleton
    @Provides
    @Named("non_cached")
    fun provideNonCachedOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
                .readTimeout(1, TimeUnit.MINUTES)
                .writeTimeout(1, TimeUnit.MINUTES)
                .build()
    }

    @Provides
    @Singleton
    fun provideGson(): Gson {
        val gsonBuilder = GsonBuilder()
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        return gsonBuilder.create()
    }

    @Singleton
    @Provides
    fun provideRetrofit(gson: Gson, @Named("cached") client: OkHttpClient): Retrofit.Builder {
        return Retrofit.Builder()
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(LiveDataCallAdapterFactory())
    }

    @Provides
    @Singleton
    fun provideService(builder: Retrofit.Builder): PostApi {
        return builder.baseUrl(BuildConfig.API_URL)
                .build()
                .create(PostApi::class.java)
    }
}