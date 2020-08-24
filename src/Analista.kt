import java.lang.Math.round
import kotlin.math.roundToInt

class Analista(
        nome: String,
        cpf: String,
        salario: Double
) : Funcionario(
        nome,
        cpf,
        salario
) {

    val plr: Double get() = (salario * 12 * 0.07).roundToInt().toDouble()

    override val bonificacao: Double get() = salario * 0.1

}