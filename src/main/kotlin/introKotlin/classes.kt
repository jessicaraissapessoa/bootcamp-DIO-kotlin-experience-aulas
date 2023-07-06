package introKotlin

class Customer //Só tem uma casca, uma receita para criar um objeto daquele tipo

class Contact(val id: Int, var email: String) //classe com seu construtor


fun main() {

    val customer = Customer()

    val contact = Contact(1, "mary@gmail.com")

    println(contact.id)

    println(contact.email)
    contact.email = "jane@gmail.com"
    println(contact.email)

}