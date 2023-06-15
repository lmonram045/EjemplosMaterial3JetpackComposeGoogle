package com.lmr.ejemplosmaterial3jetpackcomposegoogle.samples

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Sampled
@Composable
fun SurfaceSample() {
    Surface {
        Text("Text on Surface")
    }
}

@Preview
@Sampled
@Composable
fun ClickableSurfaceSample() {
    var count by remember { mutableIntStateOf(0) }
    Surface(
        onClick = { count++ },
    ) {
        Text("Clickable Surface. Count: $count")
    }
}

@Preview
@Sampled
@Composable
fun SelectableSurfaceSample() {
    var selected by remember { mutableStateOf(false) }
    Surface(
        selected = selected,
        onClick = { selected = !selected },
    ) {
        Text(
            text = if (selected) "Selected" else "Not Selected",
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Sampled
@Composable
fun ToggleableSurfaceSample() {
    var checked by remember { mutableStateOf(false) }
    Surface(
        checked = checked,
        onCheckedChange = { checked = !checked },
        color = if (checked) {
            MaterialTheme.colorScheme.surfaceVariant
        } else {
            MaterialTheme.colorScheme.surface
        }
    ) {
        Text(
            text = if (checked) "ON" else "OFF",
            textAlign = TextAlign.Center
        )
    }
}
