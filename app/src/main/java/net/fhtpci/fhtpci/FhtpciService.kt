package net.fhtpci.fhtpci

import retrofit2.http.GET

interface FhtpciService {
    @GET(Constants.PATH_FHTPCI)
    suspend fun getAPPVersion()
}