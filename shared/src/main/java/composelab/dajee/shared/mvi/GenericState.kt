package composelab.dajee.shared.mvi

sealed class GenericState<out T: GenericModel> {
    object Idle: GenericState<Nothing>()
    object Loading : GenericState<Nothing>()
    data class Error(val message: String?, val cause: Exception? = null) : GenericState<Nothing>()
    data class Success<out T : GenericModel>(val value: T) : GenericState<T>()
}

val <T: GenericModel> T.cast: T
    get() = this

// https://blog.devgenius.io/kotlin-sealed-class-with-generic-covariance-7e33875e7002
