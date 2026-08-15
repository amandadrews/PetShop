public class Peixe extends Pet{
    private String tipoDeAgua;
    private String cor;

    public Peixe (String nomeDoPet, String raca, int idade, String tipoDeAgua, String cor){
        super (nomeDoPet,raca,idade);
        this.tipoDeAgua=tipoDeAgua;
        this.cor=cor;


    }
}
