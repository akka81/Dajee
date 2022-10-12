package composelab.dajee.shared.network

import composelab.dajee.shared.network.dto.transactions.FeedItemDto
import composelab.dajee.shared.network.dto.transactions.TransactionsDto
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface TransactionsApi {

    @GET("api/v2/feed/account/{account}/category/{category}/transactions-between")
    suspend fun getTransactionsInAWeek(
        @Path("account") account: String,
        @Path("category") category: String,
        @Query("minTransactionTimestamp") minTime: String,
        @Query("maxTransactionTimestamp") maxTime: String,
        @Header("Accept") value: String = "application/json"
    ): TransactionsDto

    @GET("/api/v2/feed/account/{accountUid}/category/{categoryUid}/{feedItemUid}")
    suspend fun getTransaction(
        @Path("accountUid") accountId: String,
        @Path("categoryUid") categoryId: String,
        @Path("feedItemUid") feedItemId: String,
    ): FeedItemDto
}