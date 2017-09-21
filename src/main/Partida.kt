package com.raulvillares.kotlin.katas.bolos.produccion

class Partida {
    private val tiradas = mutableListOf<Int>()
    val  resultado : Int
        get() {
            var total = 0
            for(i in 0..19 step 2) {
                val bolosDerribadosTurno = tiradas[i] + tiradas[i+1]
                total += bolosDerribadosTurno
                if(bolosDerribadosTurno == 10) total += tiradas[i+2]
            }
            return total
        }

    fun tirar(bolosDerribados : Int, veces : Int = 1) {
        for (tirada in 1..veces) this.tiradas.add(bolosDerribados)
    }

}