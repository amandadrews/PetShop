import java.util.ArrayList;


public class Cliente {
    private String nomeDoCliente;
    private String enderecoCliente;
    private ArrayList<Pet> pets;

    public Cliente(String nomeDoCliente, String enderecoCliente) {
        this.nomeDoCliente = nomeDoCliente;
        this.enderecoCliente = enderecoCliente;
        pets=new ArrayList<>();
    }

    //get e set
    public String getNomeDoCliente() {
        return nomeDoCliente;
    }
    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getEndereco() {
        return enderecoCliente;
    }
    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public void adicionarPet (Pet pet){
        if (pets.size()<4){
            pets.add(pet);
        }
        else {
            System.out.print("Quantidade limite de pets atingida.");
        }
        }

        public void listarPetsDoCliente(){
             for (Pet pet : pets ) { //for (Tipo variavel : lista)
                 System.out.print(pet);
             }

             }

             @Override
    public  String toString() {
                 return "Nome do cliente: " + nomeDoCliente + "\n Endereço: " + enderecoCliente;
             }
        }



