package co.kr.yapp.android.data.repository

import co.kr.yapp.android.data.model.Bus
import co.kr.yapp.android.data.service.BusApi
import co.kr.yapp.android.domain.model.BusEntity
import co.kr.yapp.android.domain.repository.BusRepository
import co.kr.yapp.android.domain.model.Result
import javax.inject.Inject


class BusRepositoryImpl @Inject constructor(
    private val busApi: BusApi
) : BusRepository {
    override suspend fun getBus(startIndex: Int, endIndex: Int): Result<List<BusEntity>> {

        val response = busApi.getBus(startIndex, endIndex)
        return try {
            if (response.isSuccessful) {
                return Result.Success(response.body()!!.busInfo.bus.map{
                    Bus.toBusEntity(it)
                })
            } else {
                Result.Error(IllegalArgumentException("버스 리스트를 찾을 수 없습니다."))
            }
        } catch (e: Exception) {
            Result.Error(e)
        }
    }
}