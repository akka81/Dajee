package composelab.dajee.feature1.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun Feature1TestScreen(
    userName:String
){

   Box(
       Modifier.background(Color.White).fillMaxSize(),
       contentAlignment = Alignment.Center
   ) {
       Text(
           color = Color.Black,
           fontSize = 15.sp,
           text = "hello $userName",
           textAlign = TextAlign.Center
       )
   }
}

@Preview
@Composable
fun TestScreen(){
    Feature1TestScreen("Marco")
}

