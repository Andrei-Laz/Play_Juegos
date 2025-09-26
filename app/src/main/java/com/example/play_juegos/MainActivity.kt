package com.example.play_juegos

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.play_juegos.ui.theme.Play_JuegosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Play_JuegosTheme {
                val navController = rememberNavController()
                val configuration = LocalConfiguration.current

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    NavHost(
                        navController = navController,
                        startDestination = "menuPrincipal"
                    ) {
                        composable("menuPrincipal") {
                            when (configuration.orientation) {
                                Configuration.ORIENTATION_PORTRAIT -> {
                                    MainMenu(
                                        modifier = Modifier.padding(innerPadding),
                                        navController = navController
                                    )
                                }
                                else -> {
                                    MainMenuLandscape(
                                        modifier = Modifier.padding(innerPadding),
                                        navController = navController
                                    )
                                }
                            }
                        }

                        composable("newPlayer") {
                            NewPlayerMenu(
                                modifier = Modifier.padding()
                            )
                        }
                    }
                }
            }
        }
    }
}
