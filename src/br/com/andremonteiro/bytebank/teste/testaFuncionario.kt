package br.com.andremonteiro.bytebank.teste

//import br.com.andremonteiro.bytebank.modelo.Analista
import br.com.andremonteiro.bytebank.modelo.Diretor
import br.com.andremonteiro.bytebank.modelo.Gerente

fun testaFuncionario() {
/*    val funcionario = Analista(
            nome = "André",
            cpf = "111.111.111-11",
            salario = 1000.0
    )*/

    val gerente = Gerente(
            nome = "Edgar",
            cpf = "111.111.111-11",
            salario = 2000.0,
            senha = 1234)

    val diretor = Diretor(
            nome = "May",
            cpf = "111.111.111-11",
            salario = 3000.0,
            senha = 12345,
            plr = 20.0
    )

/*    val analista = Analista(
            nome = "Luigi",
            cpf = "111.111.111-11",
            salario = 4000.0
    )*/

/*    println("Nome ${funcionario.nome}")
    println("Cpf ${funcionario.cpf}")
    println("Salario ${funcionario.salario}")
    println("Bonificação ${funcionario.bonificacao}")
    println("Plr ${funcionario.plr}")
    println()*/

    println("Nome ${gerente.nome}")
    println("Cpf ${gerente.cpf}")
    println("Salario ${gerente.salario}")
    println("Bonificação ${gerente.bonificacao}")
    if (gerente.autentica(senha = 1234)) println("Senha valida")
    else println("Senha inválida")
    println()

    println("Nome ${diretor.nome}")
    println("Cpf ${diretor.cpf}")
    println("Salario ${diretor.salario}")
    println("Bonificação ${diretor.bonificacao}")
    println("Plr ${diretor.plr}")
    if (diretor.autentica(senha = 1234)) println("Senha valida")
    else println("Senha inválida")
    println()

/*    println("Nome ${analista.nome}")
    println("Cpf ${analista.cpf}")
    println("Salario ${analista.salario}")
    println("Bonificação ${analista.bonificacao}")
    println("Plr ${analista.plr}")
    println()*/
}
