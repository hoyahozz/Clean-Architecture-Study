package co.kr.yapp.android.data.model

import co.kr.yapp.android.domain.model.BusEntity
import com.google.gson.annotations.SerializedName

data class BusModel(
    @SerializedName("busStopLocationXyInfo")
    val busInfo : BusInfo
)

data class BusInfo(
    @SerializedName("row")
    val bus: List<Bus>
)

data class Bus(
    @SerializedName("STOP_NO")
    val number: Int,
    @SerializedName("STOP_NM")
    val name: String,
    @SerializedName("XCODE")
    val xCoordinate: String,
    @SerializedName("YCODE")
    val yCoordinate: String
) {
    companion object {
        fun toBusEntity(busModel: Bus): BusEntity {
            return BusEntity(
                name = busModel.name,
                xCoordinate = busModel.xCoordinate,
                yCoordinate = busModel.yCoordinate
            )
        }
    }
}


/*
{
   "busStopLocationXyInfo":{
      "list_total_count":11315,
      "RESULT":{
         "CODE":"INFO-000",
         "MESSAGE":"정상 처리되었습니다"
      },
      "row":[
         {
            "STOP_NO":"1191",
            "STOP_NM":"종로1가",
            "XCODE":"126.980187",
            "YCODE":"37.5704"
         }
      ]
   }
}
 */