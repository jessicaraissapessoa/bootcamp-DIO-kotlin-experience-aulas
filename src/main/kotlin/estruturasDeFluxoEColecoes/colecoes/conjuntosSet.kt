package estruturasDeFluxoEColecoes.colecoes

// variável imutável recebendo uma instância de uma mutableSet
val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")
/*
Pode ser representado assim:
val openIssues = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")
 */

fun addIssue(uniqueDesc: String): Boolean { //recebe uma descrição e adiciona à mutableSet de openIssues
    return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String { //função que printa o status se foi adicionado ou não
    return if (isAdded) "registered corretly." else "marked as duplicate and rejected."
}
/*
fun getStatusLog(isAdded: Boolean) = if (isAdded) "registered corretly." else "marked as duplicate and rejected."
 */


fun main() {

    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}") //Inclusão bem sucedida, pois não é repetida
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}") //Inclusão mal sucedida, pois é repetida

}