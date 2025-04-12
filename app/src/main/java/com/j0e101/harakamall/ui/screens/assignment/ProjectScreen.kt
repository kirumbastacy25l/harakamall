package com.j0e101.harakamall.ui.screens.assignment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.j0e101.harakamall.R
import com.j0e101.harakamall.navigation.ROUT_HOME
import com.j0e101.harakamall.ui.theme.blue
import com.j0e101.harakamall.ui.theme.green
import com.j0e101.harakamall.ui.theme.neworange
import com.j0e101.harakamall.ui.theme.neworange1
import com.j0e101.harakamall.ui.theme.newwhite
import com.j0e101.harakamall.ui.theme.newwhite2
import com.j0e101.harakamall.ui.theme.pink


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProjectScreen(navController: NavController){
    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("Projects") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back/nav */ }) {
                        androidx.compose.material3.Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = neworange,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White
                )
            )
        },

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = newwhite2
            ){
                NavigationBarItem(
                    icon = { androidx.compose.material3.Icon(Icons.Default.Home, contentDescription = "Home", tint = pink) },

                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { androidx.compose.material3.Icon(Icons.Default.DateRange, contentDescription = "Favorites") },

                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { androidx.compose.material3.Icon(Icons.Default.List, contentDescription = "Profile") },

                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    },


                    )
                NavigationBarItem(
                    icon = { androidx.compose.material3.Icon(Icons.Default.AccountCircle, contentDescription = "Info") },

                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )




            }
        },


        //Content
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .padding(start = 10.dp,end = 10.dp)

                    .horizontalScroll(rememberScrollState())
            ) {
                Spacer(modifier = Modifier.height(100.dp))


                //Main Contents of the page
                Text(text = "Hi Samantha", fontSize = 30.sp
                )
                Spacer(modifier = Modifier.run { height(8.dp) })
                Text("Here are your projects!..")
                Spacer(modifier = Modifier.height(20.dp))

                Row (modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {
                    //Card1
                    Card(
                        modifier = Modifier
                            .width(150.dp)
                            .height(250.dp),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(blue),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,

                            ) {
                            Image(
                                painter = painterResource(R.drawable.bar),
                                contentDescription = "home",
                                modifier = Modifier.fillMaxWidth().height(70.dp),
                            )
                            Text(text = "Cryptocurrency landing page", fontSize = 15.sp, textAlign = TextAlign.Center)
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(text = "12 picks", fontSize = 15.sp)


                        }


                    }
                    //End of card1
                    Spacer(modifier = Modifier.width(20.dp))
                    //Card2
                    Card(
                        modifier = Modifier
                            .width(150.dp)
                            .height(250.dp),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(neworange1),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,

                            ) {
                            Image(
                                painter = painterResource(R.drawable.img_1),
                                contentDescription = "home",
                                modifier = Modifier.fillMaxWidth().height(70.dp),
                            )
                            Text(text = "Statistics Dashboard", fontSize = 15.sp)
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(text = "12 picks", fontSize = 15.sp)


                        }


                    }
                    //End of card2
                    Spacer(modifier = Modifier.width(20.dp))
                    //Card3
                    Card(
                        modifier = Modifier
                            .width(150.dp)
                            .height(250.dp),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(green),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,

                            ) {
                            Image(
                                painter = painterResource(R.drawable.bar),
                                contentDescription = "home",
                                modifier = Modifier.fillMaxWidth().height(70.dp),
                            )
                            Text(text = "DataBase", fontSize = 15.sp)
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(text = "12 picks", fontSize = 15.sp)


                        }


                    }
                    //End of card3




                }
                //End of Row
                Spacer(modifier = Modifier.height(20.dp))

                //Box
                Box () {

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(newwhite)
                    ) {


                        Card(
                            modifier = Modifier
                                .width(900.dp)
                                .height(70.dp)
                                .background(newwhite2)

                                .padding(start = 0.dp, end = 20.dp)
                                .offset(y=90.dp)

                        ) {
                            Row {

                                Image(
                                    painter = painterResource(R.drawable.img),
                                    contentDescription = "home",
                                    modifier = Modifier.width(30.dp).height(30.dp),
                                )
                                Spacer(modifier = Modifier.width(20.dp))
                                Column {
                                    Text(
                                        text = "NDA Review for website project",
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.ExtraBold

                                    )
                                    Spacer(modifier = Modifier.height(5.dp))
                                    Text(
                                        text = "Today - 10pm",
                                        fontSize = 20.sp,


                                        )
                                }
                            }






                        }
                        //CONTENTS OF CARD1
                        Spacer(modifier = Modifier.height(20.dp))
                        Card(
                            modifier = Modifier
                                .width(900.dp)
                                .height(70.dp)

                                .padding(start = 0.dp, end = 20.dp)
                                .offset(y=90.dp)
                        ) {
                            Row {
                                Image(
                                    painter = painterResource(R.drawable.email),
                                    contentDescription = "home",
                                    modifier = Modifier.width(30.dp).height(30.dp),
                                )
                                Spacer(modifier = Modifier.width(20.dp))
                                Column {
                                    Text(
                                        text = "Email Reply for Green Project",
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.ExtraBold

                                    )
                                    Spacer(modifier = Modifier.height(5.dp))
                                    Text(
                                        text = "Today - 10pm",
                                        fontSize = 20.sp,


                                        )
                                }
                            }






                        }
                        //CONTENTS OF CARD2
                    }




                }
                //End of box
                Spacer(modifier = Modifier.height(100.dp))













            }
            //End of the main column
        }
    )

    //End of scaffold
































}

@Preview(showBackground = true)
@Composable
fun ProjectScreenPreview(){
    ProjectScreen(rememberNavController())


}