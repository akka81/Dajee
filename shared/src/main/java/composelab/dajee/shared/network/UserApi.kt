package composelab.dajee.shared.network

import composelab.dajee.shared.network.dto.user.UserDto
import retrofit2.http.GET
import retrofit2.http.Header

interface UserApi {

    @GET("api/v2/identity/individual")
    suspend fun getUser(
        @Header("Accept") value: String = "application/json"
    ): UserDto
}