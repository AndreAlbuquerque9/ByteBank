package br.com.andremonteiro.bytebank.modelo

class CalculadorBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }
}