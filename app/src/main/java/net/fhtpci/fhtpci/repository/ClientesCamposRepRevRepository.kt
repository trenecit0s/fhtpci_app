package net.fhtpci.fhtpci.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.fhtpci.fhtpci.api.ApiClient
import net.fhtpci.fhtpci.model.ClientesCamposRepRevResponse

class ClientesCamposRepRevRepository {
    suspend fun fetchClientesCamposRepRev(): List<ClientesCamposRepRevResponse>? {
        return withContext(Dispatchers.IO) {
            try {
                val response = ApiClient.instance.getClientesCamposRepRev()
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