package com.dam.laprimera

import android.util.Log
import androidx.lifecycle.ViewModel



class MyViewModel() : ViewModel() {

    private val TAG_LOG: String = "mensaje ViewModel"

    var appData = AppData()

    init {
        Log.d(TAG_LOG, "Inicializamos ViewModel")
    }

    fun crearRandom(){
        appData._numbers = (0..3).random()
        appData.listaRandom.add(appData._numbers)
        Log.d(TAG_LOG, "Añado el ${appData._numbers}")
        for(numero in appData.listaRandom){
            Log.d(TAG_LOG,"Lista de números random: $numero")
        }
    }

    fun getNumero(): Int {
        return appData._numbers
    }

    fun getNumerosRandom(): List<Int>{
        return appData.listaRandom.toList()
    }

    fun contador(){
        appData.counter++
    }

    fun getContador():Int{
        return appData.counter
    }

    fun getString(): String{
        return appData.name
    }
}
