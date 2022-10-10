package composelab.dajee.home.network.dtos


data class AccountDto(
    val accountUid: String,
    val defaultCategory: String,
    val currency: String,
    val createdAt: String
)