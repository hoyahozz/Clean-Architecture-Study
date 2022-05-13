package co.kr.yapp.android.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.kr.yapp.android.presentation.ui.theme.CleanArchitectureTheme

@Composable
fun MainScreen() {
    CleanArchitectureTheme() {
        val sampleBusList = listOf("종로1가", "종로2가사거리", "창경궁.서울대학교병원", "명륜3가.성대입구", "종로2가.삼일교")

        Scaffold(
            topBar = { TopAppBar(title = { Text("Clean Architecture Sample") }) }
        ) {
            SimpleBusList(sampleBusList)
        }
    }
}

@Composable
fun SimpleBusList(names: List<String>) {
    LazyColumn(modifier = Modifier.padding(8.dp)) {
        items(items = names) { name ->
            BusCard(name)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CleanPreview() {
    CleanArchitectureTheme {
        MainScreen()
    }
}
