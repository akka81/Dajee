package composelab.dajee.shared.network.dto.account


data class AccountDto(
    val accountUid: String,
    val defaultCategory: String,
    val currency: String,
    val createdAt: String
)