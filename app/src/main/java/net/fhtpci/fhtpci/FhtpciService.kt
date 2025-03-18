package net.fhtpci.fhtpci

import retrofit2.http.GET

interface FhtpciService {


    @GET(Constants.PATH_FHTPCI)
    suspend fun getAccesoUsuario()


    @GET(Constants.PATH_FHTPCI)
    suspend fun getClientesActivos()


    @GET(Constants.PATH_FHTPCI)
    suspend fun getClientesActivosTecnico()


    @GET(Constants.PATH_FHTPCI)
    suspend fun getClientesCamposRepRev()


    @GET(Constants.PATH_FHTPCI)
    suspend fun getClientesExtintores()


    @GET(Constants.PATH_FHTPCI)
    suspend fun getClientesReporteRevisionMensual()

    @GET(Constants.PATH_FHTPCI)
    suspend fun getDispositivo()

    @GET(Constants.PATH_FHTPCI)
    suspend fun getExtAltura()

    @GET(Constants.PATH_FHTPCI)
    suspend fun getExtBase()

    @GET(Constants.PATH_FHTPCI)
    suspend fun getExtCapacidad()

    @GET(Constants.PATH_FHTPCI)
    suspend fun getExtDifusor()

    @GET(Constants.PATH_FHTPCI)
    suspend fun getExtEstado()

    @GET(Constants.PATH_FHTPCI)
    suspend fun getExtManguera()

    @GET(Constants.PATH_FHTPCI)
    suspend fun getExtManometro()

    @GET(Constants.PATH_FHTPCI)
    suspend fun getExtPintura()

    @GET(Constants.PATH_FHTPCI)
    suspend fun getExtPresion()

    @GET(Constants.PATH_FHTPCI)
    suspend fun getExtSeguro()

    @GET(Constants.PATH_FHTPCI)
    suspend fun getExtSenial()

    @GET(Constants.PATH_FHTPCI)
    suspend fun getExtTipoCapacidad()

    @GET(Constants.PATH_FHTPCI)
    suspend fun getExtTipo()

    @GET(Constants.PATH_FHTPCI)
    suspend fun getAPPVersion()

    @GET(Constants.PATH_FHTPCI)
    suspend fun getZonasClientesActivos()

}