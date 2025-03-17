package net.fhtpci.fhtpci.api

import net.fhtpci.fhtpci.model.AccesoUsuarioResponse
import net.fhtpci.fhtpci.model.VersionResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/*
 * NOMBRE: mod_api_regresa_version_app.php
 * DESCRIPCION: REGRESA LA VERSION DE LA APP
 * PARAMETROS: NINGUNO
 * CAMPOS QUE REGRESA:
  "ClaveVersion" => STR(30) CLAVE O VERSION DE LA APP,
  "FechaVersion" => (DATE) FECHA DE LA VERSION,
  "HoraVersion" => (TIME) HORA DE LA VERSION,
  "TamanioVersion" => (FLOAT) TAMANIO DE LA VERSION
* */

interface ApiService {
    @GET("mod_api_regresa_version_app.php")
    suspend fun getVersion(): Response<List<VersionResponse>>

    @GET("mod_api_revisa_acceso_usuario.php")
    suspend fun obtenerAccesoUsuario(
        @Query("kcve_usuario") userKey: String,
        @Query("kpwd_usuario") userPassword: String
    ): Response<AccesoUsuarioResponse>
}

/*
//https://fhtpci.net/api/mod_api_regresa_version_app.php?datoaenviar

/* https://fhtpci.net/api/mod_api_revisa_acceso_usuario.php
 * NOMBRE: mod_api_revisa_acceso_usuario.php
 * DESCRIPCION: REGRESA PERMISO DE ACCESO
 * PARAMETROS:
  kcve_usuario => STR(30) CLAVE DEL USUARIO
  kpwd_usuario => STR(30) CONTRASENIA DEL USUARIO
 *
 * CAMPOS QUE REGRESA:
  "IdUsuario" => (INT) ID DEL USUARIO. EN CASO DE ALGUN PROBLEMA CON EL ACCESO REGRESARA 0,
  "Mensaje" => STR(250) MENSAJE EXPLICATIVO DEL ACCESO, EN CASO DE QUE EL ID SEA != 0, EL MENSAJE SERA: TodoOK
* */

interface ApiService {
    @GET("mod_api_revisa_acceso_usuario.php")
    suspend fun getAccesoUsuaorio(): Response<List<VersionResponse>>
}

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_dispositivo.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE DISPOSITOS
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idDispositivo" => (INT) ID DISPOSITIVO,
  "cveDispositivo" => STR(30) CLAVE DISPOSITIVO,
  "nomDispositivo" => STR(250) NOMBRE DISPOSITIVO,
  "activoDispositivo" => STR(2) ACTIVO DISPOSITIVO (SI/NO),
  "obsDispositivo" => (TEXT) OBSERVACIONES DISPOSITIVO
 */

