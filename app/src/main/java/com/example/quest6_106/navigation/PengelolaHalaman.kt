package com.example.quest6_106.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.quest6_106.ui.view.screen.MahasiswaFormView
import com.example.quest6_106.ui.view.screen.RencanaStudyview
import com.example.quest6_106.ui.view.screen.SplashView
import com.example.quest6_106.ui.view.screen.TampilDataView
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
        composable(
            route = Halaman.Splash.name
        ) {
            SplashView(onMulaiButton = {
                navController.navigate(
                    Halaman.Mahasiswa.name
                )
            })
        }
        composable(route = Halaman.Mahasiswa.name) {
            MahasiswaFormView(
                onSubmitButtonClicked = {mahasiswaViewModel.saveDataSiswa(it)
                    navController.navigate(
                        Halaman.MataKuliah.name
                    )},
                onBackButtonClicked = {navController.popBackStack()}
            )
        }
        composable(route = Halaman.MataKuliah.name) {
            RencanaStudyview(
                mahasiswa = mahasiswaUiState,
                onSubmitButtonClicked = {rencanaStudyViewModel.saveDataKRS(it)
                    navController.navigate(
                        Halaman.TampilData.name){
                    }
                },
                onBackButtonClicked = { navController.popBackStack() }
            )
        }
        composable(route = Halaman.TampilData.name) {
            TampilDataView(
                mahasiswa = mahasiswaUiState,
                rencanastudy = rencanaStudyState,
                onBackButton = { navController.popBackStack() },
                onSplashButton = {
                    navController.popBackStack(
                        route = Halaman.Splash.name,
                        inclusive = false
                    )
                }
            )
        }
    }
}
