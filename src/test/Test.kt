package com.raulvillares.kotlin.katas.bolos.test

import com.raulvillares.kotlin.katas.bolos.produccion.Partida
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BolosTest {

    @Test
    fun crearPartida() {
        val partida = Partida()
    }

    @Test
    fun peorPartida() {
        val partida = Partida()
        partida.tirar(0)
    }

}