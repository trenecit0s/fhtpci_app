package net.fhtpci.fhtpci.model

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_capacidad_activos.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE CAPACIDADES DE EXTINTORES.
 * NO TODOS LOS TIPOS TIENEN TODAS LAS CAPACIDADES. ESTO ESTA EN OTRO CATALOGO
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtCapacidad" => (INT) ID EXTINTOR CAPACIDAD,
  "cveExtCapacidad" => STR(30) CLAVE EXTINTOR CAPACIDAD,
  "nomExtCapacidad" => STR(250) NOMBRE EXTINTOR CAPACIDAD,
  "activoExtCapacidad" => STR(2) ACTIVO EXTINTOR CAPACIDAD (SI/NO),
  "obsExtCapacidad" => (TEXT) OBSERVACIONES EXTINTOR CAPACIDAD
 */

class ExtCapacidadResponse (
    val idExtCapacidad: Int,
    val nomExtCapacidad: String,
    val cveExtCapacidad: String,
    val activoExtCapacidad: String,
    val obsExtCapacidad: String
)