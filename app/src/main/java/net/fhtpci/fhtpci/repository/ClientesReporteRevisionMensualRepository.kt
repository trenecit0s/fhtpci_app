package net.fhtpci.fhtpci.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.fhtpci.fhtpci.api.ApiClient
import net.fhtpci.fhtpci.model.ClientesReporteRevisionMensualResponse

class ClientesReporteRevisionMensualRepository {
    suspend fun fetchClientesReporteRevisionMensual(): List<ClientesReporteRevisionMensualResponse>? {
        return withContext(Dispatchers.IO) {
            try {
                val response = ApiClient.instance.getClientesReporteRevisionMensual()
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