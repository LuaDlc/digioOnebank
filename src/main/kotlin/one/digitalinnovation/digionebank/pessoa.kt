package one.digitalinnovation.digionebank

 open class Pessoa {
    var nome: String = "Luana"

    var cpf: String = "151.258.221-55"
    private set
abstract class Pessoa (
    val nome: String,
    val cpf: String
        )
    constructor()

    fun pessoaInfo() = "$nome e $cpf"


    }

fun main() {
    val Luana = Pessoa()
    println(Luana.pessoa.Info())
}

