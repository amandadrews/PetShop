public class Pet {
    private  String nomeDoPet;
    private  String raca;
    private int idadeDoPet;

    public Pet (String nomeDoPet, String raca, int idadeDoPet){
        this.nomeDoPet=nomeDoPet;
        this.raca=raca;
        this.idadeDoPet=idadeDoPet;
    }

    //get e set

    public String getNomeDoPet() {
        return nomeDoPet;
    }
    public void setNomeDoPet(String nomeDoPet) {
        this.nomeDoPet = nomeDoPet;
    }
    

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdadeDoPet() {
        return idadeDoPet;
    }
    public void setIdadeDoPet(int idadeDoPet) {
        this.idadeDoPet = idadeDoPet;
    }

    @Override
    public String toString (){
        return "Nome do pet: " +nomeDoPet + ", " +idadeDoPet + " anos" + ", raça: " +raca;
    }
}
