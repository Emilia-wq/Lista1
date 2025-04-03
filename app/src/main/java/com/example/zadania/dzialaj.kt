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

//Zadanie 2
/**
 *@param multiZbiorX - List
 * @param multiZbiorY - List
 * @return List
 */

fun wspolne(multiZbiorX: List<Int>, multiZbiorY: List<Int>): List<Int> {
    return multiZbiorX.intersect(multiZbiorY).toList()
}

//Zadanie 3

/**
 *@param n - List<Int>
 * @return ArrayList<List<Int>>
 */
fun podzbiory(n: List<Int>): ArrayList<List<Int>> {

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

//Zadanie 3

//a
/**
 *@param n - Int
 * @return List<Int>
 */
fun ciagFibonacci(n: Int): List<Int> {
    if (n <= 0) {
        throw Exception("Liczba elementow n musi byc > 0")
    }
    var pierwszaLiczba = 0
    val listaFib = mutableListOf(pierwszaLiczba)

    var drugaLiczba = 1
    listaFib.add(drugaLiczba)

    for (i in 1..n - 2) {
        val nastepneLiczby = pierwszaLiczba + drugaLiczba

        listaFib.add(nastepneLiczby)

        pierwszaLiczba = drugaLiczba
        drugaLiczba = nastepneLiczby
    }
    return listaFib
}

//b
/**
 *@param n - Int
 * @return Int
 */
fun ciagFibonacciego(n: Int): Int {
    if (n == 0) {
        return 0
    } else if (n == 1) {
        return 1
    } else {
        return ciagFibonacciego(n - 1) + ciagFibonacciego(n - 2)
    }
}

/**
 *@param n - Int
 * @return List<Int>
 */
fun ciagFibonacciego2(n: Int): List<Int> {
    if (n <= 0) {
        throw Exception("Liczba elementow n musi byc > 0")
    }
    var wynik = ArrayList<Int>()
    for (i in 0..n - 1) {
        wynik.add(ciagFibonacciego(i))
    }
    return wynik
}

//Zadanie 5
/**
 *@param c0 - Int
 * @return List<Int>
 */
fun collatz(c0: Int): List<Int> {
    if (c0 <= 0) throw Exception("c0 ma byc liczba naturalna > 0")

    val ciagCol = ArrayList<Int>()
    var c = c0

    while (c != 1) {
        ciagCol.add(c)
        if (c % 2 == 0) {
            c = c / 2
        } else {
            c = 3 * c + 1
        }

    }
    ciagCol.add(1)
    return ciagCol
}

//Zadanie 6
//a)
/**
 *@param sekwencja - String
 * @return String
 */
fun komplement(sekwencja: String): String {
    val mapaKomp = mapOf('A' to 'T', 'T' to 'A', 'C' to 'G', 'G' to 'C')
    val wynik = StringBuilder()

    for (zasada in sekwencja) {
        val nicKomplementarna = mapaKomp[zasada]
        if (nicKomplementarna != null) {
            wynik.append(nicKomplementarna)
        } else {
            throw Exception("Zasada jest nieprawidłowa = $zasada")
        }
    }
    return wynik.toString()
}
//b)
/**
 *@param nicMatrycowa - String
 * @return String
 */
fun transkrybuj(nicMatrycowa: String): String {
    val wynik = StringBuilder()

    for (zasada in nicMatrycowa) {
        when (zasada) {
            'A' -> wynik.append('U')
            'T' -> wynik.append('A')
            'C' -> wynik.append('G')
            'G' -> wynik.append('C')
            else -> throw Exception("Zasada jest nieprawidłowa = $zasada")
        }
    }
    return wynik.toString()
}


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


//Zadanie 4

//a)
    val ciagFibonacci1 = ciagFibonacci(6)
    println("$ciagFibonacci1")

    try {
        ciagFibonacci(0)
    } catch (e: Exception) {
        println("${e.message}")
    }

    try {
        ciagFibonacci(-23)
    } catch (e: Exception) {
        println("${e.message}")
    }


    //b)

    val ciagFibonacciego2 = ciagFibonacciego2(8)
    println("$ciagFibonacciego2")

    try {
        ciagFibonacciego2(0)
    } catch (e: Exception) {
        println("${e.message}")
    }

    try {
        ciagFibonacciego2(-23)
    } catch (e: Exception) {
        println("${e.message}")
    }

    //Zadanie 5

    val c0 = 4
    val ciag = collatz(c0)
    println("Ciag Collatza dla c0 = $c0: $ciag")

    val maksymalnaWartosc = ciag.maxOrNull() ?: 0
    println("Maksymalna wartosc w ciagu = $maksymalnaWartosc")

    val dlugosc = ciag.size
    println("Dlugosc ciagu przed wpadnieciem w cykl = $dlugosc")

//Zadanie 6

    val sekwencjaKodujaca = "ATCCGCTATGAC"
    println("Sekwencja nici kodujacej = $sekwencjaKodujaca")

    val sekwencjaMatrycowa = komplement(sekwencjaKodujaca)
    println("Sekwencja nici matrycowej = $sekwencjaMatrycowa")

    val sekwencjaRNA = transkrybuj(sekwencjaMatrycowa)
    println("Sekwencja RNA= $sekwencjaRNA")
}