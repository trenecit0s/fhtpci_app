package net.fhtpci.fhtpci.model

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_presion.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES PRESION, CAMPO 07
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtPresion" => (INT) ID EXTINTOR PRESION,
  "cveExtPresion" => STR(30) CLAVE EXTINTOR PRESION,
  "nomExtPresion" => STR(250) NOMBRE EXTINTOR PRESION,
  "activoExtPresion" => STR(2) ACTIVO EXTINTOR PRESION (SI/NO),
  "obsExtPresion" => (TEXT) OBSERVACIONES EXTINTOR PRESION
 */

data class ExtPresionResponse (
    val idExtPresion: Int,
    val nomExtPresion: String,
    val cveExtPresion: String,
    val activoExtPresion: String,
    val obsExtPresion: String
)