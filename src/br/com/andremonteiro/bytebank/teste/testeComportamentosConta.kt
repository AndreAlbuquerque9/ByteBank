package br.com.andremonteiro.bytebank.teste

import br.com.andremonteiro.bytebank.modelo.Cliente
import br.com.andremonteiro.bytebank.modelo.ContaCorrente
import br.com.andremonteiro.bytebank.modelo.ContaPoupanca

fun testeComportamentosConta() {
    val contaAndre = ContaCorrente(Cliente("André", "1", senha = 2), 1001)
    val contaMay = ContaPoupanca(Cliente("May", cpf = "2", senha = 3), 1002)

    contaAndre.deposita(100.0)
    contaMay.deposita(200.0)

    println("Saldo conta André = ${contaAndre.saldo}")
    println("Saldo conta May = ${contaMay.saldo}")

    contaAndre.transfere(valor = 50.0, destino = contaMay)

    println("Saldo conta André = ${contaAndre.saldo}")
    println("Saldo conta May = ${contaMay.saldo}")
}