interface ApiService {
    @GET("mod_api_cata_dispositivo.php")
    suspend fun getDispositivo(): Response<List<DispositivoResponse>>
}

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_clientes_activos.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE CLIENTES
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idCliente" => (INT) ID CLIENTE,
  "nomCliente" => STR(250) NOMBRE CLIENTE,
  "cveCliente" => STR(30) CLAVE CLIENTE,
  "rsocialCliente" => STR(250) RAZON SOCIAL DEL CLIENTE,
  "activoCliente" => STR(2) ACTIVO CLIENTE: (SI/NO),
  "obsCliente" => TEXT OBSERVACIONES CLIENTE,
  "zonaCliente" => (INT) ID ZONA CLIENTE,
  "emailCliente" => STR(250) EMAIL 1,
  "email2Cliente" => STR(250) EMAIL 2,
  "email3Cliente" => STR(250) EMAIL 3,
  "email4Cliente" => STR(250) EMAIL 4,
  "email5Cliente" => STR(250) EMAIL 5,
  "tecnico1Cliente" => (INT) ID USUARIO DEL TECNICO (0 O != 0) 1,
  "tecnico2Cliente" => (INT) ID USUARIO DEL TECNICO (0 O != 0) 2,
  "tecnico3Cliente" => (INT) ID USUARIO DEL TECNICO (0 O != 0) 3,
  "tecnico4Cliente" => (INT) ID USUARIO DEL TECNICO (0 O != 0) 4,
  "tecnico5Cliente" => (INT) ID USUARIO DEL TECNICO (0 O != 0) 5,
  "contactoCliente" => STR(250) NOMBRE CONTACTO 1. CORRESPONDE EL EMAIL DEL MISMO NUMERO,
  "contacto2Cliente" => STR(250) NOMBRE CONTACTO 2. CORRESPONDE EL EMAIL DEL MISMO NUMERO,
  "contacto3Cliente" => STR(250) NOMBRE CONTACTO 3. CORRESPONDE EL EMAIL DEL MISMO NUMERO,
  "contacto4Cliente" => STR(250) NOMBRE CONTACTO 4. CORRESPONDE EL EMAIL DEL MISMO NUMERO,
  "contacto5Cliente" => STR(250) NOMBRE CONTACTO 5. CORRESPONDE EL EMAIL DEL MISMO NUMERO,
  "rep_01Cliente" => STR(2) CAMPO 01 PARA REPORTE DE EXTINTORES (SI/NO): CONSECUTIVO,
  "rep_02Cliente" => STR(2) CAMPO 02 PARA REPORTE DE EXTINTORES (SI/NO): UBICACION,
  "rep_03Cliente" => STR(2) CAMPO 03 PARA REPORTE DE EXTINTORES (SI/NO): TIPO EXTINTOR,
  "rep_04Cliente" => STR(2) CAMPO 04 PARA REPORTE DE EXTINTORES (SI/NO): CAPACIDAD,
  "rep_05Cliente" => STR(2) CAMPO 05 PARA REPORTE DE EXTINTORES (SI/NO): FECHA ULTIMA REVISION,
  "rep_06Cliente" => STR(2) CAMPO 06 PARA REPORTE DE EXTINTORES (SI/NO): FECHA PROXIMA REVISION,
  "rep_07Cliente" => STR(2) CAMPO 07 PARA REPORTE DE EXTINTORES (SI/NO): PRESION,
  "rep_08Cliente" => STR(2) CAMPO 08 PARA REPORTE DE EXTINTORES (SI/NO): MANOMETRO,
  "rep_09Cliente" => STR(2) CAMPO 09 PARA REPORTE DE EXTINTORES (SI/NO): BASE,
  "rep_10Cliente" => STR(2) CAMPO 10 PARA REPORTE DE EXTINTORES (SI/NO): MANGUERA,
  "rep_11Cliente" => STR(2) CAMPO 11 PARA REPORTE DE EXTINTORES (SI/NO): PINTURA,
  "rep_12Cliente" => STR(2) CAMPO 12 PARA REPORTE DE EXTINTORES (SI/NO): SENIAL,
  "rep_13Cliente" => STR(2) CAMPO 13 PARA REPORTE DE EXTINTORES (SI/NO): ESTADO,
  "rep_14Cliente" => STR(2) CAMPO 14 PARA REPORTE DE EXTINTORES (SI/NO): SEGURO,
  "rep_15Cliente" => STR(2) CAMPO 15 PARA REPORTE DE EXTINTORES (SI/NO): PRUEBA HIDROSTATICA,
  "rep_16Cliente" => STR(2) CAMPO 16 PARA REPORTE DE EXTINTORES (SI/NO): ALTURA,
  "rep_17Cliente" => STR(2) CAMPO 17 PARA REPORTE DE EXTINTORES (SI/NO): DIFUSOR,
  "rep_18Cliente" => STR(2) CAMPO 18 PARA REPORTE DE EXTINTORES (SI/NO): LICENCIA DE FUNCIONAMIENTO,
  "rep_19Cliente" => STR(2) CAMPO 19 PARA REPORTE DE EXTINTORES (SI/NO): OBSERVACIONES
 */

