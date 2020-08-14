class Diretor(
        nome: String,
        cpf: String,
        salario: Double,
        val senha: Int,
        val plr: Double
) : Funcionario(
        nome,
        cpf,
        salario
) {


    fun atutentica(senha: Int): Boolean {
        return this.senha == senha
    }
}