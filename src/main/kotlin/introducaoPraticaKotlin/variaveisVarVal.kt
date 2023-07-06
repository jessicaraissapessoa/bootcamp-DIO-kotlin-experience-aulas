package introducaoPraticaKotlin

fun main() {

    var a: String = "inicial" //var é variável mutável. Pode reatribuir o valor
    val b: Int = 1 //val é valor imutável
    val c = 3 //Inferência de tipo do Kotlin. O programa compreende qual o tipo

    println(a) //Imprime a como "inicial"
    println(b)
    println(c)

    //alterando a
    a = "final"
    println(a) //Imprime a como "final"



    fun someCondition() = true

    val d: Int //Pode ser inicializado posteriormente

    if (someCondition()) {
        d = 1
    } else {
        d = 2
    }

    println(d) //d já terá sido inicializada, podendo ser utilizada

}