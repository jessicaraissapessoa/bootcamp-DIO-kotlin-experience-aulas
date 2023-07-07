package estruturasDeFluxoEColecoes.colecoes

fun main() {

    //Função filter - Uma vez que você criou uma coleção, você pode filtrar os elementos dela

    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 } //Criação de variável nomeada chamada x e utiliza ela para criar a condição
    val negatives = numbers.filter { it < 0 } //Usa palavra reversada it que vai ser o elemento de valor

    println("Números: $numbers")
    println("Números positivos: $positives")
    println("Números negativos: $negatives")


    //Função map - permite que você aplique uma transformação para todos os elementos da coleção. Transformação de dados

    val numbers2 = listOf(1, -2, 3, -4, 5, -6)
    val doubled = numbers2.map { x -> x * 2 } //Multiplica cada elemento por 2
    val tripled = numbers2.map { it * 3 } //Multiplica cada elemento por 3

    println("Números: $numbers2")
    println("Números duplicados: $doubled")
    println("Números triplicados: $tripled")


    //Função any - Verifica se há elemento que atenda à condição

    val numbers3 = listOf(1, -2, 3, -4, 5, -6)
    val anyNegative = numbers3.any { it < 0 } //Verifica se há algum número negativo na coleção
    val anyGT6 = numbers3.any { it > 6 } //Verifica se há algum número maior que 6 na coleção

    println("Números: $numbers3")
    println("Há algum número negativo: $anyNegative")
    println("Há algum número maior que 6: $anyGT6")


    //Função flatMap - Transforma um elemento de uma coleção em um objeto iterable e constrói uma lista à parte com o resultado da transformação

    val fruitsBag = listOf("apple", "orange", "banana", "grapes") //Lista com bolsa de frutas
    val clothesBag = listOf("shirts", "pants", "jeans") //Lista com bolsa de roupas
    val cart = listOf(fruitsBag, clothesBag) //Lista carrinho com as listas das bolsas
    val mapBag = cart.map { it } //Map do carrinho: vai manter as estruturas de listas originais
    val flatMapBag = cart.flatMap { it } //flatMap vai juntar as duas listas em uma, removendo as estruturas originais

    println("Your bags are: $mapBag")
    println("The things you bought are: $flatMapBag")



}


