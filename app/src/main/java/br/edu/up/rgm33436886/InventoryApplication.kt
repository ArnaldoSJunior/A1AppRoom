package br.edu.up.rgm33436886

import android.app.Application
import br.edu.up.rgm33436886.data.AppContainer
import br.edu.up.rgm33436886.data.AppDataContainer

class InventoryApplication: Application() {



    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }


}