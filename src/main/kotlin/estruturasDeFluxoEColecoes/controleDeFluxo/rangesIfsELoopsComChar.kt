package estruturasDeFluxoEColecoes.controleDeFluxo

fun main() {

    // Range com char

    for (c in 'a'..'d') { //de 'a' a 'd' inclusive
        println(c)
    }

    for (c in 'z' downTo 's' step 2) { //decrementando de z a s inclusive, a cada 2
        println(c)
    }

    // Range no If

    val x = 2

    if (x in 1..5) { //se x está no intervalo de 1 a 5 inclusive...
        println("x is in range from 1 to 5")
    }

    if (x !in 6..10) { //se x NÃO está no intervalo de 6 a 10 inclusive...
        println("x is not in range from 6 to 10")
    }

}