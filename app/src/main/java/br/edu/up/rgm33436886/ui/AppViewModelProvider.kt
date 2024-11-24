package br.edu.up.rgm33436886.ui



import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import br.edu.up.rgm33436886.InventoryApplication
import br.edu.up.rgm33436886.ui.home.HomeViewModel
import br.edu.up.rgm33436886.ui.item.ItemDetailsViewModel
import br.edu.up.rgm33436886.ui.item.ItemEditViewModel
import br.edu.up.rgm33436886.ui.item.ItemEntryViewModel

object AppViewModelProvider {
    val Factory = viewModelFactory {

        initializer {
            ItemEditViewModel(
                this.createSavedStateHandle()
            )
        }

        initializer {
            ItemEntryViewModel()
        }


        initializer {
            ItemDetailsViewModel(
                this.createSavedStateHandle()
            )
        }


        initializer {
            HomeViewModel()
        }
    }
}

fun CreationExtras.inventoryApplication(): InventoryApplication =
    (this[AndroidViewModelFactory.APPLICATION_KEY] as InventoryApplication)