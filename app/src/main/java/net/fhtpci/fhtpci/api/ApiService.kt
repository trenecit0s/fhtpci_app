package net.fhtpci.fhtpci.api

import net.fhtpci.fhtpci.model.AccesoUsuarioResponse
import net.fhtpci.fhtpci.model.ClientesActivosResponse
import net.fhtpci.fhtpci.model.ClientesActivosTecnicoResponse
import net.fhtpci.fhtpci.model.ClientesCamposRepRevResponse
import net.fhtpci.fhtpci.model.ClientesExtintoresResponse
import net.fhtpci.fhtpci.model.ClientesReporteRevisionMensualResponse
import net.fhtpci.fhtpci.model.DispositivoResponse
import net.fhtpci.fhtpci.model.ExtAlturaResponse
import net.fhtpci.fhtpci.model.ExtBaseResponse
import net.fhtpci.fhtpci.model.ExtCapacidadResponse
import net.fhtpci.fhtpci.model.ExtDifusorResponse
import net.fhtpci.fhtpci.model.ExtEstadoResponse
import net.fhtpci.fhtpci.model.ExtMangueraResponse
import net.fhtpci.fhtpci.model.ExtManometroResponse
import net.fhtpci.fhtpci.model.ExtPinturaResponse
import net.fhtpci.fhtpci.model.ExtPresionResponse
import net.fhtpci.fhtpci.model.ExtSeguroResponse
import net.fhtpci.fhtpci.model.ExtSenialResponse
import net.fhtpci.fhtpci.model.ExtTipoCapacidadResponse
import net.fhtpci.fhtpci.model.ExtTipoResponse
import net.fhtpci.fhtpci.model.VersionResponse
import net.fhtpci.fhtpci.model.ZonasClientesActivosResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("mod_api_revisa_acceso_usuario.php")
    suspend fun getAccesoUsuario(
        @Query("kcve_usuario") userKey: String,
        @Query("kpwd_usuario") userPassword: String
    ): Response<AccesoUsuarioResponse>

    @GET("mod_api_cata_clientes_activos.php")
    suspend fun getClientesActivos(): Response<List<ClientesActivosResponse>>

    // ESTE PIDE EL PARAMETRO DEL ID DEL TECNICO
    @GET("mod_api_cata_clientes_activos_x_tecnico.php")
    suspend fun getClientesActivosTecnico(
        @Query("cual_tecnico") tecnicoKey: String
    ): Response<List<ClientesActivosTecnicoResponse>>

    // ESTE PIDE EL PARAMETRO DEL ID DEL CLIENTE
    @GET("mod_api_ext_rep_revision_mensual_campos.php")
    suspend fun getClientesCamposRepRev(
        @Query("cual_cliente") clienteKey: String
    ): Response<List<ClientesCamposRepRevResponse>>

    // ESTE PIDE EL PARAMETRO DEL ID DEL CLIENTE
    @GET("mod_api_cata_clientes_activos_extintores.php")
    suspend fun getClientesExtintores(
        @Query("cual_cliente") clienteKey: String
    ): Response<List<ClientesExtintoresResponse>>

    // ESTE PIDE EL PARAMETRO DEL ID DEL CLIENTE, ANIO Y MES
    @GET("mod_api_ext_rep_revision_mensual_campos.php")
    suspend fun getClientesReporteRevisionMensual(
        @Query("cual_cliente") clienteKey: String,
        @Query("cual_anio") anioKey: String,
        @Query("cual_mes") mesKey: String
    ): Response<List<ClientesReporteRevisionMensualResponse>>

    @GET("mod_api_cata_dispositivo.php")
    suspend fun getDispositivo(): Response<List<DispositivoResponse>>

    @GET("mod_api_cata_extintores_altura.php")
    suspend fun getExtAltura(): Response<List<ExtAlturaResponse>>

    @GET("mod_api_cata_extintores_base.php")
    suspend fun getExtBase(): Response<List<ExtBaseResponse>>

    @GET("mod_api_cata_extintores_capacidad_activos.php")
    suspend fun getExtCapacidad(): Response<List<ExtCapacidadResponse>>

    @GET("mod_api_cata_extintores_difusor.php")
    suspend fun getExtDifusor(): Response<List<ExtDifusorResponse>>

    @GET("mod_api_cata_extintores_estado.php")
    suspend fun getExtEstado(): Response<List<ExtEstadoResponse>>

    @GET("mod_api_cata_extintores_manguera.php")
    suspend fun getExtManguera(): Response<List<ExtMangueraResponse>>

    @GET("mod_api_cata_extintores_manometro.php")
    suspend fun getExtManometro(): Response<List<ExtManometroResponse>>

    @GET("mod_api_cata_extintores_pintura.php")
    suspend fun getExtPintura(): Response<List<ExtPinturaResponse>>

    @GET("mod_api_cata_extintores_presion.php")
    suspend fun getExtPresion(): Response<List<ExtPresionResponse>>

    @GET("mod_api_cata_extintores_seguro.php")
    suspend fun getExtSeguro(): Response<List<ExtSeguroResponse>>

    @GET("mod_api_cata_extintores_senial.php")
    suspend fun getExtSenial(): Response<List<ExtSenialResponse>>

    @GET("mod_api_cata_extintores_tipo_capacidad.php")
    suspend fun getExtTipoCapacidad(): Response<List<ExtTipoCapacidadResponse>>

    @GET("mod_api_cata_extintores_tipo.php")
    suspend fun getExtTipo(): Response<List<ExtTipoResponse>>

    @GET("mod_api_regresa_version_app.php")
    suspend fun getVersion(): Response<List<VersionResponse>>

    @GET("mod_api_cata_clientes_zonas_activos.php")
    suspend fun getZonasClientesActivos(): Response<List<ZonasClientesActivosResponse>>

}