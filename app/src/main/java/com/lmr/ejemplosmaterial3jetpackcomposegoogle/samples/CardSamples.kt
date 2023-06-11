package com.lmr.ejemplosmaterial3jetpackcomposegoogle.samples

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun CardSample() {
    Card(Modifier.size(width = 180.dp, height = 100.dp)) {
        // Card content
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun ClickableCardSample() {
    Card(
        onClick = { /* Do something */ },
        modifier = Modifier.size(width = 180.dp, height = 100.dp)
    ) {
        Box(Modifier.fillMaxSize()) {
            Text("Clickable", Modifier.align(Alignment.Center))
        }
    }
}

@Preview
@Composable
fun ElevatedCardSample() {
    ElevatedCard(Modifier.size(width = 180.dp, height = 100.dp)) {
        // Card content
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun ClickableElevatedCardSample() {
    ElevatedCard(
        onClick = { /* Do something */ },
        modifier = Modifier.size(width = 180.dp, height = 100.dp)
    ) {
        Box(Modifier.fillMaxSize()) {
            Text("Clickable", Modifier.align(Alignment.Center))
        }
    }
}

@Preview
@Composable
fun OutlinedCardSample() {
    OutlinedCard(Modifier.size(width = 180.dp, height = 100.dp)) {
        // Card content
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun ClickableOutlinedCardSample() {
    OutlinedCard(
        onClick = { /* Do something */ },
        modifier = Modifier.size(width = 180.dp, height = 100.dp)
    ) {
        Box(Modifier.fillMaxSize()) {
            Text("Clickable", Modifier.align(Alignment.Center))
        }
    }
}
