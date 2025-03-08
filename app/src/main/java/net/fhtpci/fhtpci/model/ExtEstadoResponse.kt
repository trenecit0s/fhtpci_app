package net.fhtpci.fhtpci.model

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_estado.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES ESTADO, CAMPO 13
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtEstado" => (INT) ID EXTINTOR ESTADO,
  "cveExtEstado" => STR(30) CLAVE EXTINTOR ESTADO,
  "nomExtEstado" => STR(250) NOMBRE EXTINTOR ESTADO,
  "activoExtEstado" => STR(2) ACTIVO EXTINTOR ESTADO (SI/NO),
  "obsExtEstado" => (TEXT) OBSERVACIONES EXTINTOR ESTADO
 */

data class ExtEstadoResponse (
    val idExtEstado: Int,
    val nomExtEstado: String,
    val cveExtEstado: String,
    val activoExtEstado: String,
    val obsExtEstado: String
)