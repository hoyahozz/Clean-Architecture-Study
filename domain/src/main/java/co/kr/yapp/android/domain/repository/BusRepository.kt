package co.kr.yapp.android.domain.repository

import co.kr.yapp.android.domain.model.BusEntity
import co.kr.yapp.android.domain.model.Result

interface BusRepository {
    suspend fun getBus(startIndex : Int, endIndex : Int): Result<List<BusEntity>>
}