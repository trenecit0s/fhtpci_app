package net.fhtpci.fhtpci.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.fhtpci.fhtpci.api.ApiClient
import net.fhtpci.fhtpci.model.ExtEstadoResponse

class ExtEstadoRepository {
    suspend fun fetchExtEstado(): List<ExtEstadoResponse>? {
        return withContext(Dispatchers.IO) {
            try {
                val response = ApiClient.instance.getExtEstado()
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