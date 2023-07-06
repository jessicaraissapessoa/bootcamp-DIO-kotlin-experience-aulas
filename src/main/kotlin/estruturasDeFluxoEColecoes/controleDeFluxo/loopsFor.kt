package estruturasDeFluxoEColecoes.controleDeFluxo

fun main() {

    val cakes = listOf("carrot", "cheese", "chocolate") //Lista. Função disponível de maneira implícita. listOf recebe um vararg

    for (cake in cakes) { //Cada String seja atribuída à variável cake do for
        println("Yummy, it's a $cake cake")
    }

}