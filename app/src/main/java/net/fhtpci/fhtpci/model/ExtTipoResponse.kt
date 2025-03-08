package net.fhtpci.fhtpci.model

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_tipo.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE TIPOS DE EXTINTORES
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtTipo" => (INT) ID EXTINTOR TIPO,
  "cveExtTipo" => STR(30) CLAVE EXTINTOR TIPO,
  "nomExtTipo" => STR(250) NOMBRE EXTINTOR TIPO,
  "activoExtTipo" => STR(2) ACTIVO EXTINTOR TIPO (SI/NO),
  "recargaExtTipo" => (INT) SE DEBE DE RECARGAR CADA X ANIOS,
  "obsExtTipo" => (TEXT) OBSERVACIONES EXTINTOR TIPO
 */

class ExtTipoResponse (
    val idExtTipo: Int,
    val nomExtTipo: String,
    val cveExtTipo: String,
    val activoExtTipo: String,
    val recargaExtTipo: Int,
    val obsExtTipo: String
)