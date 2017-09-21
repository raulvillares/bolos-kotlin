package com.raulvillares.kotlin.katas.bolos.produccion

class Partida {
    private val tiradas = mutableListOf<Int>()
    val  resultado : Int
        get() = tiradas.sum()

    fun tirar(bolosDerribados : Int, veces : Int = 1) {
        for (tirada in 1..veces) this.tiradas.add(bolosDerribados)
    }

}