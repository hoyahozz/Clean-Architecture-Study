package co.kr.yapp.android.domain.repository

import co.kr.yapp.android.domain.model.Movie

interface MovieRepository {
    suspend fun getMovie(sIndex : Int, eIndex : Int): List<Movie>
}