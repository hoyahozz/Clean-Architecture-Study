package co.kr.yapp.android.presentation

import android.util.Log
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.kr.yapp.android.domain.model.BusEntity
import co.kr.yapp.android.presentation.ui.theme.CleanArchitectureTheme

@Composable
fun BusCard(bus: BusEntity) {
    var expandedState by remember { mutableStateOf(false) }

    Card(
        backgroundColor = MaterialTheme.colors.secondary,
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Box {
            Row(
                modifier =
                Modifier
                    .padding(24.dp)
                    .animateContentSize(
                        animationSpec = spring(
                            dampingRatio = Spring.DampingRatioMediumBouncy,
                            stiffness = Spring.StiffnessLow
                        )
                    ),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = bus.name,
                        style = MaterialTheme.typography.h6.copy(
                            fontWeight = FontWeight.ExtraBold
                        )
                    )
                    if (expandedState) {
                        Text(text = bus.xCoordinate, Modifier.padding(top = 24.dp))
                    }
                    if (expandedState) {
                        Text(text = bus.yCoordinate, Modifier.padding(top = 8.dp))
                    }
                }
                IconButton(
                    onClick = {
                        expandedState = !expandedState
                    }
                ) {
                    Icon(
                        imageVector = if(expandedState) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
                        contentDescription = "자세히 보기 컨트롤"
                    )
                }
            }
        }

    }
}

@Preview
@Composable
fun BusItemPreview() {
    CleanArchitectureTheme {
        Surface {
            BusCard(bus = BusEntity("Test", "101.1213", "202.2123"))
        }
    }
}