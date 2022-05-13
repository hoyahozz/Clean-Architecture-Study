package co.kr.yapp.android.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import co.kr.yapp.android.presentation.ui.theme.CleanArchitectureTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanArchitectureTheme {
                Surface {
                    Text("Hello Clean!")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CleanPreview() {
    CleanArchitectureTheme {
        Surface {
            Text("Hello Clean!")
        }
    }
}


