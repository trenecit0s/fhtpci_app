package net.fhtpci.fhtpci.model

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_manguera.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES MANGUERA, CAMPO 10
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtManguera" => (INT) ID EXTINTOR MANGUERA,
  "cveExtManguera" => STR(30) CLAVE EXTINTOR MANGUERA,
  "nomExtManguera" => STR(250) NOMBRE EXTINTOR MANGUERA,
  "activoExtManguera" => STR(2) ACTIVO EXTINTOR MANGUERA (SI/NO),
  "obsExtManguera" => (TEXT) OBSERVACIONES EXTINTOR MANGUERA
 */

class ExtMangueraResponse (
    val idExtManguera: Int,
    val nomExtManguera: String,
    val cveExtManguera: String,
    val activoExtManguera: String,
    val obsExtManguera: String
)