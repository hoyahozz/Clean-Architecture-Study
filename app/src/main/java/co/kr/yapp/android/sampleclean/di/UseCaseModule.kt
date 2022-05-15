package co.kr.yapp.android.sampleclean.di

import co.kr.yapp.android.domain.repository.BusRepository
import co.kr.yapp.android.domain.usecase.GetBusUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Singleton
    @Provides
    fun providesGetBusUseCase(repository: BusRepository): GetBusUseCase {
        return GetBusUseCase(repository)
    }
}