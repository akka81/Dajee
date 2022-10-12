package composelab.dajee.shared.network.dto.transactions

import composelab.dajee.shared.network.dto.account.AmountDto

data class TransactionsDto(
    val feedItems: List<FeedItemDto>
)

data class FeedItemDto(

    val feedItemUid: String,
    val categoryUid: String,
    val amount: AmountDto,
    // val sourceAmount: SourceAmount,
    // val direction: String,
    // val updatedAt: String,
    val transactionTime: String,
    //val settlementTime: String?,
    // val source: String,
    //val sourceSubType: String?,
    //val status: String,
    // val counterPartyType: String,
    // val counterPartyUid: String,
    val counterPartyName: String,
    //val counterPartySubEntityUid: String,
    //val reference: String,
    //val country: String,
    val spendingCategory: SpendingCategoryDto
)

enum class SpendingCategoryDto {
    PAYMENTS, EATING_OUT,
    INCOME,
    GENERAL
}
