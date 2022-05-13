package co.kr.yapp.android.domain.usecase

import co.kr.yapp.android.domain.model.MovieEntity
import co.kr.yapp.android.domain.repository.MovieRepository
import javax.inject.Inject

class GetMovieUseCase @Inject constructor(
    private val movieRepository: MovieRepository
) {
    suspend fun invoke(sIndex: Int, eIndex: Int): List<MovieEntity> {
        return movieRepository.getMovie(sIndex, eIndex)
    }
}