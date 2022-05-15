package co.kr.yapp.android.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.kr.yapp.android.domain.model.BusEntity
import co.kr.yapp.android.presentation.ui.theme.CleanArchitectureTheme
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun MainScreen(
    viewModel: MainViewModel = hiltViewModel(),
) {
    viewModel.getBusStationList(1, 200)
    val busState by viewModel.busStations.collectAsState()

    CleanArchitectureTheme {
        Scaffold(
            topBar = { TopAppBar(title = { Text("Clean Architecture Sample") }) }
        ) {
            SimpleBusList(busState)
        }
    }
}

@Composable
fun SimpleBusList(buses: List<BusEntity>) {
    LazyColumn(modifier = Modifier.padding(8.dp)) {
        items(items = buses) { bus ->
            BusCard(bus)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CleanPreview(viewModel: MainViewModel = hiltViewModel()) {
    CleanArchitectureTheme {
        MainScreen(viewModel)
    }
}
