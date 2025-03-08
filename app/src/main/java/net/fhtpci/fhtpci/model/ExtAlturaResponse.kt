package net.fhtpci.fhtpci.model

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_altura.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES ALTURA, CAMPO 16
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtAltura" => (INT) ID EXTINTOR ALTURA,
  "cveExtAltura" => STR(30) CLAVE EXTINTOR ALTURA,
  "nomExtAltura" => STR(250) NOMBRE EXTINTOR ALTURA,
  "activoExtAltura" => STR(2) ACTIVO EXTINTOR ALTURA (SI/NO),
  "obsExtAltura" => (TEXT) OBSERVACIONES EXTINTOR ALTURA
 */

data class ExtAlturaResponse (
    val idExtAltura: Int,
    val nomExtAltura: String,
    val cveExtAltura: String,
    val activoExtAltura: String,
    val obsExtAltura: String
)