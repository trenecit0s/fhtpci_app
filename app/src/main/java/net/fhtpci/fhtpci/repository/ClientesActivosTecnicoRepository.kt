package net.fhtpci.fhtpci.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.fhtpci.fhtpci.api.ApiClient
import net.fhtpci.fhtpci.model.ClientesActivosTecnicoResponse

class ClientesActivosTecnicoRepository {
    suspend fun fetchClientesActivosTecnico(): List<ClientesActivosTecnicoResponse>? {
        return withContext(Dispatchers.IO) {
            try {
                val response = ApiClient.instance.getClientesActivosTecnico()
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