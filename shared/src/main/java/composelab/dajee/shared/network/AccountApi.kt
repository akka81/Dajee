package composelab.dajee.shared.network;

import composelab.dajee.shared.network.dto.account.AccountBalanceDto;
import composelab.dajee.shared.network.dto.account.AccountHolderDto;
import composelab.dajee.shared.network.dto.account.AccountsDto;
import okhttp3.RequestBody
import retrofit2.http.*

interface AccountApi {

    @GET("api/v2/accounts")
    suspend fun getAccounts(
        @Header("Accept") value: String = "application/json"
    ): AccountsDto

    @GET("api/v2/accounts/{accountId}/balance")
    suspend fun getAccountBalance(
        @Path("accountId") accountId: String,
        @Header("Accept") value: String = "application/json"
    ): AccountBalanceDto


    @GET("api/v2/account-holder")
    suspend fun getAccountHolder(
        @Header("Accept") value: String = "application/json"
    ): AccountHolderDto

    @GET("api/v2/account-holder/{accountHolder}/profile-image")
    suspend fun getAccountPicture(
        @Header("Accept") value: String = "application/json",
        @Path("accountHolder") accountHolder: String,
    ): String

    @PUT("api/v2/account-holder/{accountHolder}/profile-image")
    suspend fun uploadAccountPicture(
        @Header("Content-type") value: String = "image/jpeg",
        @Path("accountHolder") accountHolder: String,
        @Body requestBody: RequestBody
    ): ArrayList<String>?
}
