package br.com.andremonteiro.bytebank.modelo

abstract class Conta(var titular: String,
                     val numeroConta: Int) {
    var saldo: Double = 0.0
        protected set

    fun deposita(valor: Double) {
        if(valor > 0) saldo += valor
    }

    abstract fun saca(valor: Double)

    fun transfere(destinatario: Conta, valor: Double) {
        saca(valor)
        destinatario.deposita(valor)
    }
}