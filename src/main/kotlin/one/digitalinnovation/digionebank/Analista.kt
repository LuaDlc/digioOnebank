package one.digitalinnovation.digionebank
import one.digitalinnovation.digionebank.Analista
class Analista (
    nome: String,
    cpf: String,
    salario: Double
        ): Funcionario(nome, cpf, salario) {
            override fun calculoAuxilio() = salario * 0.1
        }
