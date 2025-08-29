import java.util.Locale

fun celsius() : Double {
    val celsius = readLine().toString().toDouble()
    return celsius
}

fun main(){
    println("F = %.1f".format(Locale.US, ( celsius() * 9/5) + 32))
}

/*fun celsius() : Double = readLine().toString().toDouble()
*/

/*Resolução professor
*
* fun ex5(celsius: Double): Double {
*   return (celcius * 9 / 5) + 32
* }
*
* fun ex5(celsius: Double): Double = (celcius * 9 / 5) + 32
*
* fun main() {
*   println(ex5(celsius: 32.0)) // 89.6
* }*/