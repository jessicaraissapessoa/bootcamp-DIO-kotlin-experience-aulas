package introKotlin


//Sem retorno com Unit
fun printMessage(message: String): Unit {
    println(message)
}

//Sem retorno sem Unit
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

//Com retorno
fun sum(x: Int, y: Int): Int {
    return x + y
}

//Inline function
fun multiply(x: Int, y: Int) = x * y


//Aplicação na Main
fun main() {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1,2))
    print(multiply(2,4))
}