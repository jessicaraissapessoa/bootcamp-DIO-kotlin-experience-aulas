package introducaoPraticaKotlin

//criação de pilha

class MutableStack<E>(vararg itens: E) {

    //Propriedade que são os elementos que estão chegando como parâmetro de construtor que ele converte para uma mutableList
    //Então esses elementos são de fato uma lista que vai ser trabalhada dentro da pilha
    private val elements = itens.toMutableList()

    //Série de funções úteis que toda pilha deveria ter. Implementação de pilha "na mão", usando Kotlin:
    fun push(element: E) = elements.add(element) //recebe um elemento do tipo E e adiciona esse elemento na lista
    fun peek(): E = elements.last() //pegar último sem remover
    fun pop(): E = elements.removeAt(elements.size - 1) //pega o último elemento e remove
    fun isEmpty() = elements.isEmpty() //verificar se está vazia
    fun size() = elements.size //devolver o tamanho
    override fun toString() = "MutableStack(${elements.joinToString()})" //sobrescrita do método toString que vai converter a pilha para texto

}

fun main() {

    val stack = MutableStack(0.62, 3.14, 2.7)
    stack.push(9.87) //adicionado
    println(stack)

    //Teste do método peek
    println("peek(): ${stack.peek()}")
    println(stack) //não remove

    //Laço para fazer o pop dela inteira
    for (i in 1..stack.size()) {
        println("pop(): ${stack.pop()}")
        println(stack)
    }

}