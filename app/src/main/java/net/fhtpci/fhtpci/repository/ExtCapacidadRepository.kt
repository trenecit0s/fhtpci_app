package net.fhtpci.fhtpci.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.fhtpci.fhtpci.api.ApiClient
import net.fhtpci.fhtpci.model.ExtCapacidadResponse

class ExtCapacidadRepository {
    suspend fun fetchExtCapacidad(): List<ExtCapacidadResponse>? {
        return withContext(Dispatchers.IO) {
            try {
                val response = ApiClient.instance.getExtCapacidad()
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