package co.kr.yapp.android.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import co.kr.yapp.android.domain.model.BusEntity
import co.kr.yapp.android.domain.model.Result
import co.kr.yapp.android.domain.usecase.GetBusUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getBusUseCase: GetBusUseCase
) : ViewModel() {

    private val _busStations = MutableStateFlow(emptyList<BusEntity>())
    val busStations: StateFlow<List<BusEntity>> get() = _busStations

    fun getBusStationList(startIndex: Int, endIndex: Int) {
        viewModelScope.launch {
            val result = getBusUseCase(startIndex, endIndex)

            when(result) {
                is Result.Success -> _busStations.value = result.data
                is Result.Error -> result.exception
            }
        }
    }
}