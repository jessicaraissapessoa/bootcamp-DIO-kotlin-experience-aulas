package estruturasDeFluxoEColecoes.ControleDeFluxo

fun main() {

    //When statement
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")

}

//When statement
fun cases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long") // Se for do tipo Long faz...
        !is String -> println("Not a string") // "not is" - Se não for String faz...
        else -> println("Unknown") // Se não atender nenhum caso faz...
    }
}

class MyClass