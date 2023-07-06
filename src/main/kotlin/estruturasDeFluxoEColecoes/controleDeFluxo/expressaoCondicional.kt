package estruturasDeFluxoEColecoes.controleDeFluxo

fun main() {

    // função que onde recebe os parâmetros a e b e usa if/else como expression e retornando a se for verdadeiro e b se for falso
    fun max(a: Int, b: Int) = if (a > b) a else b

    // na forma clássica:
    fun maxOld(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    println(max(99, -42))
    println(maxOld(99, -42))

}