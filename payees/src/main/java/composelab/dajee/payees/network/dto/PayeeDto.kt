package composelab.dajee.payees.network.dto

import com.davidm.payees.entities.PayeeAccount


data class PayeeDto(
    val accounts: List<PayeeAccount>,
    val businessName: String?,
    val dateOfBirth: String?,
    val firstName: String?,
    val lastName: String?,
    val middleName: String?,
    val payeeName: String,
    val payeeType: PayeeType?,
    val payeeUid: String,
    val phoneNumber: String?
)

data class PayeeListDto(
    val payees: List<PayeeDto>
)

enum class PayeeType {
    BUSINESS, INDIVIDUAL,
}