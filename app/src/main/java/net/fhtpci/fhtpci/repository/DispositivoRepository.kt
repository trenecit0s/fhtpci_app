package net.fhtpci.fhtpci.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.fhtpci.fhtpci.api.ApiClient
import net.fhtpci.fhtpci.model.DispositivoResponse

class DispositivoRepository {
    suspend fun fetchDispositivo(): List<DispositivoResponse>? {
        return withContext(Dispatchers.IO) {
            try {
                val response = ApiClient.instance.getDispositivo()
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