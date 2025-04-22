package com.j0e101.harakamall.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.j0e101.harakamall.data.UserDatabase
import com.j0e101.harakamall.repository.UserRepository
import com.j0e101.harakamall.ui.screens.about.AboutScreen
import com.j0e101.harakamall.ui.screens.assignment.ProjectScreen
import com.j0e101.harakamall.ui.screens.auth.LoginScreen
import com.j0e101.harakamall.ui.screens.auth.RegisterScreen
import com.j0e101.harakamall.ui.screens.dashboard.DashboardScreen
import com.j0e101.harakamall.ui.screens.form.FormScreen
import com.j0e101.harakamall.ui.screens.form2.Form2Screen
import com.j0e101.harakamall.ui.screens.home.HomeScreen
import com.j0e101.harakamall.ui.screens.intent.IntentScreen
import com.j0e101.harakamall.ui.screens.item.ItemScreen
import com.j0e101.harakamall.ui.screens.service.ServiceScreen
import com.j0e101.harakamall.ui.screens.splash.SplashScreen
import com.j0e101.harakamall.ui.screens.start.StartScreen
import com.j0e101.harakamall.viewmodel.AuthViewModel

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_LOGIN
) {
    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = startDestination,

        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)

        }
        composable(ROUT_START) {
            StartScreen(navController)
        }

        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }


        composable(ROUT_DASHBOARD) {
            DashboardScreen (navController)
        }

        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }


        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }

        composable(ROUT_PROJECT) {
            ProjectScreen(navController)
        }


        composable(ROUT_FORM) {
            FormScreen(navController)
        }


        composable(ROUT_FORM2) {
            Form2Screen(navController)
        }
        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }






    }
}