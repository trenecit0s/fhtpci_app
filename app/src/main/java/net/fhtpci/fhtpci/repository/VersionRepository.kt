package net.fhtpci.fhtpci.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.fhtpci.fhtpci.api.ApiClient
import net.fhtpci.fhtpci.model.VersionResponse

class VersionRepository {
    suspend fun fetchVersion(): List<VersionResponse>? {
        return withContext(Dispatchers.IO) {
            try {
                val response = ApiClient.instance.getVersion()
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