interface ApiService {
    @GET("mod_api_cata_clientes_activos.php")
    suspend fun getVersion(): Response<List<ClientesActivosResponse>>
}

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_clientes_activos_x_tecnico.php
 * DESCRIPCION: REGRESA EL CATALOGO DE CLIENTES AL CUAL EL TECNICO TIENE RESPONSABILIDAD, NO
 * IMPORTA SI ESTA EN EL CAMPO 1 2 3 4 o 5
 * PARAMETROS:
  cual_tecnico: Int
 *
 * CAMPOS QUE REGRESA:
  "idClienteTecnico" => (INT) ID CLIENTE,
  "nomClienteTecnico" => STR(250) NOMBRE CLIENTE,
  "cveClienteTecnico" => STR(30) CLAVE CLIENTE,
  "rsocialClienteTecnico" => STR(250) RAZON SOCIAL DEL CLIENTE,
  "activoClienteTecnico" => STR(2) ACTIVO CLIENTE: (SI/NO),
  "obsClienteTecnico" => TEXT OBSERVACIONES CLIENTE,
  "zonaClienteTecnico" => (INT) ID ZONA CLIENTE,
  "emailClienteTecnico" => STR(250) EMAIL 1,
  "email2ClienteTecnico" => STR(250) EMAIL 2,
  "email3ClienteTecnico" => STR(250) EMAIL 3,
  "email4ClienteTecnico" => STR(250) EMAIL 4,
  "email5ClienteTecnico" => STR(250) EMAIL 5,
  "tecnico1ClienteTecnico" => (INT) ID USUARIO DEL TECNICO (0 O != 0) 1,
  "tecnico2ClienteTecnico" => (INT) ID USUARIO DEL TECNICO (0 O != 0) 2,
  "tecnico3ClienteTecnico" => (INT) ID USUARIO DEL TECNICO (0 O != 0) 3,
  "tecnico4ClienteTecnico" => (INT) ID USUARIO DEL TECNICO (0 O != 0) 4,
  "tecnico5ClienteTecnico" => (INT) ID USUARIO DEL TECNICO (0 O != 0) 5,
  "contactoClienteTecnico" => STR(250) NOMBRE CONTACTO 1. CORRESPONDE EL EMAIL DEL MISMO NUMERO,
  "contacto2ClienteTecnico" => STR(250) NOMBRE CONTACTO 2. CORRESPONDE EL EMAIL DEL MISMO NUMERO,
  "contacto3ClienteTecnico" => STR(250) NOMBRE CONTACTO 3. CORRESPONDE EL EMAIL DEL MISMO NUMERO,
  "contacto4ClienteTecnico" => STR(250) NOMBRE CONTACTO 4. CORRESPONDE EL EMAIL DEL MISMO NUMERO,
  "contacto5ClienteTecnico" => STR(250) NOMBRE CONTACTO 5. CORRESPONDE EL EMAIL DEL MISMO NUMERO,
  "rep_01ClienteTecnico" => STR(2) CAMPO 01 PARA REPORTE DE EXTINTORES (SI/NO): CONSECUTIVO,
  "rep_02ClienteTecnico" => STR(2) CAMPO 02 PARA REPORTE DE EXTINTORES (SI/NO): UBICACION,
  "rep_03ClienteTecnico" => STR(2) CAMPO 03 PARA REPORTE DE EXTINTORES (SI/NO): TIPO EXTINTOR,
  "rep_04ClienteTecnico" => STR(2) CAMPO 04 PARA REPORTE DE EXTINTORES (SI/NO): CAPACIDAD,
  "rep_05ClienteTecnico" => STR(2) CAMPO 05 PARA REPORTE DE EXTINTORES (SI/NO): FECHA ULTIMA REVISION,
  "rep_06ClienteTecnico" => STR(2) CAMPO 06 PARA REPORTE DE EXTINTORES (SI/NO): FECHA PROXIMA REVISION,
  "rep_07ClienteTecnico" => STR(2) CAMPO 07 PARA REPORTE DE EXTINTORES (SI/NO): PRESION,
  "rep_08ClienteTecnico" => STR(2) CAMPO 08 PARA REPORTE DE EXTINTORES (SI/NO): MANOMETRO,
  "rep_09ClienteTecnico" => STR(2) CAMPO 09 PARA REPORTE DE EXTINTORES (SI/NO): BASE,
  "rep_10ClienteTecnico" => STR(2) CAMPO 10 PARA REPORTE DE EXTINTORES (SI/NO): MANGUERA,
  "rep_11ClienteTecnico" => STR(2) CAMPO 11 PARA REPORTE DE EXTINTORES (SI/NO): PINTURA,
  "rep_12ClienteTecnico" => STR(2) CAMPO 12 PARA REPORTE DE EXTINTORES (SI/NO): SENIAL,
  "rep_13ClienteTecnico" => STR(2) CAMPO 13 PARA REPORTE DE EXTINTORES (SI/NO): ESTADO,
  "rep_14ClienteTecnico" => STR(2) CAMPO 14 PARA REPORTE DE EXTINTORES (SI/NO): SEGURO,
  "rep_15ClienteTecnico" => STR(2) CAMPO 15 PARA REPORTE DE EXTINTORES (SI/NO): PRUEBA HIDROSTATICA,
  "rep_16ClienteTecnico" => STR(2) CAMPO 16 PARA REPORTE DE EXTINTORES (SI/NO): ALTURA,
  "rep_17ClienteTecnico" => STR(2) CAMPO 17 PARA REPORTE DE EXTINTORES (SI/NO): DIFUSOR,
  "rep_18ClienteTecnico" => STR(2) CAMPO 18 PARA REPORTE DE EXTINTORES (SI/NO): LICENCIA DE FUNCIONAMIENTO,
  "rep_19ClienteTecnico" => STR(2) CAMPO 19 PARA REPORTE DE EXTINTORES (SI/NO): OBSERVACIONES
 */

