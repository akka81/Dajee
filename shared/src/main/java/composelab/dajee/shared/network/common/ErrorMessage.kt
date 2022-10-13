package composelab.dajee.shared.network.common

data class ErrorMessage(
    val size: Int,
    val error: String,
    val error_description: String
)

val defaultError = ErrorMessage(10,"Generic error", "Generic error")