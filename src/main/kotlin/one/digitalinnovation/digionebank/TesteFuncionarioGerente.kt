package one.digitalinnovation.digionebank
import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.testes.ImprimeRelatorioFuncionario

fun main() {
    val maria = Gerente("Maria do Carmo", "1234567899", "5000.00")
     ImprimeRelatorioFuncionario.imprime(maria)
}

