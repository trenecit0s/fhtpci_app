package net.fhtpci.fhtpci.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.fhtpci.fhtpci.api.ApiClient
import net.fhtpci.fhtpci.model.VersionResponse

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_regresa_version_app.php
 * DESCRIPCION: REGRESA LA VERSION DE LA APP
 * PARAMETROS: NINGUNO
 * CAMPOS QUE REGRESA:
  "ClaveVersion" => STR(30) CLAVE O VERSION DE LA APP,
  "FechaVersion" => (DATE) FECHA DE LA VERSION,
  "HoraVersion" => (TIME) HORA DE LA VERSION,
  "TamanioVersion" => (FLOAT) TAMANIO DE LA VERSION
 */

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
