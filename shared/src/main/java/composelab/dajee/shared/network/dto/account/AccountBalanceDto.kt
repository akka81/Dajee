package composelab.dajee.shared.network.dto.account

data class AccountBalanceDto(
    val acceptedOverdraft: AmountDto,
    val amount: AmountDto,
    val clearedBalance: AmountDto,
    val effectiveBalance: AmountDto,
    val pendingTransactions: AmountDto
)