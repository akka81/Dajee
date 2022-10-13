package composelab.dajee.payees.network

import composelab.dajee.payees.network.dto.PayeeCreationResponse
import composelab.dajee.payees.network.dto.PayeeDto
import composelab.dajee.payees.network.dto.PayeeListDto
import retrofit2.Response
import retrofit2.http.*

interface PayeesApi {

    @GET("api/v2/payees")
    suspend fun getPayees(
        @Header("Accept") value: String = "application/json"
    ): PayeeListDto


    @PUT("api/v2/payees")
    suspend fun createPayee(
        @Body body: PayeeDto,
        @Header("Accept") value: String = "application/json"
    ): Response<PayeeCreationResponse>
}