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
        comprobarResultado(0)
    }

    @Test
    fun todoUnos() {
        crearPartida()
        partida.tirar(1, 20)
        comprobarResultado(20)
    }

    @Test
    fun unSemipleno() {
        crearPartida()
        semipleno()
        partida.tirar(3)
        partida.tirar(0, 17)
        comprobarResultado(16)
    }

    private fun semipleno() {
        this.partida.tirar(5)
        this.partida.tirar(5)
    }

    private fun comprobarResultado(resultadoEsperado : Int) = assertEquals(resultadoEsperado, partida.resultado)

}