package net.fhtpci.fhtpci.model

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_difusor.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES DIFUSOR, CAMPO 17
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtDifusor" => (INT) ID EXTINTOR DIFUSOR,
  "cveExtDifusor" => STR(30) CLAVE EXTINTOR DIFUSOR,
  "nomExtDifusor" => STR(250) NOMBRE EXTINTOR DIFUSOR,
  "activoExtDifusor" => STR(2) ACTIVO EXTINTOR DIFUSOR (SI/NO),
  "obsExtDifusor" => (TEXT) OBSERVACIONES EXTINTOR DIFUSOR
 */

class ExtDifusorResponse (
    val idExtDifusor: Int,
    val nomExtDifusor: String,
    val cveExtDifusor: String,
    val activoExtDifusor: String,
    val obsExtDifusor: String
)