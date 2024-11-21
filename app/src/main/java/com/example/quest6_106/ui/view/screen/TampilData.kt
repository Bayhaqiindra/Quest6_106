package com.example.quest6_106.ui.view.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.quest6_106.R
import com.example.quest6_106.model.Mahasiswa
import com.example.quest6_106.model.RencanaStudi

@Composable
fun TampilDataView(
    mahasiswa : Mahasiswa,
    rencanastudy : RencanaStudi,
    onBackButton: () -> Unit,
    onSplashButton: () -> Unit
){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = colorResource(
                    id = R.color.primary)
            )
            .padding(top = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}