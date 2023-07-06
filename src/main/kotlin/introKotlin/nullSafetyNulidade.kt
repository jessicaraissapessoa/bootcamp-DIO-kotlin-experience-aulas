package introKotlin

fun main() {

    var neverNull: String = "Não pode receber nulo"

    var nullable: String? = "Pode receber nulo"
    nullable = null

    var iferredNonNull = "O compilador assume não nulo"


    //Função que está esperando como um parâmetro um valor não nulo
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    println(strLength(neverNull))


    //Função que pode receber nulo
    fun funNull(str: String?): Int {
        return str?.length ?: 0 // ?: "Elvis operator" - caso esse valor não exista, retorne zero
    }

    println(funNull(nullable))

    //Outra forma de fazer a função lidar com nulo
    fun describleString(maybeString: String?): String {
        if (maybeString != null && maybeString.length > 0) {
            return "String com ${maybeString.length} de tamanho"
        } else {
            return "Vazia ou String nula"
        }
    }

    println(describleString(null))
    println(describleString(""))
    println(describleString("dio.me"))

//    Forçar acesso à variável (não recomendado), “garantindo” que ela não vai estar nula
//    fun funNull(str: String?): Int {
//        return str!!.length ?: 0 // ?: "Elvis operator" - caso esse valor não exista, retorne zero
//    }






}