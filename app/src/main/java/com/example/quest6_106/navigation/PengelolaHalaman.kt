package com.example.quest6_106.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.quest6_106.ui.view.viewmodel.MahasiswaViewModel
import com.example.quest6_106.ui.view.viewmodel.RencanaStudyViewModel

enum class Halaman {
    Splash,
    Mahasiswa,
    MataKuliah,
    TampilData
}

@Composable
fun NavigationControl(
    modifier: Modifier = Modifier,
    mahasiswaViewModel: MahasiswaViewModel = viewModel(),
    rencanaStudyViewModel: RencanaStudyViewModel = viewModel(),
    navController : NavHostController = rememberNavController()
) {
    val mahasiswaUiState = mahasiswaViewModel.statusUI.collectAsState().value
    var rencanaStudyState = rencanaStudyViewModel.krsStateUi.collectAsState().value

    NavHost(
        modifier = Modifier.padding(),
        navController = navController,
        startDestination = Halaman.Splash.name
    ) {

    }
}