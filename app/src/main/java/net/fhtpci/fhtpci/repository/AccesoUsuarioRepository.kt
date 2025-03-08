package net.fhtpci.fhtpci.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.fhtpci.fhtpci.api.ApiClient
import net.fhtpci.fhtpci.model.AccesoUsuarioResponse

class AccesoUsuarioRepository {
    suspend fun fetchAccesoUsuario(): List<AccesoUsuarioResponse>? {
        return withContext(Dispatchers.IO) {
            try {
                val response = ApiClient.instance.getAccesoUsuario()
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