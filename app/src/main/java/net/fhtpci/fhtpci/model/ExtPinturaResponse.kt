package net.fhtpci.fhtpci.model

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_pintura.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES PINTURA, CAMPO 11
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtPintura" => (INT) ID EXTINTOR PINTURA,
  "cveExtPintura" => STR(30) CLAVE EXTINTOR PINTURA,
  "nomExtPintura" => STR(250) NOMBRE EXTINTOR PINTURA,
  "activoExtPintura" => STR(2) ACTIVO EXTINTOR PINTURA (SI/NO),
  "obsExtPintura" => (TEXT) OBSERVACIONES EXTINTOR PINTURA
 */

data class ExtPinturaResponse (
    val idExtPintura: Int,
    val nomExtPintura: String,
    val cveExtPintura: String,
    val activoExtPintura: String,
    val obsExtPintura: String
)