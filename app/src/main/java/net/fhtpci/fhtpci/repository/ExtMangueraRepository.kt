package net.fhtpci.fhtpci.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.fhtpci.fhtpci.api.ApiClient
import net.fhtpci.fhtpci.model.ExtMangueraResponse

class ExtMangueraRepository {
    suspend fun fetchExtManguera(): List<ExtMangueraResponse>? {
        return withContext(Dispatchers.IO) {
            try {
                val response = ApiClient.instance.getExtManguera()
                if (response.isSuccessful) {
                    response.body()
                } else {
                    null
                }
            } catch (e: Exception) {
                null
            }
        }
    }
}