fun main() {

    val funcionario = Funcionario(
            nome = "André",
            cpf = "111.111.111-11",
            salario = 1000.0
    )

    val gerente = Gerente(
            nome = "Edgar",
            cpf = "111.111.111-11",
            salario = 2000.0,
            senha = 1234)

    val diretor = Diretor(
            nome = "May",
            cpf = "111.111.111-11",
            salario = 3000.0,
            senha = 12345
    )

    println("Nome ${funcionario.nome}")
    println("Cpf ${funcionario.cpf}")
    println("Salario ${funcionario.salario}")
    println("Bonificação ${funcionario.bonificacao}")
    println()

    println("Nome ${gerente.nome}")
    println("Cpf ${gerente.cpf}")
    println("Salario ${gerente.salario}")
    println("Bonificação ${gerente.bonificacao}")
    if (gerente.atutentica(senha = 1234)) println("Senha valida")
    else println("Senha inválida")
    println()

    println("Nome ${diretor.nome}")
    println("Cpf ${diretor.cpf}")
    println("Salario ${diretor.salario}")
    println("Bonificação ${diretor.bonificacao}")
    println("Plr ${diretor.plr}")
    if (diretor.atutentica(senha = 1234)) println("Senha valida")
    else println("Senha inválida")
    println()


}
