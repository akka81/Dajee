package composelab.dajee.payees.network.dto

import composelab.dajee.shared.network.common.ErrorMessage

data class PayeeCreationResponse(
    val consentInformation: ConsentInformation?,
    val errors: List<ErrorMessage>?,
    val payeeUid: String?,
    val success: Boolean
)

data class ConsentInformation(
    val approvalType: String
)
