package co.kr.yapp.android.sampleclean.di

import co.kr.yapp.android.data.service.BusApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    private const val TIME_OUT_COUNT : Long = 10
    private const val API_KEY = "SET YOUR API_KEY"
    private const val BASE_URL = "http://openapi.seoul.go.kr:8088/$API_KEY/"

    @Provides
    @Singleton
    fun provideClient(): OkHttpClient  {
        return OkHttpClient.Builder()
            .connectTimeout(TIME_OUT_COUNT, TimeUnit.SECONDS)
            .readTimeout(TIME_OUT_COUNT, TimeUnit.SECONDS)
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(client: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
    }

    @Provides
    @Singleton
    fun provideApi(retrofit: Retrofit): BusApi {
        return retrofit.create(BusApi::class.java)
    }
}