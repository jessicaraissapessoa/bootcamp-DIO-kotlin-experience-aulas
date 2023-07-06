package estruturasDeFluxoEColecoes.controleDeFluxo

fun main() {

    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass2()))

}

fun whenAssign(obj: Any): Any { //função que recebe qualquer coisa e retorna qualquer coisa
    val result = when(obj) {
        1 -> "One"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

class MyClass2