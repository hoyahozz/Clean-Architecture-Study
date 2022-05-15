package co.kr.yapp.android.sampleclean.di

import co.kr.yapp.android.data.repository.BusRepositoryImpl
import co.kr.yapp.android.domain.repository.BusRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun providesBusRepository(repositoryImpl: BusRepositoryImpl): BusRepository {
        return repositoryImpl
    }
}