package net.fhtpci.fhtpci.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.fhtpci.fhtpci.api.ApiClient
import net.fhtpci.fhtpci.model.ClientesActivosResponse

class ClientesActivosRepository {
    suspend fun fetchClientesActivos(): List<ClientesActivosResponse>? {
        return withContext(Dispatchers.IO) {
            try {
                val response = ApiClient.instance.getClientesActivos()
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