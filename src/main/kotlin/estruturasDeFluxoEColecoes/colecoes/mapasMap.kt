package estruturasDeFluxoEColecoes.colecoes

const val POINTS_X_PASS: Int = 15 //Constante imutável: quantidade de pontos que ganha quando faz uma viagem
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100) //Mutável: contas e seus respectivos pontos
val EZPassReport: Map<Int, Int> = EZPassAccounts //Cópia de somente leitura para relatórios

fun updatePointsCredit(accountId: Int) { //Função para update dos pontos. Recebe ID
    if (EZPassAccounts.containsKey(accountId)) { //Se tiver ID no mapa, faz update adicionando pontos aos que já tem
        println("Updating $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
    } else { //Se não tiver ID no mapa, não faz update adicionando pontos aos que já tem
        println("Error: Trying to update a non-existing account (id: $accountId")
    }
}

fun accountsReport() { //Função que faz relatório das contas
    println("EZ-Pass report:")
    EZPassReport.forEach { (k, v) -> println("ID $k: credit $v") //Modo Kotlin
    }
//    Modo Java:
//    EZPassReport.forEach {
//        k, v -> println("ID $k: credit $v")
//    }
}


fun main() {

    accountsReport() //Exibe IDs e seus respectivos créditos
    updatePointsCredit(1) //Adiciona quinze créditos (POINTS_X_PASS) à conta de ID 1
    updatePointsCredit(1) //Adiciona mais quinze créditos (POINTS_X_PASS) à conta de ID 1
    updatePointsCredit(5) //Falha em adicionar quinze créditos (POINTS_X_PASS) à conta de ID 5, que não existe
    accountsReport() //Exibe versão atualizada pós-alterações dos IDs e seus respectivos créditos

}