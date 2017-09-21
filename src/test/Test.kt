package com.raulvillares.kotlin.katas.bolos.test

import com.raulvillares.kotlin.katas.bolos.produccion.Partida
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BolosTest {

    @Test
    fun peorPartida() {
        val partida = Partida()
        partida.tirar(0)
        for(tirada in 1..20) partida.tirar(0)
        assertEquals(0, partida.resultado)
    }

}