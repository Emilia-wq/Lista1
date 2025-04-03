package com.example.zadania

import Heron
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
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
        assertEquals(6.0, poleTrojkata1,0.0)
    }
}