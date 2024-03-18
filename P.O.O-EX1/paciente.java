public class paciente {
    String nome;
    String rg;
    String endereco;
    String telefone;
    String dataNascimento;
    String profissao;
    

    void status(){
        System.out.println("nome: " + this.nome);
        System.out.println("rg: " + this.rg);
        System.out.println("endereco: " + this.endereco);
        System.out.println("telefone: " + this.telefone);
        System.out.println("data de nascimento: " + this.dataNascimento);
        System.out.println("profissao: " + this.profissao);
    }
}