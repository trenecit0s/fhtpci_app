package net.fhtpci.fhtpci.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.fhtpci.fhtpci.api.ApiClient
import net.fhtpci.fhtpci.model.AccesoUsuarioResponse

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_revisa_acceso_usuario.php
 * DESCRIPCION: REGRESA PERMISO DE ACCESO
 * PARAMETROS:
  kcve_usuario => STR(30) CLAVE DEL USUARIO
  kpwd_usuario => STR(30) CONTRASENIA DEL USUARIO
 *
 * CAMPOS QUE REGRESA:
  "IdUsuario" => (INT) ID DEL USUARIO. EN CASO DE ALGUN PROBLEMA CON EL ACCESO REGRESARA 0,
  "Mensaje" => STR(250) MENSAJE EXPLICATIVO DEL ACCESO, EN CASO DE QUE EL ID SEA != 0, EL MENSAJE SERA: TodoOK
 */

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