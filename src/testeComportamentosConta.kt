fun testeComportamentosConta() {
    val contaAndre = ContaCorrente("André", 1001)
    val contaMay = ContaPoupanca("May", 1002)

    contaAndre.deposita(100.0)
    contaMay.deposita(200.0)

    println("Saldo conta André = ${contaAndre.saldo}")
    println("Saldo conta May = ${contaMay.saldo}")

    contaAndre.transfere(contaMay, 50.0)

    println("Saldo conta André = ${contaAndre.saldo}")
    println("Saldo conta May = ${contaMay.saldo}")
}