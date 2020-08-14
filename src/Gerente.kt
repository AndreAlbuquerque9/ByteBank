class Gerente(
        nome: String,
        cpf: String,
        salario: Double,
        val senha: Int
) : Funcionario(
        nome,
        cpf,
        salario
) {


    fun atutentica(senha: Int) {

    }
}