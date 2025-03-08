package net.fhtpci.fhtpci.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// URL DE LA API EN EL SERVIDOR WEB.
object ApiClient {
    private const val BASE_URL = "https://fhtpci.net/api/"

    val instance: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}
