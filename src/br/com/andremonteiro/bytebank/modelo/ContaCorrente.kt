package br.com.andremonteiro.bytebank.modelo

class ContaCorrente(
        titular: Cliente,
        numeroConta: Int
) : Conta(
        titular = titular,
        numero = numeroConta
) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }

}