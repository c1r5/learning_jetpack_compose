package com.eric.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.eric.businesscardapp.ui.BusinessCard
import com.eric.businesscardapp.ui.theme.JetpackComposeLearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeLearningTheme {
                BusinessCard(
                    photo = R.drawable.android_logo,
                    name = "Eric Joseph",
                    description = "Android Developer",
                    phone = "+55 47 989112392",
                    social = "@c1r5",
                    email = "contato.ericjoseph@gmail.com"
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    JetpackComposeLearningTheme {
        BusinessCard(
            photo = R.drawable.android_logo,
            name = "Eric Joseph",
            description = "Android Developer",
            phone = "+55 47 989112392",
            social = "github@c1r5",
            email = "contato.ericjoseph@gmail.com"
        )
    }
}