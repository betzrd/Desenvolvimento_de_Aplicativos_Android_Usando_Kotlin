import java.util.Locale

fun main(){

    val nome = "John"
    println("Ola, $nome")

    println("Ola, %s %s" .format(nome, nome)) //vai formatar a string
    //%s indica um placeholder, ou seja, algo que está reservando um lugar.


    //%s - String
    //%d - Int
    //%f - Ponto flutuante (Float/Double)
    //%c - Char
    //%b - Boolean

    val value = 5
    val salario = 16855.95

    println("Valor: %d - Salario: %f".format(value, salario))


    println("Valor: %02d - Salario: %.2f".format(value, salario))
    //colocar o 2 quando quiser ter 2 casas, se o número não tiver colocar o 0 também
    // o ponto indica quantas casas decimais vão ter


    println("Valor: %02d - Salario: %.2f".format(Locale.US, value, salario))
    //locale.: indica qual tipo de formatação do pais da pessoa que estiver lendo o código

}