package com.dam.laprimera

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel


class MyViewModel() : ViewModel() {


    private val TAG_LOG: String = "mensaje ViewModel"


    var _numbers = mutableStateOf(0)


    var counter = mutableStateOf(0)

    var name = mutableStateOf("")

    val listaRandom = mutableStateListOf<Int>()



    init {
        Log.d(TAG_LOG, "Inicializamos ViewModel")
    }



    fun crearRandom(){

        _numbers.value = (0..3).random()//el value es por el mutableStateOf


        listaRandom.add(_numbers.value)

        Log.d(TAG_LOG, "Añado el ${_numbers.value}")


        for(numero in listaRandom){
            Log.d(TAG_LOG,"Lista de números random: $numero")
        }

    }


    fun getNumero(): Int {
        return _numbers.value
    }


    fun getNumerosRandom(): List<Int>{
        return listaRandom.toList()
    }


    fun contador(){
        counter.value++
    }


    fun getContador():Int{
        return counter.value
    }


    fun getString(): String{
        return name.value
    }


}