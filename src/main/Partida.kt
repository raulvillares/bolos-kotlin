package com.raulvillares.kotlin.katas.bolos.produccion

class Partida {
    var resultado : Int = 0
    fun tirar(bolosDerribados : Int) {
        this.resultado += bolosDerribados
    }
}