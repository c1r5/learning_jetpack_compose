package com.eric.businesscardapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eric.businesscardapp.R

@Composable
fun BusinessCard(
    photo: Int,
    name: String,
    description: String,
    phone: String,
    social: String,
    email: String,
    modifier: Modifier = Modifier
) {
    Box (
        modifier = modifier.fillMaxSize().background(Color.LightGray)
    ){
        BusinessBio(
            photo = photo,
            name = name,
            description = description,
            modifier = Modifier.align(Alignment.Center)
        )
        Contacts(
            phone = phone,
            social = social,
            email = email,
            modifier = Modifier.align(Alignment.BottomCenter)
        )
    }
}

@Composable
private fun BusinessBio (photo: Int, name: String, description: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(photo),
            contentDescription = null,
            modifier = Modifier
                .padding(bottom = 8.dp)
                .background(Color.DarkGray)
                .width(100.dp)
        )
        Text(
            text = name,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color.DarkGray
        )
        Text(
            text = description,
            color = Color.DarkGray
        )
    }
}

@Composable
private fun Contact (icon: Int, contact: String) {
    Row(
        modifier = Modifier.padding(bottom = 15.dp)
    ) {
        Image(
            painter = painterResource(icon),
            contentDescription = null,
            modifier = Modifier.padding(end = 10.dp)
        )
        Text(
            text = contact,
            color = Color.DarkGray
        )
    }
}

@Composable
private fun Contacts(
    modifier: Modifier = Modifier,
    phone: String,
    social: String,
    email: String
) {
    Column (
        modifier = modifier.padding(bottom = 20.dp)
    ){
        Contact(
            icon = R.drawable.ic_phone,
            contact = phone
        )
        Contact(
            icon = R.drawable.ic_share,
            contact = social
        )
        Contact(
            icon = R.drawable.ic_email,
            contact = email
        )
    }
}