interface ApiService {
    @GET("mod_api_cata_clientes_activos_x_tecnico.php")
    suspend fun getVersion(): Response<List<ClientesActivosTecnicoResponse>>
}

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_clientes_zonas_activos.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE ZONAS DE CLIENTES
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
    "id_cliente_zona" => (INT) ID ZONA CLIENTE,
    "nom_cliente_zona" => STR(250) NOMBRE ZONA CLIENTE,
    "cve_cliente_zona" => STR(30) CLAVE ZONA CLIENTE,
    "activo_cliente_zona" => STR(2) ACTIVO ZONA CLIENTE (SI/NO),
    "obs_cliente_zona" => (TEXT) OBSERVACIONES ZONA CLIENTE
 */

interface ApiService {
    @GET("mod_api_cata_clientes_zonas_activos.php")
    suspend fun getVersion(): Response<List<ZonasClientesActivosResponse>>
}

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_presion.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES PRESION, CAMPO 07
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtPresion" => (INT) ID EXTINTOR PRESION,
  "cveExtPresion" => STR(30) CLAVE EXTINTOR PRESION,
  "nomExtPresion" => STR(250) NOMBRE EXTINTOR PRESION,
  "activoExtPresion" => STR(2) ACTIVO EXTINTOR PRESION (SI/NO),
  "obsExtPresion" => (TEXT) OBSERVACIONES EXTINTOR PRESION
 */

interface ApiService {
    @GET("mod_api_cata_extintores_presion.php")
    suspend fun getVersion(): Response<List<ExtPresionResponse>>
}

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_manometro.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES MANOMETRO, CAMPO 08
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtManometro" => (INT) ID EXTINTOR MANOMETRO,
  "cveExtManometro" => STR(30) CLAVE EXTINTOR MANOMETRO,
  "nomExtManometro" => STR(250) NOMBRE EXTINTOR MANOMETRO,
  "activoExtManometro" => STR(2) ACTIVO EXTINTOR MANOMETRO (SI/NO),
  "obsExtManometro" => (TEXT) OBSERVACIONES EXTINTOR MANOMETRO
 */

interface ApiService {
    @GET("mod_api_cata_extintores_manometro.php")
    suspend fun getVersion(): Response<List<ExtManometroResponse>>
}

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_base.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES BASE, CAMPO 09
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtBase" => (INT) ID EXTINTOR BASE,
  "cveExtBase" => STR(30) CLAVE EXTINTOR BASE,
  "nomExtBase" => STR(250) NOMBRE EXTINTOR BASE,
  "activoExtBase" => STR(2) ACTIVO EXTINTOR BASE (SI/NO),
  "obsExtBase" => (TEXT) OBSERVACIONES EXTINTOR BASE
 */

interface ApiService {
    @GET("mod_api_cata_extintores_base.php")
    suspend fun getVersion(): Response<List<ExtBaseResponse>>
}

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

interface ApiService {
    @GET("mod_api_cata_extintores_manguera.php")
    suspend fun getVersion(): Response<List<ExtMangueraResponse>>
}

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_pintura.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES PINTURA, CAMPO 11
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtPintura" => (INT) ID EXTINTOR PINTURA,
  "cveExtPintura" => STR(30) CLAVE EXTINTOR PINTURA,
  "nomExtPintura" => STR(250) NOMBRE EXTINTOR PINTURA,
  "activoExtPintura" => STR(2) ACTIVO EXTINTOR PINTURA (SI/NO),
  "obsExtPintura" => (TEXT) OBSERVACIONES EXTINTOR PINTURA
 */

