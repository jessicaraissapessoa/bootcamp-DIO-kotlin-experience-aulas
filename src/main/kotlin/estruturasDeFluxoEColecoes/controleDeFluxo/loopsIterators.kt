package estruturasDeFluxoEColecoes.controleDeFluxo

class Animal(val name: String)
class  Zoo(val animals: List<Animal>) { //Classe Zoo que recebe uma lista imutável de Animals
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun main() {

    val animals = listOf(Animal("zebra"), Animal("lion"))
    //ou val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))
    val zoo = Zoo(animals)

    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }
}