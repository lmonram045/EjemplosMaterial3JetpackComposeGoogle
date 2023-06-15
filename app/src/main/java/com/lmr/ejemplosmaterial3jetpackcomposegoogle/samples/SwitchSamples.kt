package com.lmr.ejemplosmaterial3jetpackcomposegoogle.samples

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Sampled
@Composable
fun SwitchSample() {
    var checked by remember { mutableStateOf(true) }
    Switch(
        modifier = Modifier.semantics { contentDescription = "Demo" },
        checked = checked,
        onCheckedChange = { checked = it })
}

@Preview
@Sampled
@Composable
fun SwitchWithThumbIconSample() {
    var checked by remember { mutableStateOf(true) }
    // Icon isn't focusable, no need for content description
    val icon: (@Composable () -> Unit)? = if (checked) {
        {
            Icon(
                imageVector = Icons.Filled.Check,
                contentDescription = null,
                modifier = Modifier.size(SwitchDefaults.IconSize),
            )
        }
    } else {
        null
    }

    Switch(
        modifier = Modifier.semantics { contentDescription = "Demo with icon" },
        checked = checked,
        onCheckedChange = { checked = it },
        thumbContent = icon
    )
}