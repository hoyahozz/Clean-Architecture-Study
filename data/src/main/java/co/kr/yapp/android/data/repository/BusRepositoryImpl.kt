package co.kr.yapp.android.data.repository

import co.kr.yapp.android.data.model.Bus
import co.kr.yapp.android.data.service.BusApi
import co.kr.yapp.android.domain.model.BusEntity
import co.kr.yapp.android.domain.repository.BusRepository
import javax.inject.Inject

class BusRepositoryImpl @Inject constructor(
    private val busApi: BusApi
) : BusRepository {
    override suspend fun getBus(sIndex: Int, eIndex: Int): List<BusEntity> {

        val response = busApi.getBus(sIndex, eIndex).busInfo.bus.map {
            Bus.toBusEntity(it)
        }

        return response
    }
}