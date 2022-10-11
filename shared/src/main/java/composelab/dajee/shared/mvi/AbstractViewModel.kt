package composelab.dajee.shared.mvi

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.channels.Channel
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.consumeAsFlow
import kotlinx.coroutines.launch

/*
        1: All' init del viewModel viene creato il canale di comunicazione
        2: Il fragment chiama il metodo userIntent.send(GenericIntent.Fetch) per spedire l'intento generato dall'utente
        3: Quando il ViewModel riceve l'intento:
            3a: Imposta lo stato di Loading
            3b: Chiama il metodo callRepository()
            3c: E infine in base alla risposta imposta lo stato di Success o di Error
        4: Infine il fragment osserva il cambiamento dello stato e visualizza la view collegata ad esso.
*/

abstract class AbstractViewModel<T: GenericModel>: ViewModel() {

    val userIntent = Channel<GenericIntent>(Channel.UNLIMITED)
    var state = mutableStateOf<GenericState<T>>(GenericState.Idle)
        private set

    init {
        handleIntent()
    }

    private fun handleIntent() {
        viewModelScope.launch {
            userIntent.consumeAsFlow().collect{ collector ->
               when (collector){
                   is GenericIntent.Fetch -> fetch()
               }
            }
        }
    }

    private fun fetch() {
        viewModelScope.launch {
            state.value = GenericState.Loading
            state.value = try {
                callRepository()
            } catch (e: Exception){
                GenericState.Error(e.localizedMessage,e)
            }
        }
    }

    // Implementando questo metodo si può applicare la logica di chiamate al repo
    abstract fun callRepository(): GenericState<T>

}