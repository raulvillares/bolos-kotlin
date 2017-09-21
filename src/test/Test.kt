package com.raulvillares.kotlin.katas.bolos.test

import com.raulvillares.kotlin.katas.bolos.produccion.Partida
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class BolosTest {

    lateinit var partida : Partida

    @BeforeEach
    fun crearPartida() {
        partida = Partida()
    }

    @Test
    fun peorPartida() {
        crearPartida()
        for(tirada in 1..20) partida.tirar(0)
        assertEquals(0, partida.resultado)
    }

    @Test
    fun todoUnos() {
        crearPartida()
        for(tirada in 1..20) partida.tirar(1)
        assertEquals(20, partida.resultado)
    }

}