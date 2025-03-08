package net.fhtpci.fhtpci.model

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

data class AccesoUsuarioResponse(
    val IdUsuario: Int,
    val Mensaje: String
)