package com.j0e101.harakamall.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.j0e101.harakamall.R


@Composable
fun StartScreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){
        Text(

            text = "HarakaMall",
            fontSize = 20.sp



        )
        Spacer(modifier = Modifier.height(20.dp))
        //Circular Image
        Image(
            painter = painterResource(R.drawable.tey),
            contentDescription = "home",
            modifier = Modifier.size(300.dp).clip(shape = CircleShape),
            contentScale = ContentScale.Crop

        )
        //End
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Find Your Order!!",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,

        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Shopping is an activity in which a customer browses the available goods or services presented by one or more retailers with the potential intent to purchase a suitable selection of them.",

        )
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            shape = RoundedCornerShape(size = 10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
        ) {
            Text(
                text = "Get Started",
                color = Color.Green
            )
        }













    }

}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){

    StartScreen()


}

