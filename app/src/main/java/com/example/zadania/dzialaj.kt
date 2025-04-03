import kotlin.math.sqrt

fun Heron (a:Double, b:Double, c:Double): Double {
    if (a <= 0){
        throw Exception ("Boki trojkata musza miec wartosc > od 0")
    }
    else if (b <= 0){
        throw Exception ("Boki trojkata musza miec wartosc > od 0")
    }
    else if (c <= 0){
        throw Exception ("Boki trojkata musza miec wartosc > od 0")
    }

    if (a >= b + c) {
        throw Exception("Dwa boki trojkata musza być wieksze niz trzeci bok")
    }
    else if (b >= a + c){
        throw Exception ("Dwa boki trojkata musza być wieksze niz trzeci bok")
    }
    else if (c >= a + b){
        throw Exception ("Dwa boki trojkata musza być wieksze niz trzeci bok")
    }

    val p = (a + b + c)/2

    return  sqrt(p*(p-a)*(p-b)*(p-c))
}

fun main (){
    try {
        val bokA1 = 3.0
        val bokB1 = 4.0
        val bokC1 = 5.0

        val poleTrojkata1 = Heron(bokA1, bokB1, bokC1)
        println("Pole trojkata wynosi $poleTrojkata1")
    }
    catch (e: Exception){
        println("Wystapil blad $e")
    }
    try {
        val bokA2 = 12.0
        val bokB2 = 12.0
        val bokC2 = 12.0

        val poleTrojkata2 = Heron(bokA2, bokB2, bokC2)
        println("Trojkat rownoboczny o polu = $poleTrojkata2")
    }
    catch (e: Exception){
        println("Wystapil blad $e")
    }
    try {
        val bokA3 = 0.0
        val bokB3 = 13.0
        val bokC3 = 14.0

        val poleTrojkata3 = Heron(bokA3, bokB3, bokC3)
        println("Bledne dane, bok trojkata nie moze = 0 ")
    }
    catch (e: Exception){
        println("Wystapil blad $e")
    }
    try {
        val bokA4 = 1.0
        val bokB4 = 13.0
        val bokC4 = 14.0

        val poleTrojkata4 = Heron(bokA4, bokB4, bokC4)
        println("Bledne dane, dwa boki trojkata musza byc wieksze niz trzeci bok ")
    }
    catch (e: Exception){
        println("Wystapil blad $e")
    }
}
