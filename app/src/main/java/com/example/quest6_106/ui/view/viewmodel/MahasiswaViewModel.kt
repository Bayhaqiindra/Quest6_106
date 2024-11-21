package com.example.quest6_106.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.quest6_106.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MahasiswaViewModel: ViewModel() {
    private val _statusUI = MutableStateFlow(Mahasiswa())
    val statusUI: StateFlow<Mahasiswa> = _statusUI.asStateFlow()
}