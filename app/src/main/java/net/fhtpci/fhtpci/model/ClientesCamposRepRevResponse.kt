package net.fhtpci.fhtpci.model

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_ext_rep_revision_mensual_campos.php
 * DESCRIPCION: REGRESA LA LISTA DE CAMPOS QUE EL CLIENTE OBLIGATORIAMENTE REQUIERE POR PARTE DE FHTPCI EN CADA REVISION
 * PARAMETROS:
  cual_tecnico: Int
 *
 * CAMPOS QUE REGRESA:
  "idCliente" => (INT) ID CLIENTE,
  "okVerCampo01" => STR(2) PUEDE VER EL CAMPO 01? (SI/NO),
  "okVerCampo02" => STR(2) PUEDE VER EL CAMPO 02? (SI/NO),
  "okVerCampo03" => STR(2) PUEDE VER EL CAMPO 03? (SI/NO),
  "okVerCampo04" => STR(2) PUEDE VER EL CAMPO 04? (SI/NO),
  "okVerCampo05" => STR(2) PUEDE VER EL CAMPO 05? (SI/NO),
  "okVerCampo06" => STR(2) PUEDE VER EL CAMPO 06? (SI/NO),
  "okVerCampo07" => STR(2) PUEDE VER EL CAMPO 07? (SI/NO),
  "okVerCampo08" => STR(2) PUEDE VER EL CAMPO 08? (SI/NO),
  "okVerCampo09" => STR(2) PUEDE VER EL CAMPO 09? (SI/NO),
  "okVerCampo10" => STR(2) PUEDE VER EL CAMPO 10? (SI/NO),
  "okVerCampo11" => STR(2) PUEDE VER EL CAMPO 11? (SI/NO),
  "okVerCampo12" => STR(2) PUEDE VER EL CAMPO 12? (SI/NO),
  "okVerCampo13" => STR(2) PUEDE VER EL CAMPO 13? (SI/NO),
  "okVerCampo14" => STR(2) PUEDE VER EL CAMPO 14? (SI/NO),
  "okVerCampo15" => STR(2) PUEDE VER EL CAMPO 15? (SI/NO),
  "okVerCampo16" => STR(2) PUEDE VER EL CAMPO 16? (SI/NO),
  "okVerCampo17" => STR(2) PUEDE VER EL CAMPO 17? (SI/NO),
  "okVerCampo18" => STR(2) PUEDE VER EL CAMPO 18? (SI/NO),
  "okVerCampo19" => STR(2) PUEDE VER EL CAMPO 19? (SI/NO)
 *
 */

class ClientesCamposRepRevResponse (
    val idCliente: Int,
    val okVerCampo01: String,
    val okVerCampo02: String,
    val okVerCampo03: String,
    val okVerCampo04: String,
    val okVerCampo05: String,
    val okVerCampo06: String,
    val okVerCampo07: String,
    val okVerCampo08: String,
    val okVerCampo09: String,
    val okVerCampo10: String,
    val okVerCampo11: String,
    val okVerCampo12: String,
    val okVerCampo13: String,
    val okVerCampo14: String,
    val okVerCampo15: String,
    val okVerCampo16: String,
    val okVerCampo17: String,
    val okVerCampo18: String,
    val okVerCampo19: String
)