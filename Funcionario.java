import java.util.ArrayList;

public class Funcionario {
    private String nomeDoFuncionario;
    private String enderecoDoFuncionario;
    private double salario;
    private String turno;

    ArrayList<Funcionario> funcionarios;

    public Funcionario(String nomeDoFuncionario, String enderecoDoFuncionario, double salario, String turno){
        this.nomeDoFuncionario=nomeDoFuncionario;
        this.enderecoDoFuncionario=enderecoDoFuncionario;
        this.salario=salario;
        this.turno=turno;
    }

    public Funcionario() {
    }

    //get e set

    public String getNomeDoFuncionario() {
        return nomeDoFuncionario;
    }
    public void setNomeDoFuncionario(String nomeDoFuncionario) {
        this.nomeDoFuncionario = nomeDoFuncionario;
    }

    public String getEnderecoDoFuncionario() {
        return enderecoDoFuncionario;
    }
    public void setEnderecoDoFuncionario(String enderecoDoFuncionario) {
        this.enderecoDoFuncionario = enderecoDoFuncionario;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void listarFuncionarios (){
        for (Funcionario f : funcionarios){
            System.out.print(f);
        }
    }

    @Override
    public String toString (){
        return "Nome do funcionário: " +nomeDoFuncionario+ "\nEndereço do funcionário: "+enderecoDoFuncionario+
                "\nSalário R$: "+salario+ "\n Turno de trabalho: "+turno;
    }
}
