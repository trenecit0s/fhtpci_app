package net.fhtpci.fhtpci.model

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_seguro.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES SEGURO, CAMPO 14
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtSeguro" => (INT) ID EXTINTOR SEGURO,
  "cveExtSeguro" => STR(30) CLAVE EXTINTOR SEGURO,
  "nomExtSeguro" => STR(250) NOMBRE EXTINTOR SEGURO,
  "activoExtSeguro" => STR(2) ACTIVO EXTINTOR SEGURO (SI/NO),
  "obsExtSeguro" => (TEXT) OBSERVACIONES EXTINTOR SEGURO
 */

class ExtSeguroResponse (
    val idExtSeguro: Int,
    val nomExtSeguro: String,
    val cveExtSeguro: String,
    val activoExtSeguro: String,
    val obsExtSeguro: String
)