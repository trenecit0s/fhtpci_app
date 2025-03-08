package net.fhtpci.fhtpci.model

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_clientes_activos_extintores.php
 * DESCRIPCION: REGRESA EL CATALOGO DE EXTINTORES PERTENECIENTES A UN MISMO CLIENTE
 * PARAMETROS:
  cual_cliente: Int
 *
 * CAMPOS QUE REGRESA:
  "id_ExtExtintor" => (INT) ID EXTINTOR,
  "cliente_ExtExtintor" => (INT) ID CLIENTE,
  "conse_ExtExtintor" => (INT) CONSECUTIVO EXTINTOR [CAMPO 01],
  "ubicacion_ExtExtintor" => STR(250) UBICACION EXTINTOR [CAMPO 02],
  "tipo_ExtExtintor" => STR(30) TIPO EXTINTOR [CAMPO 03],
  "capacidad_ExtExtintor" => STR(30) CAPACIDAD EXTINTOR: [CAMPO 04]. DEPENDE DEL TIPO CON BASE AL CATALOGO CORRESPONDIENTE,
  "fecha_ult_recarga_ExtExtintor" => (DATE) FECHA ULTIMO SERVICIO EXTINTOR: [CAMPO 05],
  "fecha_prox_recarga_ExtExtintor" => (DATE) FECHA PROXIMO SERVICIO EXTINTOR: [CAMPO 06],
  "cve_ExtExtintor" => STR(30) CLAVE EXTINTOR. CONCATENACION DE CLAVE CLIENTE + CONSECUTIVO EXTINTOR,
  "activo_ExtExtintor" => STR(2) ACTIVO EXTINTOR (SI/NO),
  "obsClienteTecnico" => TEXT OBSERVACIONES EXTINTOR
 */

class ClientesExtintoresResponse (
    val id_ExtExtintor: Int,
    val cliente_ExtExtintor: Int,
    val conse_ExtExtintor: Int,
    val tipo_ExtExtintor: String,
    val capacidad_ExtExtintor: String,
    val fecha_ult_recarga_ExtExtintor: String,
    val fecha_prox_recarga_ExtExtintor: String,
    val cve_ExtExtintor: String,
    val activo_ExtExtintor: String,
    val obsClienteTecnico: String
)