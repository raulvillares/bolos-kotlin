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
        partida.tirar(0, 20)
        assertEquals(0, partida.resultado)
    }

    @Test
    fun todoUnos() {
        crearPartida()
        partida.tirar(1, 20)
        assertEquals(20, partida.resultado)
    }

    @Test
    fun unSpare() {
        crearPartida()
        partida.tirar(5)
        partida.tirar(5)
        partida.tirar(3)
        partida.tirar(0, 17)
        assertEquals(16, partida.resultado)
    }

}