package co.kr.yapp.android.domain.repository

import co.kr.yapp.android.domain.model.BusEntity
import co.kr.yapp.android.domain.model.Result

interface BusRepository {
    suspend fun getBus(sIndex : Int, eIndex : Int): Result<List<BusEntity>>
}