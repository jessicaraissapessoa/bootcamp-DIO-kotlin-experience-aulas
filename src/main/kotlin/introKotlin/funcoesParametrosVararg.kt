package introKotlin

fun main() {

    //Vai receber uma quantidade indefinida de um determinado tipo: vai poder receber quantas mensagens quiser, desde que respeitem o tipo
    fun printAll(vararg messages: String) { // Trata as mensagens já como uma lista
        for (m in messages) println(m) //Estrutura de repetição: cada mensagem é um m / Imprime a mensagem que está chegando
    }

    printAll("Hello", "Hallo", "Salut", "Hola")


    //Vararg com mais um parâmetro: parâmetros nomeados
    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println(prefix + m)
    }

    printAllWithPrefix("Hello", "Hallo", "Salut", "Hola",
        prefix = "Greeting: "
    )

    //Função que vai chamar outra que também é um vararg: notação * no parâmetro
    fun log(vararg entries: String) {
        printAll(*entries) //Para não passar esse valor como array e sim como um vararg para o que você deseja que ele seja
    }
    log("Hello", "Hallo", "Salut", "Hola")

}