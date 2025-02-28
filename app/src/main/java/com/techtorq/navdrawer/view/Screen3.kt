package com.techtorq.navdrawer.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun Screen3(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxWidth().background(MaterialTheme.colorScheme.background),
        contentAlignment = Alignment.Center,){
        Text(text = "Screen 3")
    }
}