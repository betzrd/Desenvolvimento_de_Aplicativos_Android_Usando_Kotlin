fun ano(a1: Int): Int {
    return a1
}

fun meses(m1: Int, m2: Int): Int {
    val meses = m1 * m2
    return meses
}

fun dias(d1: Int, d2: Int) : Int {
    val dias = d1 * d2
    return dias
}

fun horas(h1: Int, h2: Int) : Int {
    val horas = h1 * h2
    return horas
}

fun minutos(mi1: Int, mi2: Int) : Int {
    val minutos = mi1 * mi2
    return minutos
}

fun segundos(s1: Int, s2: Int) : Int {
    val segundos = s1 * s2
    return segundos
}

fun main(){
    println(ano(a1 = 2))
    println(meses(m1 = ano(a1 = 2), m2 = 12))
    println(dias(d1 = 365, d2 = 2))
    println(horas(h1 = 24, h2 = dias(d1 = 365, d2 = 2)))
    println(minutos(mi1 = 60, mi2 = horas(h1 = 24, h2 = 730)))
    println(segundos(s1 = 60, s2 = minutos(mi1 = 60, mi2 = horas(h1 = 24, h2 = 730))))
}

/*Resolução professor:
* fun ex1(anos: Int) {
*   val meses = anos * 12
*   val dias = anos * 365
*   val horas = dias * 24
*   val minutos = horas * 60
*   val segundos = minutos * 60
*
*   println("$anos ano(s) corresponde(m) a:")
*   println("$meses meses")
*   println("$dias dias")
*   println("$horas horas")
*   println("$minutos minutos")
*   println("$segundos segundos")
*
* fun main() {
*   ex1(anos: 2)
*
* */
