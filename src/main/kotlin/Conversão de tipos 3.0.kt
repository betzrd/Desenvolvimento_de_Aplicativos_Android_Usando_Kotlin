fun main(){
    val a: Byte = 0
    val b: Short = 5
    val c: Int = 10
    val d: Long = 15L
    val e: Float = 20F
    val f: Double = 25.0

    // não da para converter direito para o Short/Byte, primeiro deve converter para o Int e depois para os dois.
    a.toShort()

    println(a.toString())
}