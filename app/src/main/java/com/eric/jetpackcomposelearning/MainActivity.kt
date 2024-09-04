package com.eric.jetpackcomposelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnAboutColumn()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LearnAboutColumnPreview() {
    LearnAboutColumn()
}

@Composable
fun LearnAboutColumn() {
    ArtistCardRow(Artist("Artist Name", "3 min. ago"))
}

@Composable
fun ArtistCardRow(artist: Artist) {
    Column {
        Text(artist.name)
        Text(artist.lastSeenOnline)
    }
}


data class Artist (
    val name: String,
    val lastSeenOnline: String,
)