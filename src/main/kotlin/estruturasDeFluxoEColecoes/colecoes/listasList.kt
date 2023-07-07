package estruturasDeFluxoEColecoes.colecoes

/*
Variável é imutável, mas está recebendo mutableList -> uma coisa não está relacionada a outra
-> No caso, o val faz com que ela não possa receber uma outra instância que não esta que ela está recebendo aqui
A instância não pode mudar, mas os elementos sim
*/
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)

/*
A gente está atribuindo a variável systemUsers para uma variável nova (sudoers)
Essa variável, no caso, vai criar uma cópia de somente leitura de systemUsers
Essa lista servirá para consulta, não podendo ser alterada
 */
val sudoers: List<Int> = systemUsers


fun addSystemUser(newUser: Int) { //Função que adiciona novo usuário
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> { //Função que retorna a variável da lista de somente leitura
    return sudoers
}


fun main() {

    addSystemUser(4) //Adicionando usuário com ID 4

    println("Tot sudoers: ${getSysSudoers().size}") //Impressão do total de usuários que estão na lista de somente leitura (verificação se foi atualizada)

    getSysSudoers().forEach { //Percorrendo todos os elementos da lista
        i -> println("Some useful info on user $i")
    }

    //getSysSudoers().add(5) <- Error!     Não adiciona usuário na lista de somente leitura
}