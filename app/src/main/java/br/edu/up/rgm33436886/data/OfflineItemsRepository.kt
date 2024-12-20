package br.edu.up.rgm33436886.data

import kotlinx.coroutines.flow.Flow

class OfflineItemsRepository(
    private val dao: ItemDao
) : ItemsRepository{
    override fun getAllItemsStream(): Flow<List<Item>> = dao.getAllItems()

    override fun getItemStream(id: Int): Flow<Item?> = dao.getItem(id)

    override suspend fun insertItem(item: Item) = dao.insert(item)

    override suspend fun deleteItem(item: Item) = dao.delete(item)

    override suspend fun updateItem(item: Item) = dao.update(item)

}