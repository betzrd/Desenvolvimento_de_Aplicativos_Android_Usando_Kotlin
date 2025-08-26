fun helloWorld(nome: String) {
    println("Ola, $nome!")
}

fun media(n1: Int, n2: Int): Int {
    val media = (n1 + n2) / 2
    return media
}

fun main() {
    helloWorld("Pedro Henrique")
    println(media(10, 8))
    println(soma(1, 2))
    awp(apelido = "toma na boca")
}

fun soma(v1: Byte, v2: Byte): Byte {
    val soma = v1 + v2
    return soma.toByte()
}

fun awp(apelido: String) {
    println(apelido)
}