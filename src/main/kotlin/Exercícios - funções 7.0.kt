fun phrase(frase: String) = println(frase)

fun converter_phrase(frase: String) = println(frase.replace(oldValue = "a", newValue = "x").lowercase())

fun main(){
    phrase(frase = "A banana muda")
    var frase = "A banana muda"
    frase = frase.lowercase()
    frase = frase.replace(oldValue = "a", newValue = "x")
    println(frase)

    converter_phrase("independente da frase QUE VOCÊ PASSAR ele ")
}