package estruturasDeFluxoEColecoes.controleDeFluxo

fun main() {

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")


    // Comparação estrutural: TRUE porque ambas possuem estruturas idênticas em termos de dados, só mudando a ordem
    println(authors == writers)

    // Comparação referencial: FALSE porque elas não têm a mesma referência. Cada uma foi instanciada em um momento diferente
    println(authors === writers)

}