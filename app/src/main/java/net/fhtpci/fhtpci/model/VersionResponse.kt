package net.fhtpci.fhtpci.model

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

data class VersionResponse(
    val ClaveVersion: String,
    val FechaVersion: String,
    val HoraVersion: String,
    val TamanioVersion: String
)