package co.kr.yapp.android.data.service

import co.kr.yapp.android.data.model.BusModel
import retrofit2.http.GET
import retrofit2.http.Path

interface BusApi {

    @GET("json/busStopLocationXyInfo/{sIndex}/{eIndex}")
    suspend fun getBus(
        @Path("sIndex") sIndex : Int,
        @Path("eIndex") eIndex : Int
    ) : BusModel
}