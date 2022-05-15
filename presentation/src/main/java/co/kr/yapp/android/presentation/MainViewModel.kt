package co.kr.yapp.android.presentation

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import co.kr.yapp.android.domain.model.BusEntity
import co.kr.yapp.android.domain.usecase.GetBusUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getBusUseCase: GetBusUseCase
) : ViewModel() {

    private val _busStations = MutableStateFlow(emptyList<BusEntity>())
    val busStations: StateFlow<List<BusEntity>> get() = _busStations

    fun getBusStationList(sIndex: Int, eIndex: Int) {
        viewModelScope.launch {
            val tmp = getBusUseCase.invoke(sIndex, eIndex)
            _busStations.value = tmp
        }
    }
}