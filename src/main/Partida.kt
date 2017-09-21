package com.raulvillares.kotlin.katas.bolos.produccion

class Partida {
    var resultado : Int = 0

    fun tirar(bolosDerribados : Int, veces : Int = 1) {
        for (tirada in 1..veces) this.resultado += bolosDerribados
    }

}