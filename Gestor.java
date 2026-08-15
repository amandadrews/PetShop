public class Gestor extends Funcionario {
   private String setor;
    private String funcoes;

    public Gestor(String nomeDoFuncionario, String enderecoDoFuncionario, double salario, String turno, String setor, String funcoes) {
        super (nomeDoFuncionario, enderecoDoFuncionario, salario, turno); //coisas da classe funcionario
        this.setor = setor;
        this.funcoes=funcoes;
    }

}
