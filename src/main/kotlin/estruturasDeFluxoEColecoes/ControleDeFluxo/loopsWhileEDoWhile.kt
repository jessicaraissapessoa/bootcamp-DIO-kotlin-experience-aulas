package estruturasDeFluxoEColecoes.ControleDeFluxo

fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

fun main() {

    var cakesEaten = 0
    var cakesBaked = 0

    //While - Executa enquanto a condição dela for verdadeira. Começa pela condição
    while (cakesEaten < 5) {
        eatACake()
        cakesEaten++
    }


    //Do While - Primeiro faz e daí vai para a condição
    do { //Imprime 5 vezes
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

}