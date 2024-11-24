package br.edu.up.rgm33436886.ui.home

import androidx.lifecycle.ViewModel
import br.edu.up.rgm33436886.data.Item

class HomeViewModel : ViewModel() {
    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
}


data class HomeUiState(val itemList: List<Item> = listOf())
