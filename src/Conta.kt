class Conta(var titular: String,
            val numeroConta: Int) {
    var saldo: Double = 0.0
        private set

    fun deposita(valor: Double) {
        if(valor > 0) saldo += valor
    }

    fun saca(valor: Double) {
        if (saldo > valor) saldo -= valor;
    }

    fun transfere(destinatario: Conta, valor: Double) {
        saca(valor)
        destinatario.deposita(valor)
    }
}