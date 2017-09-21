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
                    tiradas[indiceTirada] == 10 -> {
                        total += 10 + tiradas[indiceTirada+1] + tiradas[indiceTirada+2]
                        indiceTirada += 1
                    }
                    puntosTurno(indiceTirada) == 10 -> {
                        total += puntosTurno(indiceTirada) + puntosExtraSemipleno(indiceTirada)
                        indiceTirada += 2
                    }
                    else -> {
                        total += puntosTurno(indiceTirada)
                        indiceTirada += 2
                    }
                }
            }
            return total
        }

    private fun puntosTurno(indiceTirada : Int) = tiradas[indiceTirada] + tiradas[indiceTirada+1]
    private fun puntosExtraSemipleno(indiceTirada : Int) = tiradas[indiceTirada+2]

    fun tirar(bolosDerribados : Int, veces : Int = 1) {
        for (tirada in 1..veces) this.tiradas.add(bolosDerribados)
    }

}