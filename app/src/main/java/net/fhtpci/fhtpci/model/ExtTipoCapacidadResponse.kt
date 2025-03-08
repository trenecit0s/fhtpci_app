package net.fhtpci.fhtpci.model

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_tipo_capacidad.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE TIPOS-CAPACIDAD DE EXTINTORES
 * PARAMETROS:
  cual_tipo: Int
 *
 * CAMPOS QUE REGRESA:
  "idExtTipoCapacidad" => (INT) ID EXTINTOR TIPO CAPACIDAD,
  "tipoExtTipoCapacidad" => (INT) ID TIPO EXTINTOR TIPO CAPACIDAD,
  "capacidadExtTipoCapacidad" => (INT) ID CAPACIDAD EXTINTOR TIPO CAPACIDAD,
  "obsExtTipoCapacidad" => (TEXT) OBSERVACIONES EXTINTOR TIPO CAPACIDAD
 */

class ExtTipoCapacidadResponse (
    val idExtTipoCapacidad: Int,
    val tipoExtTipoCapacidad: Int,
    val capacidadExtTipoCapacidad: Int,
    val obsExtTipoCapacidad: String
)