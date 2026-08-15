public class Mamifero extends Pet {
    private String porte;
    private boolean castrado;
    private boolean petBravo;
    private String corDoPelo;

    public Mamifero (String nomeDoPet, String raca, int idade, String porte, boolean castrado, boolean petBravo, String corDoPelo ){
        super (nomeDoPet,raca,idade);
        this.porte=porte;
        this.castrado=castrado;
        this.petBravo=petBravo;
        this.corDoPelo=corDoPelo;
    }

}
