package estruturasDeFluxoEColecoes.controleDeFluxo

fun main() {

    for(i in 0..3) { // i de 0 até 3 inclusive
        println(i)
    }

    for (i in 0 until 3) { // i de 0 a 3 exclusive
        println(i)
    }

    for (i in 2..8 step 2) { // i de 0 a 8 inclusive, saltando de 2 em 2
        println(i)
    }

    for (i in 3 downTo 0) { // i decrementando de 3 a 0 inclusive
        println(i)
    }

}