package co.kr.yapp.android.domain.repository

import co.kr.yapp.android.domain.model.BusEntity

interface BusRepository {
    suspend fun getBus(sIndex : Int, eIndex : Int): List<BusEntity>
}