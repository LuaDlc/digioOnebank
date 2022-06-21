package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.testes.ImprimeRelatorioFuncionario

fun main() {
    val joao = Analista("João Pedro", "1234567899", 2000.0)

    ImprimeRelatorioFuncionario.imprime(joao)
}