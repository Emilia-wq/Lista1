package com.example.zadania

import Heron
import wspolne
import org.junit.Test

import org.junit.Assert.*
import podzbiory

/**
 *@author Emilia Romanowska
 */
class ExampleUnitTest {

    //Zadanie 1

    @Test
    fun heron_isCorrect() {
        //given
        val bokA1 = 3.0
        val bokB1 = 4.0
        val bokC1 = 5.0

        //when
        val poleTrojkata1 = Heron(bokA1, bokB1, bokC1)

        //then
        assertEquals(6.0, poleTrojkata1, 0.0)
    }

    @Test
    fun heronRównoboczny_isCorrect() {
        //given
        val bokA1 = 12.0
        val bokB1 = 12.0
        val bokC1 = 12.0

        //when
        val poleTrojkata2 = Heron(bokA1, bokB1, bokC1)

        //then
        assertEquals(62.353829072479584, poleTrojkata2, 0.0)
    }

    @Test
    fun heron_isntCorrect() {
        //given
        val bokA1 = 0.0
        val bokB1 = 13.0
        val bokC1 = 14.0

        //when
        try {
            val poleTrojkata3 = Heron(bokA1, bokB1, bokC1)
            //then
            assertEquals(1, 2) //Zawsze fail

        } catch (e: Exception) {
            assertEquals(1, 1) //Test przeszedł
        }
    }

    @Test
    fun heron_isntCorrect2() {
        //given
        val bokA1 = 1.0
        val bokB1 = 13.0
        val bokC1 = 14.0

        //when
        try {
            val poleTrojkata3 = Heron(bokA1, bokB1, bokC1)
            //then
            assertEquals(1, 2) //Zawsze fail

        } catch (e: Exception) {
            assertEquals(1, 1) //Test przeszedł
        }
    }

    //Zadanie 2

    @Test
    fun wspolneisCorrect() {

        //given
        val multiZbiorX1 = listOf(1, 2, 3, 4, 5, 6, 7)
        val multiZbiorY1 = listOf(1, 3, 5, 7, 9, 11, 13)

        //when
        val czescWspolna1 = wspolne(multiZbiorX1, multiZbiorY1)

        //then
        assertEquals(listOf(1,3,5,7),czescWspolna1)
    }

    //Zadanie 3
    @Test
    fun podzbioryCorrect() {

        //given
        val zbior1 = listOf(1, 2, 3)

        //when
        val podzbioryWynik = podzbiory(zbior1)

        //then
        assertEquals(6,podzbioryWynik.size)
    }
}