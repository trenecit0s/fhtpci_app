package net.fhtpci.fhtpci.model

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_manometro.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES MANOMETRO, CAMPO 08
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtManometro" => (INT) ID EXTINTOR MANOMETRO,
  "cveExtManometro" => STR(30) CLAVE EXTINTOR MANOMETRO,
  "nomExtManometro" => STR(250) NOMBRE EXTINTOR MANOMETRO,
  "activoExtManometro" => STR(2) ACTIVO EXTINTOR MANOMETRO (SI/NO),
  "obsExtManometro" => (TEXT) OBSERVACIONES EXTINTOR MANOMETRO
 */

data class ExtManometroResponse (
    val idExtManometro: Int,
    val nomExtManometro: String,
    val cveExtManometro: String,
    val activoExtManometro: String,
    val obsExtManometro: String
)
