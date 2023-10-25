package com.dam.laprimera

data class AppData(
    var _numbers: Int = 0,
    var counter: Int = 0,
    var name: String = "",
    val listaRandom: MutableList<Int> = mutableListOf()
)