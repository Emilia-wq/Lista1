package com.example.zadania

import Heron
import org.junit.Test

import org.junit.Assert.*

/**
 *@author Emilia Romanowska
 */
class ExampleUnitTest {
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
}