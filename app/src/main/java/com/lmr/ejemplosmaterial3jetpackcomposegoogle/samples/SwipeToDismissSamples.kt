package com.lmr.ejemplosmaterial3jetpackcomposegoogle.samples

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.material3.DismissValue.Default
import androidx.compose.material3.DismissValue.DismissedToEnd
import androidx.compose.material3.DismissValue.DismissedToStart
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.SwipeToDismiss
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDismissState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Sampled
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun SwipeToDismissListItems() {
    val dismissState = rememberDismissState()
    SwipeToDismiss(
        state = dismissState,
        background = {
            val color by animateColorAsState(
                when (dismissState.targetValue) {
                    Default -> Color.LightGray
                    DismissedToEnd -> Color.Green
                    DismissedToStart -> Color.Red
                }
            )
            Box(Modifier.fillMaxSize().background(color))
        },
        dismissContent = {
            Card {
                ListItem(
                    headlineContent = {
                        Text("Cupcake")
                    },
                    supportingContent = { Text("Swipe me left or right!") }
                )
                Divider()
            }
        }
    )
}