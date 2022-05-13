package co.kr.yapp.android.domain.repository

import co.kr.yapp.android.domain.model.MovieEntity

interface MovieRepository {
    suspend fun getMovie(sIndex : Int, eIndex : Int): List<MovieEntity>
}