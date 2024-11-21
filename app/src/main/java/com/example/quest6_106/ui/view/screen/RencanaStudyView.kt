package com.example.quest6_106.ui.view.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun RencanaStudyview(
    mahasiswa: Mahasiswa,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonClicked: () -> Unit
) {
    var chosenDropdown by remember {
        mutableStateOf(
            ""
        )
    }
    var checked by remember { mutableStateOf(false) }
    var pilihankelas by remember {
        mutableStateOf("")
    }
    var listData: MutableList<String> = mutableListOf(chosenDropdown, pilihankelas)
}