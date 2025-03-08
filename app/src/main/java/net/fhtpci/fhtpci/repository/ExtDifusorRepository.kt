package net.fhtpci.fhtpci.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.fhtpci.fhtpci.api.ApiClient
import net.fhtpci.fhtpci.model.ExtDifusorResponse

class ExtDifusorRepository {
    suspend fun fetchExtDifusor(): List<ExtDifusorResponse>? {
        return withContext(Dispatchers.IO) {
            try {
                val response = ApiClient.instance.getExtDifusor()
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