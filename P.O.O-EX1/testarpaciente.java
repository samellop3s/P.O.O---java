public class testarpaciente {
    public static void main(String[] args) {
        paciente pessoa = new paciente();
            pessoa.nome = "Pedro";
            pessoa.rg = "10.776.674-7";
            pessoa.endereco = "Rua Professor Joaquim Álvarez Cruz";
            pessoa.telefone = "1140028922";
            pessoa.dataNascimento = "07/09/2004";
            pessoa.profissao = "dentista";
            pessoa.status();
    }
}
