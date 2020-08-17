import java.lang.Math.round

class Diretor(
        nome: String,
        cpf: String,
        salario: Double,
        val senha: Int
) : Funcionario(
        nome,
        cpf,
        salario
) {

    val plr: Double = round(salario * 12 * 0.07).toDouble()

    override val bonificacao: Double get() = super.bonificacao + salario + plr

    fun atutentica(senha: Int): Boolean {
        return this.senha == senha
    }
}