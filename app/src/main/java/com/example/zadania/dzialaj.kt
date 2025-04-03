import kotlin.math.sqrt

/**
 *@author Emilia Romanowska
 */
/**
 *@param a - bok trójkąta
 * @param b - bok trójkąta
 * @param c - bok trójkąta
 * @return double
 */

fun Heron(a: Double, b: Double, c: Double): Double {
    if (a <= 0) {
        throw Exception("Boki trojkata musza miec wartosc > od 0")
    } else if (b <= 0) {
        throw Exception("Boki trojkata musza miec wartosc > od 0")
    } else if (c <= 0) {
        throw Exception("Boki trojkata musza miec wartosc > od 0")
    }

    if (a >= b + c) {
        throw Exception("Dwa boki trojkata musza być wieksze niz trzeci bok")
    } else if (b >= a + c) {
        throw Exception("Dwa boki trojkata musza być wieksze niz trzeci bok")
    } else if (c >= a + b) {
        throw Exception("Dwa boki trojkata musza być wieksze niz trzeci bok")
    }

    val p = (a + b + c) / 2

    return sqrt(p * (p - a) * (p - b) * (p - c))
}

//Zadanie 3
fun wspolne(multiZbiorX: List<Int>, multiZbiorY: List<Int>): List<Int> {
    return multiZbiorX.intersect(multiZbiorY).toList()
}
fun podzbiory(n: List<Int>) :ArrayList<List<Int>> {

    val wyniki = ArrayList<List<Int>>()

    for (i in 0..n.size) {
        for (j in 0..n.size) {
            if (i < j) {
                wyniki.add(n.subList(i, j))
            }
        }
    }
    return wyniki
}

//Zadanie 4



fun main() {
    //Zadanie 1
    try {
        val bokA1 = 3.0
        val bokB1 = 4.0
        val bokC1 = 5.0

        val poleTrojkata1 = Heron(bokA1, bokB1, bokC1)
        println("Pole trojkata wynosi $poleTrojkata1")
    } catch (e: Exception) {
        println("Wystapil blad $e")
    }
    try {
        val bokA2 = 12.0
        val bokB2 = 12.0
        val bokC2 = 12.0

        val poleTrojkata2 = Heron(bokA2, bokB2, bokC2)
        println("Trojkat rownoboczny o polu = $poleTrojkata2")
    } catch (e: Exception) {
        println("Wystapil blad $e")
    }
    try {
        val bokA3 = 0.0
        val bokB3 = 13.0
        val bokC3 = 14.0

        val poleTrojkata3 = Heron(bokA3, bokB3, bokC3)
        println("Bledne dane, bok trojkata nie moze = 0 ")
    } catch (e: Exception) {
        println("Wystapil blad $e")
    }
    try {
        val bokA4 = 1.0
        val bokB4 = 13.0
        val bokC4 = 14.0

        val poleTrojkata4 = Heron(bokA4, bokB4, bokC4)
        println("Bledne dane, dwa boki trojkata musza byc wieksze niz trzeci bok ")
    } catch (e: Exception) {
        println("Wystapil blad $e")

    }

    //Zadanie 2

    val multiZbiorX1 = listOf(1, 2, 3, 4, 5, 6, 7)
    val multiZbiorY1 = listOf(1, 3, 5, 7, 9, 11, 13)
    val czescWspolna1 = wspolne(multiZbiorX1, multiZbiorY1)
    println("Dla multiZbioru X1 = $multiZbiorX1 i multiZbioru Y1 = $multiZbiorY1 czescWspolna = $czescWspolna1 ")

    val multiZbiorX2 = listOf(1, 2, 3, 4, 5, 6, 7)
    val multiZbiorY2 = listOf(8, 9, 10, 11, 12, 13)
    val czescWspolna2 = wspolne(multiZbiorX2, multiZbiorY2)
    println("Dla multiZbioru X2 = $multiZbiorX2 i multiZbioru Y2 = $multiZbiorY2 czescWspolna = $czescWspolna2 ")

    val multiZbiorX3 = listOf(1, 2, 3, 4, 5, 6, 7)
    val multiZbiorY3 = listOf(1, 2, 3, 4, 5, 6, 7)
    val czescWspolna3 = wspolne(multiZbiorX3, multiZbiorY3)
    println("Dla multiZbioru X3 = $multiZbiorX3 i multiZbioru Y3 = $multiZbiorY3 czescWspolna = $czescWspolna3 ")

    val multiZbiorX4 = listOf(1, 1, 2, 2, 5, 6, 7)
    val multiZbiorY4 = listOf(1, 1, 1, 2, 3, 4, 5, 7, 7)
    val czescWspolna4 = wspolne(multiZbiorX4, multiZbiorY4)
    println("Dla multiZbioru X4 = $multiZbiorX4 i multiZbioru Y4 = $multiZbiorY4 czescWspolna = $czescWspolna1 ")

    val multiZbiorX5 = listOf(1, 2, 3, 4, 5, 6, 7)
    val multiZbiorY5 = listOf<Int>()
    val czescWspolna5 = wspolne(multiZbiorX5, multiZbiorY5)
    println("Dla multiZbioru X5 = $multiZbiorX5 i multiZbioru Y5 = $multiZbiorY5 czescWspolna = $czescWspolna5 ")


    //Zadanie 3
    val zbior1 = listOf(1, 2, 3)
    val podzbioryWynik = podzbiory(zbior1)
    println("Wynik dla podzbiorow = $podzbioryWynik")
}




