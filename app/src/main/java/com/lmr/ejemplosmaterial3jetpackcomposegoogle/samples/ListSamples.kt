package com.lmr.ejemplosmaterial3jetpackcomposegoogle.samples

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

/**
 * Modificada para que compile, llevaba algunos parámetros con diferentes nombres.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Sampled
@Composable
fun OneLineListItem() {
    Column {
        ListItem(
            headlineText = { Text("One line list item with 24x24 icon") },
            leadingContent = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "Localized description",
                )
            }
        )
        Divider()
    }
}

/**
 * El parámetro headLineContent no existe, se cambia por headlineText.
 * El parámetro supportingContent no existe, se cambia por supportingText.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Sampled
@Composable
fun TwoLineListItem() {
    Column {
        ListItem(
            headlineText = { Text("Two line list item with trailing") },
            supportingText = { Text("Secondary text") },
            trailingContent = { Text("meta") },
            leadingContent = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "Localized description",
                )
            }
        )
        Divider()
    }
}

/**
 * El parámetro headLineContent no existe, se cambia por headlineText.
 * El parámetro supportingContent no existe, se cambia por supportingText.
 * El parámetro overlineContent no existe, se cambia por overlineText.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Sampled
@Composable
fun ThreeLineListItemWithOverlineAndSupporting() {
    Column {
        ListItem(
            headlineText = { Text("Three line list item") },
            overlineText = { Text("OVERLINE") },
            supportingText = { Text("Secondary text") },
            leadingContent = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "Localized description",
                )
            },
            trailingContent = { Text("meta") }
        )
        Divider()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Sampled
@Composable
fun ThreeLineListItemWithExtendedSupporting() {
    Column {
        ListItem(
            headlineText = { Text("Three line list item") },
            supportingText = {
                Text("Secondary text that is long and perhaps goes onto another line")
            },
            leadingContent = {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = "Localized description",
                )
            },
            trailingContent = { Text("meta") }
        )
        Divider()
    }
}
