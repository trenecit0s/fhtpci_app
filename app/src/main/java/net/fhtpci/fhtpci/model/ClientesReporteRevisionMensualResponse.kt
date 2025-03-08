package net.fhtpci.fhtpci.model

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_ext_rep_revision_mensual_campos.php
 * DESCRIPCION: REGRESA LA LISTA DE CAMPOS QUE EL CLIENTE OBLIGATORIAMENTE REQUIERE POR PARTE DE FHTPCI EN CADA REVISION
 * PARAMETROS:
  cual_cliente: Int
  cual_anio: Int (Mayor a 2023)
  cual_mes: Int (Entre 1 y 12)
 *
 * CAMPOS QUE REGRESA:
  "idRepExt" => (INT) ID,
  "clienteRepExt" => (INT) ID CLIENTE,
  "fechaRepExt" => (DATE) FECHA DEL RECORRIDO DE INSPECCION DE EXTINTORES,
  "cveRepExt" => STR(50) CLAVE DEL EXTINTOR. ES SOLO INFORMATIVO,
  "tecnicoRepExt" => (INT) ID DEL TECNICO,
  "id_extRepExt" => (INT) ID DEL EXTINTOR SE USA PARA TRAER LOS DATOS DEL EXTINTOR, SE PIDIO LA ALTERNATIVA DE LEER UN CODIGO DE BARRAS CON EL CELULAR,
  "conseRepExt" => (INT) CONSECUTIVO DEL EXTINTOR PARA ESTE CLIENTE [CAMPO 01],
  "ubicacionRepExt" => STR(250) UBICACION DEL EXTINTOR [CAMPO 02],
  "tipoRepExt" => STR(30) TIPO DEL EXTINTOR [CAMPO 03],
  "capacidadRepExt" => STR(30) CAPACIDAD DEL EXTINTOR [CAMPO 04],
  "fecha_servicioRepExt" => (DATE) FECHA ULTIMO SERVICIO DEL EXTINTOR [CAMPO 05],
  "fecha_prox_servicioRepExt" => (DATE) FECHA PROXIMO SERVICIO DEL EXTINTOR [CAMPO 06],
  "presionRepExt" => STR(30) REVISION DE PRESION DEL EXTINTOR [CAMPO 07]. LAS OPCIONES VALIDAS ESTAN EN EL CATALOGO CORRESPONDIENTE (mod_api_cata_extintores_presion.php [ExtPresionResponse]),
  "manometroRepExt" => STR(30) REVISION DE MANOMETRO DEL EXTINTOR [CAMPO 08]. LAS OPCIONES VALIDAS ESTAN EN EL CATALOGO CORRESPONDIENTE (mod_api_cata_extintores_manometro.php [ExtManometroResponse]),
  "baseRepExt" => STR(30) REVISION DE BASE DEL EXTINTOR [CAMPO 09]. LAS OPCIONES VALIDAS ESTAN EN EL CATALOGO CORRESPONDIENTE (mod_api_cata_extintores_base.php [ExtBaseResponse]),
  "mangueraRepExt" => STR(30) REVISION DE MANGUERA DEL EXTINTOR [CAMPO 10]. LAS OPCIONES VALIDAS ESTAN EN EL CATALOGO CORRESPONDIENTE (mod_api_cata_extintores_manguera.php [ExtMangueraResponse]),
  "pinturaRepExt" => STR(30) REVISION DE PINTURA DEL EXTINTOR [CAMPO 11]. LAS OPCIONES VALIDAS ESTAN EN EL CATALOGO CORRESPONDIENTE (mod_api_cata_extintores_pintura.php [ExtPinturaResponse]),
  "senialRepExt" => STR(30) REVISION DE SENIAL DEL EXTINTOR [CAMPO 12]. LAS OPCIONES VALIDAS ESTAN EN EL CATALOGO CORRESPONDIENTE (mod_api_cata_extintores_senial.php [ExtSenialResponse]),
  "estadoRepExt" => STR(30) REVISION DE ESTADO DEL EXTINTOR [CAMPO 13]. LAS OPCIONES VALIDAS ESTAN EN EL CATALOGO CORRESPONDIENTE (mod_api_cata_extintores_estado.php [ExtEstadoResponse]),
  "seguroRepExt" => STR(30) REVISION DE SEGURO DEL EXTINTOR [CAMPO 14]. LAS OPCIONES VALIDAS ESTAN EN EL CATALOGO CORRESPONDIENTE (mod_api_cata_extintores_seguro.php [ExtSeguroResponse]),
  "prueba_hidroRepExt" => (DATE) REVISION DE PRUEBA HIDROSTATICA DEL EXTINTOR [CAMPO 15].,
  "alturaRepExt" => STR(30) REVISION DE ALTURA DEL EXTINTOR [CAMPO 16]. LAS OPCIONES VALIDAS ESTAN EN EL CATALOGO CORRESPONDIENTE (mod_api_cata_extintores_altura.php [ExtAlturaResponse]),
  "difusorRepExt" => STR(30) REVISION DE DIFUSOR DEL EXTINTOR [CAMPO 17]. LAS OPCIONES VALIDAS ESTAN EN EL CATALOGO CORRESPONDIENTE (mod_api_cata_extintores_difusor.php [ExtDifusorResponse]),
  "licenciaRepExt" => STR(250) REVISION DE LICENCIA DE FUNCIONAMIENTO DEL EXTINTOR [CAMPO 18]. APLICA SOLO A RESTAURENTES,
  "obsRepExt" => STR(250) OBSERVACIONES AL EXTINTOR [CAMPO 19].
 *
 * OJO: LOS CAMPOS (01-19) NO USADOS TRAERAN NULL COMO VALOR.
 * OJO: LOS CAMPOS (01-19) DEPENDEN DEL CLIENTE, EN BASE A LOS VALORES DE mod_api_ext_rep_revision_mensual_campos.php [ClientesCamposRepRevResponse]
 */

class ClientesReporteRevisionMensualResponse (
    val idRepExt: Int,
    val clienteRepExt: Int,
    val fechaRepExt: String,
    val cveRepExt: String,
    val tecnicoRepExt: Int,
    val id_extRepExt: Int,
    val conseRepExt: Int,
    val ubicacionRepExt: String,
    val tipoRepExt: String,
    val capacidadRepExt: String,
    val fecha_servicioRepExt: String,
    val fecha_prox_servicioRepExt: String,
    val presionRepExt: String,
    val manometroRepExt: String,
    val baseRepExt: String,
    val mangueraRepExt: String,
    val pinturaRepExt: String,
    val senialRepExt: String,
    val estadoRepExt: String,
    val prueba_hidroRepExt: String,
    val alturaRepExt: String,
    val difusorRepExt: String,
    val licenciaRepExt: String,
    val obsRepExt: String
)