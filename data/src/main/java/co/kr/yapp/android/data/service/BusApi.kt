package co.kr.yapp.android.data.service

import co.kr.yapp.android.data.model.BusModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface BusApi {

    @GET("json/busStopLocationXyInfo/{startIndex}/{endIndex}")
    suspend fun getBus(
        @Path("startIndex") startIndex : Int,
        @Path("endIndex") endIndex : Int
    ) : Response<BusModel>
}