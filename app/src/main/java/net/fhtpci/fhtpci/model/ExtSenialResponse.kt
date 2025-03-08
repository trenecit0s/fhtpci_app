package net.fhtpci.fhtpci.model

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_senial.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES SENIAL, CAMPO 12
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtSenial" => (INT) ID EXTINTOR SENIAL,
  "cveExtSenial" => STR(30) CLAVE EXTINTOR SENIAL,
  "nomExtSenial" => STR(250) NOMBRE EXTINTOR SENIAL,
  "activoExtSenial" => STR(2) ACTIVO EXTINTOR SENIAL (SI/NO),
  "obsExtSenial" => (TEXT) OBSERVACIONES EXTINTOR SENIAL
 */

class ExtSenialResponse (
    val idExtSenial: Int,
    val nomExtSenial: String,
    val cveExtSenial: String,
    val activoExtSenial: String,
    val obsExtSenial: String
)