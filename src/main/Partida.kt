package com.raulvillares.kotlin.katas.bolos.produccion

val Int.esSemipleno
    get() = this == 10

class Partida {
    private val tiradas = mutableListOf<Int>()
    val  resultado : Int
        get() {
            var total = 0
            var indiceTirada = 0
            for(turno in 1..10) {
                when {
                    esPleno(indiceTirada) -> {
                        total += 10 + puntosExtraPleno(indiceTirada)
                        indiceTirada += 1
                    }
                    esSemipleno(indiceTirada) -> {
                        total += 10 + puntosExtraSemipleno(indiceTirada)
                        indiceTirada += 2
                    }
                    else -> {
                        total += puntosTiradaNormal(indiceTirada)
                        indiceTirada += 2
                    }
                }
            }
            return total
        }

    private fun esPleno(indiceTirada : Int) = tiradas[indiceTirada] == 10
    private fun esSemipleno(indiceTirada : Int) = tiradas[indiceTirada] + tiradas[indiceTirada+1] == 10
    private fun puntosTiradaNormal(indiceTirada : Int) = tiradas[indiceTirada] + tiradas[indiceTirada+1]
    private fun puntosExtraSemipleno(indiceTirada : Int) = tiradas[indiceTirada+2]
    private fun puntosExtraPleno(indiceTirada : Int) = tiradas[indiceTirada+1] + tiradas[indiceTirada+2]

    fun tirar(bolosDerribados : Int, veces : Int = 1) {
        for (tirada in 1..veces) this.tiradas.add(bolosDerribados)
    }

}