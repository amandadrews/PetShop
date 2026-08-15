public class Ave extends Pet {
private String corPenagem;
private boolean voa;

    public Ave(String nomeDoPet, String raca, int idadeDoPet,String corPenagem,boolean voa) {
        super(nomeDoPet, raca, idadeDoPet);
        this.corPenagem=corPenagem;
        this.voa=voa;

    }
}
