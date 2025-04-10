package com.j0e101.harakamall.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.j0e101.harakamall.R
import com.j0e101.harakamall.navigation.ROUT_START
import com.j0e101.harakamall.ui.theme.neworange2
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){
    //Navigation
    val coroutine = rememberCoroutineScope()
    coroutine.launch {

        delay(2000)
        navController.navigate(ROUT_START)

    }

    //End of navigation
    









    Column(
        // Brackets For styling
        modifier = Modifier.fillMaxSize().background(neworange2),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
    // Calibrace For passing content
        Image(
            painter = painterResource(R.drawable.product),
            contentDescription = "home",
            modifier = Modifier.size(200.dp),

        )
        Spacer(modifier = Modifier.width(20.dp))

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "HarakaMall",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold



        )














    }














}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())


}
