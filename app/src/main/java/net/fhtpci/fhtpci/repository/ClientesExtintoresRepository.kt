package net.fhtpci.fhtpci.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.fhtpci.fhtpci.api.ApiClient
import net.fhtpci.fhtpci.model.ClientesExtintoresResponse

class ClientesExtintoresRepository {
    suspend fun fetchClientesExtintores(): List<ClientesExtintoresResponse>? {
        return withContext(Dispatchers.IO) {
            try {
                val response = ApiClient.instance.getClientesExtintores()
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