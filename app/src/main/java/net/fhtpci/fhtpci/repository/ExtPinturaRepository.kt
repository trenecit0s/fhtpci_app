package net.fhtpci.fhtpci.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.fhtpci.fhtpci.api.ApiClient
import net.fhtpci.fhtpci.model.ExtPinturaResponse

class ExtPinturaRepository {
    suspend fun fetchExtPintura(): List<ExtPinturaResponse>? {
        return withContext(Dispatchers.IO) {
            try {
                val response = ApiClient.instance.getExtPintura()
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