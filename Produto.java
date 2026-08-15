import java.util.ArrayList;

public class Produto {
   private String nomeDoProduto;
    private String descricaoDoProduto;
    private double precoDoProduto;
    public ArrayList<Produto> produtos;

   public Produto (String nomeDoProduto, String descricaoDoProduto, double precoDoProduto){
       this.nomeDoProduto=nomeDoProduto;
       this.descricaoDoProduto=descricaoDoProduto;
        this.precoDoProduto=precoDoProduto;
   }

    //get e set
    public String getNomeDoProduto() {
        return nomeDoProduto;
  }
    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
   }

    public String getDescricaoDoProduto() {
        return descricaoDoProduto;
    }
    public void setDescricaoDoProduto(String descricaoDoProduto) {
        this.descricaoDoProduto = descricaoDoProduto;
    }

    public double getPrecoDoProduto() {
        return precoDoProduto;
    }
    public void setPrecoDoProduto(double precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }

    public void listarProdutos (){
       for (Produto p: produtos){
           System.out.print(p);
       }
    }

    @Override
    public String toString (){
       return "Produto: "+nomeDoProduto+ "\nDescrição do produto: "+descricaoDoProduto+ "\nPreço R$: "+precoDoProduto;
    }
}
