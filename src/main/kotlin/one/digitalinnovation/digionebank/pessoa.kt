package one.digitalinnovation.digionebank

class pessoa {
    var nome: String = "Luana"

    var cpf: String = "151.258.221.55"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"


    }

fun main() {
    val Luana = pessoa()
    println(Luana.pessoaInfo())

}