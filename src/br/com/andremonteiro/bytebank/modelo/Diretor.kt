package br.com.andremonteiro.bytebank.modelo

import kotlin.math.roundToInt

class Diretor(
        nome: String,
        cpf: String,
        salario: Double,
        senha: Int
) : FuncionarioAdmin(
        nome,
        cpf,
        salario,
        senha
) {

    val plr: Double = (salario * 12 * 0.07).roundToInt().toDouble()

    override val bonificacao: Double get() = salario + plr

}