interface ApiService {
    @GET("mod_api_cata_extintores_pintura.php")
    suspend fun getVersion(): Response<List<ExtPinturaResponse>>
}

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_senial.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES SENIAL, CAMPO 12
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtSenial" => (INT) ID EXTINTOR SENIAL,
  "cveExtSenial" => STR(30) CLAVE EXTINTOR SENIAL,
  "nomExtSenial" => STR(250) NOMBRE EXTINTOR SENIAL,
  "activoExtSenial" => STR(2) ACTIVO EXTINTOR SENIAL (SI/NO),
  "obsExtSenial" => (TEXT) OBSERVACIONES EXTINTOR SENIAL
 */

interface ApiService {
    @GET("mod_api_cata_extintores_senial.php")
    suspend fun getVersion(): Response<List<ExtSenialResponse>>
}

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

interface ApiService {
    @GET("mod_api_cata_extintores_estado.php")
    suspend fun getVersion(): Response<List<ExtEstadoResponse>>
}

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_seguro.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES SEGURO, CAMPO 14
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtSeguro" => (INT) ID EXTINTOR SEGURO,
  "cveExtSeguro" => STR(30) CLAVE EXTINTOR SEGURO,
  "nomExtSeguro" => STR(250) NOMBRE EXTINTOR SEGURO,
  "activoExtSeguro" => STR(2) ACTIVO EXTINTOR SEGURO (SI/NO),
  "obsExtSeguro" => (TEXT) OBSERVACIONES EXTINTOR SEGURO
 */

interface ApiService {
    @GET("mod_api_cata_extintores_seguro.php")
    suspend fun getVersion(): Response<List<ExtSeguroResponse>>
}

/*
****************************************************************************************************
* EL CAMPO 15: PRUEBA HIDROSTATICA CONTIENE UNA FECHA, NO ES UN CATALOGO
****************************************************************************************************
* */

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

interface ApiService {
    @GET("mod_api_cata_extintores_altura.php")
    suspend fun getVersion(): Response<List<ExtAlturaResponse>>
}

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_difusor.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES DIFUSOR, CAMPO 17
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtDifusor" => (INT) ID EXTINTOR DIFUSOR,
  "cveExtDifusor" => STR(30) CLAVE EXTINTOR DIFUSOR,
  "nomExtDifusor" => STR(250) NOMBRE EXTINTOR DIFUSOR,
  "activoExtDifusor" => STR(2) ACTIVO EXTINTOR DIFUSOR (SI/NO),
  "obsExtDifusor" => (TEXT) OBSERVACIONES EXTINTOR DIFUSOR
 */

interface ApiService {
    @GET("mod_api_cata_extintores_difusor.php")
    suspend fun getVersion(): Response<List<ExtDifusorResponse>>
}

/*
****************************************************************************************************
* EL CAMPO 18 LICENCIA DE FUNCIONAMIENTO: APLICA UNICAMENTE PARA RESTAURANTES Y CONTIENE
* EL NUMERO DE LA LICENCIA MUNICIPAL DE FUNCIONAMIENTO, ES UN STR(250). NO ES UN CATALOGO.
****************************************************************************************************
* */

/*
****************************************************************************************************
* EL CAMPO 19 OBSERVACIONES: TEXTO LIBRE ESCRITURA, NO OBLIGATORIO
****************************************************************************************************
* */

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

interface ApiService {
    @GET("mod_api_ext_rep_revision_mensual_campos.php")
    suspend fun getVersion(): Response<List<ClientesCamposRepRevResponse>>
}

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

interface ApiService {
    @GET("mod_api_ext_rep_revision_mensual.php")
    suspend fun getVersion(): Response<List<ClientesReporteRevisionMensualResponse>>
}

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

interface ApiService {
    @GET("mod_api_cata_clientes_activos_extintores.php")
    suspend fun getVersion(): Response<List<ClientesExtintoresResponse>>
}

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

interface ApiService {
    @GET("mod_api_cata_extintores_tipo.php")
    suspend fun getVersion(): Response<List<ExtTipoResponse>>
}

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

interface ApiService {
    @GET("mod_api_cata_extintores_capacidad.php")
    suspend fun getVersion(): Response<List<ExtCapacidadResponse>>
}

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

interface ApiService {
    @GET("mod_api_cata_extintores_tipo_capacidad.php")
    suspend fun getVersion(): Response<List<ExtTipoCapacidadResponse>>
}

*/
