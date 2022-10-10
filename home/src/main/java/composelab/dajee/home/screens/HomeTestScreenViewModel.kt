package composelab.dajee.home.screens

import androidx.lifecycle.ViewModel


class HomeTestScreenViewModel: ViewModel(){

    private var testStateValue = 0


    fun setTestValue(){
        testStateValue +=1
    }


    fun getTetValue():Int = testStateValue
}