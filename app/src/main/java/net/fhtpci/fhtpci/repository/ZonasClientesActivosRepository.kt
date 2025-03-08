package net.fhtpci.fhtpci.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.fhtpci.fhtpci.api.ApiClient
import net.fhtpci.fhtpci.model.ZonasClientesActivosResponse

class ZonasClientesActivosRepository {
    suspend fun fetchZonasClientesActivos(): List<ZonasClientesActivosResponse>? {
        return withContext(Dispatchers.IO) {
            try {
                val response = ApiClient.instance.getZonasClientesActivos()
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