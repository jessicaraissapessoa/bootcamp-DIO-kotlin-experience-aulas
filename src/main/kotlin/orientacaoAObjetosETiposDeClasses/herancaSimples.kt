open class Dog { //uma classe que queremos que seja classe base (pai), precisa estar como open class
    open fun sayHello() { //função aberta
        println("wow wow")
    }
}

class Yorkshire: Dog() {  //Herança
    override fun sayHello() { //sobrescrevendo
        println("wif wif")
    }
}


fun main() {
    val dog: Dog = Yorkshire() //Instanciando
    //pode deixar inferência de tipo para o kotlin: val dog = Yorkshire()

    dog.sayHello()
}