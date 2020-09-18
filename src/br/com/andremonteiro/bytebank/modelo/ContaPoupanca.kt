package br.com.andremonteiro.bytebank.modelo

class ContaPoupanca(
        titular: Cliente,
        numeroConta: Int
) : Conta(
        titular = titular,
        numero = numeroConta
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }

}