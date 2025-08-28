import java.util.Locale

fun celsius() : Double {
    val celsius = readLine().toString().toDouble()
    return celsius
}

fun main(){
    println("F = %.1f".format(Locale.US, ( celsius() * 9/5) + 32))
}