package introKotlin

//criação de pilha

class MutableStack2<E>(vararg itens: E) {

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

//função utilitária chamada mutableStackOf
//que está recebendo um vararg de elementos assim como a classe MutableStack2 recebe
//tem tipo genérico sendo passado para ele
//está falando que quando essa função for chamada, eu quero criar uma nova mutableStack passando o vararg para ela
//ou seja, propagando esse vararg de elements para o construtor da mutableStack
fun <E> mutableStackOf(vararg elements: E) = MutableStack2(*elements)

fun main() {
    val stack = mutableStackOf<Double>(0.62, 3.14, 2.7)
    println(stack)
}

