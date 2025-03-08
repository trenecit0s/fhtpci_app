package net.fhtpci.fhtpci.model

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_base.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES BASE, CAMPO 09
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtBase" => (INT) ID EXTINTOR BASE,
  "cveExtBase" => STR(30) CLAVE EXTINTOR BASE,
  "nomExtBase" => STR(250) NOMBRE EXTINTOR BASE,
  "activoExtBase" => STR(2) ACTIVO EXTINTOR BASE (SI/NO),
  "obsExtBase" => (TEXT) OBSERVACIONES EXTINTOR BASE
 */

data class ExtBaseResponse (
    val idExtBase: Int,
    val nomExtBase: String,
    val cveExtBase: String,
    val activoExtBase: String,
    val obsExtBase: String
)