package br.com.andremonteiro.bytebank.teste

import br.com.andremonteiro.bytebank.modelo.ContaCorrente
import br.com.andremonteiro.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {
    val cc = ContaCorrente(
            titular = "André",
            numeroConta = 1001
    )

    val cp = ContaPoupanca(
            titular = "May",
            numeroConta = 1002
    )

    cc.deposita(1000.0)
    cp.deposita(1000.0)

    cc.saca(100.0)
    cp.saca(100.0)

    println("O saldo da CC é de: ${cc.saldo}")
    println("O saldo da CP é de: ${cp.saldo}")
}
