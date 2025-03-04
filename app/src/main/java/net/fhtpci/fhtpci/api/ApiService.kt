package net.fhtpci.fhtpci.api

import net.fhtpci.fhtpci.model.VersionResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("mod_api_regresa_version_app.php")
    suspend fun getVersion(): Response<List<VersionResponse>>
}
