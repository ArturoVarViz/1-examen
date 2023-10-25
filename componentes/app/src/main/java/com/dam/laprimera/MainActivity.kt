package com.dam.laprimera

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.dam.laprimera.ui.theme.LaPrimeraTheme


val TAG: String = "estado"
val name: String = "Android"

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val miViewModel: MyViewModel = MyViewModel()

        setContent {

            LaPrimeraTheme {

                Surface(//Representa una superficie de la interfaz. Pasando cursor, nos pone las propiedades permitidas (color..)

                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {


                   IU3(miViewModel)


                }
            }
        }
        Log.d(TAG, "Estoy en on Create")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "He llegado al onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "He llegado al onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "He llegado al onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "He llegado al onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "He llegado al onDestroy")
    }


}



