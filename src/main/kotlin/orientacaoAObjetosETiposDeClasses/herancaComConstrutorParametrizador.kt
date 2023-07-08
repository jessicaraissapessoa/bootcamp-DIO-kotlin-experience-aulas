open class Tiger(val origin: String) { //Tiger tem uma característica específica de possuir um construtor com parâmetro (origin)
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger: Tiger("Siberia") // SiberianTiger herda a classe Tiger passando um parâmetro no construtor.
// SiberianTiger é um Tiger passando um parâmetro padrão no construtor (Siberia)


fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}