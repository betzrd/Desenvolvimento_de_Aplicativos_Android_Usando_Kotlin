fun main(){
    val str = "Programação Kotlin!"

    println(str[0])
    println(str.length)

    println(str.startsWith(prefix = "Progra"))
    println(str.endsWith(suffix = "."))


    println(str.substring(startIndex = 6))
    println(str.substring(startIndex = 6, 8))
    println(str.replace(oldValue = "o", newValue = "a"))

    println(str.uppercase())
    println(str.lowercase())
    println(str.contains(other = "Kotlin"))

    str.isEmpty()

    println("        nsdfsjcvbsbfvs         ".trim())

//trim é responsável por cortar os espaços em braco da string, mas apenas no começo e no final
// substring: pedaço da string
// index: posição que quero acessar
// index: começa sempre do zero
}