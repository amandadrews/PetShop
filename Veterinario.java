public class Veterinario extends Funcionario {
   private String crmv;
    private String especialidade;

    public Veterinario (String nomeDoFuncionario, String enderecoDoFuncionario, double salario, String turno, String crmv, String especialidade){
        super (nomeDoFuncionario,enderecoDoFuncionario,salario, turno);
        this.crmv=crmv;
        this.especialidade=especialidade;

    }
}
