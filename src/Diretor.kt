import java.lang.Math.round

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

    val plr: Double = round(salario * 12 * 0.07).toDouble()

    override val bonificacao: Double get() = salario + plr

}