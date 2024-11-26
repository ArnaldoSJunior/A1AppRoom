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
                this.createSavedStateHandle(),
                inventoryApplication().container.itemsRepository
            )
        }

        initializer {
            ItemEntryViewModel(inventoryApplication().container.itemsRepository)
        }


        initializer {
            ItemDetailsViewModel(
                this.createSavedStateHandle(),
                inventoryApplication().container.itemsRepository
            )
        }


        initializer {
            HomeViewModel(inventoryApplication().container.itemsRepository)
        }
    }
}

fun CreationExtras.inventoryApplication(): InventoryApplication {
    val application = this[AndroidViewModelFactory.APPLICATION_KEY]
    return application as? InventoryApplication
        ?: throw IllegalStateException("Application must be an instance of InventoryApplication")
}