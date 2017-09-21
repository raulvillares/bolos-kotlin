package com.raulvillares.kotlin.katas.bolos.produccion

val Int.esSemipleno
    get() = this == 10

class Partida {
    private val tiradas = mutableListOf<Int>()
    val  resultado : Int
        get() {
            var total = 0
            for(indiceTurno in 0..19 step 2) {
                val bolosDerribados = puntosTurno(indiceTurno)
                total += bolosDerribados
                total += if(bolosDerribados.esSemipleno) puntosExtraSemipleno(indiceTurno) else 0
            }
            return total
        }

    private fun puntosTurno(indiceTurno : Int) = tiradas[indiceTurno] + tiradas[indiceTurno+1]
    private fun puntosExtraSemipleno(indiceTurno : Int) = tiradas[indiceTurno+2]

    fun tirar(bolosDerribados : Int, veces : Int = 1) {
        for (tirada in 1..veces) this.tiradas.add(bolosDerribados)
    }

}