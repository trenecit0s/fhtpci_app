package net.fhtpci.fhtpci.model

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_dispositivo.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE DISPOSITOS
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idDispositivo" => (INT) ID DISPOSITIVO,
  "cveDispositivo" => STR(30) CLAVE DISPOSITIVO,
  "nomDispositivo" => STR(250) NOMBRE DISPOSITIVO,
  "activoDispositivo" => STR(2) ACTIVO DISPOSITIVO (SI/NO),
  "obsDispositivo" => (TEXT) OBSERVACIONES DISPOSITIVO
 */

class DispositivoResponse (
    val idDispositivo: Int,
    val nomDispositivo: String,
    val cveDispositivo: String,
    val activoDispositivo: String,
    val obsDispositivo: String
)