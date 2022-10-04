package composelab.dajee.feature1.screens

import androidx.lifecycle.ViewModel


class Feature1TestScreenViewModel: ViewModel(){

    private var testStateValue = 0


    fun setTestValue(){
        testStateValue +=1
    }


    fun getTetValue():Int = testStateValue
}