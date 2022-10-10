package composelab.dajee.home.network.dtos

data class AccountBalanceDto(
    val acceptedOverdraft: AmountDto,
    val amount: AmountDto,
    val clearedBalance: AmountDto,
    val effectiveBalance: AmountDto,
    val pendingTransactions: AmountDto
)