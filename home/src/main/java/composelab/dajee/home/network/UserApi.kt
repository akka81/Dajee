package composelab.dajee.home.network

import composelab.dajee.home.network.dtos.UserDto
import retrofit2.http.GET
import retrofit2.http.Header

interface UserApi {

    @GET("api/v2/identity/individual")
    suspend fun getUser(
        @Header("Accept") value: String = "application/json"
    ): UserDto
}