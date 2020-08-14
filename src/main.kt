fun main() {

    val funcionario = Funcionario(
            nome = "André",
            cpf = "111.111.111-11",
            salario = 1000.0
    )

    println("Nome ${funcionario.nome}")
    println("Cpf ${funcionario.cpf}")
    println("Salario ${funcionario.salario}")
    println("Bonificação ${funcionario.bonificacao()}")
}
