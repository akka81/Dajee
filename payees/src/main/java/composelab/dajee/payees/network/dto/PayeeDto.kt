package composelab.dajee.payees.network.dto


data class PayeeDto(
    val accounts: List<PayeeAccountDto>,
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