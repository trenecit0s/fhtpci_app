package net.fhtpci.fhtpci.model

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_clientes_zonas_activos.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE ZONAS DE CLIENTES
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idClienteZona" => (INT) ID ZONA CLIENTE,
  "nomClienteZona" => STR(250) NOMBRE ZONA CLIENTE,
  "cveClienteZona" => STR(30) CLAVE ZONA CLIENTE,
  "activoClienteZona" => STR(2) ACTIVO ZONA CLIENTE (SI/NO),
  "obsClienteZona" => (TEXT) OBSERVACIONES ZONA CLIENTE
 */

data class ZonasClientesActivosResponse (
    val idClienteZona: Int,
    val nomClienteZona: String,
    val cveClienteZona: String,
    val activoClienteZona: String,
    val obsClienteZona: String
)