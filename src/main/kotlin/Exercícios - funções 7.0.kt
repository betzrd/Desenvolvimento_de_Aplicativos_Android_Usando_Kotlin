fun converterPhrase(frase: String) = println(frase.replace(oldValue = "a", newValue = "x").lowercase())

fun main(){
    converterPhrase("independente da frase QUE VOCÊ PASSAR ele ")
}

/*Resolução professor
*
* fun trocaLEtras(str: String) {
*   println(str.lowercase().replace(oldValue: "a", newValue: "x"))
*
*
* fun lerString () {
*   print("Informe um texto: ")
*   val texto = readLine()
*   trocaLetras(texto.toString())
* }
*
* fun main() {
*   lerString()
* }*/