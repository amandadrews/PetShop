import java.util.Scanner;
import java.util.ArrayList;


void main() {
    Scanner teclado = new Scanner(System.in);

    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    ArrayList<Produto> produtos = new ArrayList<>();

    int opcao;
    do {
        System.out.println("\n ---SELECIONE---");
        System.out.println("" +
                " 1- adicionar um cliente" +
                "\n 2- adicionar um funcionário" +
                "\n 3- adicionar um produto" +
                "\n 4- remover um cliente" +
                "\n 5- remover um funcionário" +
                "\n 6- remover um produto" +
                "\n 7- listar todos os clientes e seus pets" +
                "\n 8- listar todos os funcionários" +
                "\n 9- listar todos os produtos" +
                "\n 10- listar todos os peixes" +
                "\n 11- listar todos os mamíferos" +
                "\n 12- listar todos as aves" +
                "\n 13- buscar pets por raça" +
                "\n 14- buscar um cliente" +
                "\n 15- buscar um funcionário" +
                "\n 16- buscar um produto" +
                "\n 17- consultar salário de funcionário" +
                "\n 0- SAIR ");

        System.out.print("Digite a opçãpo desejada: ");
            opcao = teclado.nextInt();


        switch (opcao) {

            case 1:
                teclado.nextLine(); //limpar buffer
                System.out.print("\nDigite o nome do(a) cliente(a): ");
                    String nomeDoCliente = teclado.nextLine();
                System.out.print("Digite o endereço do(a) cliente(a): ");
                    String enderecoCliente = teclado.nextLine();

                Cliente cliente = new Cliente(nomeDoCliente, enderecoCliente);

                System.out.print("\n Selecione o TIPO DE PET do cliente a ser cadastrado:");
                System.out.println("" +
                        "\n 1- mamífero (gatos, cachorros, coelhos, hamsters..)" +
                        "\n 2- aves" +
                        "\n 3- peixes");

                System.out.print("Digite a opção desejada: ");
                    int tipoPet = teclado.nextInt();

                switch (tipoPet) {

                    //MAMIFERO//
                    case 1: {
                        teclado.nextLine();
                        System.out.println();
                        System.out.print("Digite o nome do pet: ");
                            String nomeDoPet = teclado.nextLine();
                        System.out.print("Digite a raça do pet:  ");
                            String raca = teclado.nextLine();
                        System.out.print("Digite a idade do pet: ");
                            int idadeDoPet = teclado.nextInt();

                        teclado.nextLine();

                        System.out.print("Qual o porte do pet? (Pequeno, Médio, Grande): ");
                            String porte = teclado.nextLine();
                        System.out.print("O pet é castrado? (Sim/Não): ");
                            char repostaCastrado = teclado.next().charAt(0);

                        boolean castrado;
                            if (repostaCastrado == 's' || repostaCastrado == 'S') {
                                castrado = true;
                            }
                            else {
                                castrado = false;
                        }

                        System.out.print("O pet é bravo? (Sim/Não): ");
                        teclado.nextLine();
                            char respostaPetBravo = teclado.next().charAt(0);

                        boolean petBravo;
                            if (respostaPetBravo == 's' || respostaPetBravo == 'S') {
                                petBravo = true;
                        }
                            else {
                                petBravo = false;
                        }

                        teclado.nextLine();

                        System.out.print("Digite a cor do pelo/pelagem do pet: ");
                            String corDoPelo = teclado.nextLine();

                        Mamifero m = new Mamifero(nomeDoPet, raca, idadeDoPet, porte, castrado, petBravo, corDoPelo);
                        cliente.adicionarPet(m);

                        break;
                    }

                    //AVE//
                    case 2: {
                        teclado.nextLine();
                        System.out.println();
                        System.out.print("Digite o nome do pet: ");
                            String nomeDoPet = teclado.nextLine();
                        System.out.print("Digite a raça do pet:  ");
                            String raca = teclado.nextLine();
                        System.out.print("Digite a idade do pet: ");
                            int idadeDoPet = teclado.nextInt();

                        teclado.nextLine();

                        System.out.print("Digite a cor da penagem da ave: ");
                            String corPenagem = teclado.nextLine();
                        System.out.print("A ave voa? (Sim/não): ");
                            char respostaVoa = teclado.next().charAt(0);

                        boolean voa;
                            if (respostaVoa == 's' || respostaVoa == 'S') {
                                voa = true;
                        }
                            else {
                                voa = false;
                        }

                        Ave a = new Ave(nomeDoPet, raca, idadeDoPet, corPenagem, voa);
                        cliente.adicionarPet(a);

                        break;
                    }

                    //PEIXE//
                    case 3: {
                        teclado.nextLine();
                        System.out.println();
                        System.out.print("Digite o nome do pet: ");
                            String nomeDoPet = teclado.nextLine();
                        System.out.print("Digite a raça do pet:  ");
                            String raca = teclado.nextLine();
                        System.out.print("Digite a idade do pet: ");
                            int idadeDoPet = teclado.nextInt();
                        teclado.nextLine();
                        System.out.print("Qual o tipo de água do peixe? (Doce/Salgada): ");
                            String tipoDeAgua = teclado.nextLine();
                        System.out.print("Qual a cor do peixe? ");
                            String cor = teclado.nextLine();

                        Peixe p = new Peixe(nomeDoPet, raca, idadeDoPet, tipoDeAgua, cor);
                        cliente.adicionarPet(p);

                        break;
                    }

                    default:
                        System.out.print("ERRO! Número digitado é inválido.");
                        break;
                }

                clientes.add(cliente);
                System.out.println ("--Cadastro feito com sucesso!--");

                break;

            //ADICIONAR FUNCIONARIO
            case 2: {
                System.out.println();
                System.out.println("Selecione o tipo de funcionário a ser cadastrado: ");
                System.out.print("1- Gestor" +
                        "\n2- Veterinário");

                System.out.print("\n Digite a opção desejada: ");
                    int opcaoFuncionario = teclado.nextInt();

                teclado.nextLine();

                switch (opcaoFuncionario) {

                    case 1: { //gestor
                        System.out.println();
                        System.out.print("Digite o nome do(a) Gestor(a): ");
                            String nomeDoFuncionario = teclado.nextLine();
                        System.out.print("Digite o endereço do(a) Gestor(a): ");
                            String enderecoDoFuncionario = teclado.nextLine();
                        System.out.print("Digite o salário do(a) Gestor(a) R$: ");
                            double salario = teclado.nextDouble();
                        teclado.nextLine();
                        System.out.print("Digite o turno de trabalho do(a) Gestor(a): ");
                            String turno = teclado.nextLine();
                        System.out.print("Digite o setor do(a) Gestor(a): ");
                            String setor = teclado.nextLine();
                        System.out.print("Digite as funções do(a) Gestor(a): ");
                            String funcoes = teclado.nextLine();

                        Gestor g = new Gestor(nomeDoFuncionario, enderecoDoFuncionario, salario, turno, setor, funcoes);
                        funcionarios.add(g);

                        break;
                    }

                    case 2: { //veterinario
                        System.out.println();
                        System.out.print("Digite o nome do(a) Veterinário(a):");
                            String nomeDoFuncionario = teclado.nextLine();
                        System.out.print("Digite o endereço do(a) Veterinário(a): ");
                            String enderecoDoFuncionario = teclado.nextLine();
                        System.out.print("Digite o salário do(a) Veterinário(a) R$: ");
                            double salario = teclado.nextDouble();

                        teclado.nextLine();

                        System.out.print("Digite o turno de trabalho do(a) Veterinário(a): ");
                            String turno = teclado.nextLine();
                        System.out.print("Digite o CRMV do(a) Veterinário(a): ");
                            String crmv = teclado.nextLine();
                        System.out.print("Digite a especialidade do(a) Veterinário(a): ");
                            String especialidade = teclado.nextLine();

                        Veterinario v = new Veterinario(nomeDoFuncionario, enderecoDoFuncionario, salario, turno, crmv, especialidade);
                        funcionarios.add(v);

                        break;
                    }
                }

                break;
            }

            case 3: { //cadastrar produto
                teclado.nextLine();
                System.out.println();
                System.out.print("Digite o produto que deseja cadastrar: ");
                    String nomeDoProduto = teclado.nextLine();

                System.out.print("Faça a descrição do produto: ");
                    String descricaoDoProduto = teclado.nextLine();

                System.out.print("Digite o valor do produto R$: ");
                    double precoDoProduto = teclado.nextDouble();

                Produto produto = new Produto(nomeDoProduto, descricaoDoProduto, precoDoProduto);
                produtos.add(produto);
                System.out.println("-- Produto cadastrado! --");
                teclado.nextLine();

                break;
            }

            case 4: //remover cliente
                teclado.nextLine();
                System.out.println();
                System.out.print("Digite o nome do cliente que deseja remover: ");
                    String removerCliente = teclado.nextLine();

                for (int i = 0; i < clientes.size(); i++) {
                    if (clientes.get(i).getNomeDoCliente().equalsIgnoreCase(removerCliente)) {
                        clientes.remove(i);
                        System.out.print("Cliente removido!");

                        break;
                    }
                }

            case 5: //remover funcionário
                teclado.nextLine();
                System.out.println();
                System.out.print("Digite o nome do funcionário que deseja remover: ");
                    String removerFuncionario = teclado.nextLine();
                        teclado.nextLine();

                for (int i = 0; i < funcionarios.size(); i++) {
                    if (funcionarios.get(i).getNomeDoFuncionario().equalsIgnoreCase(removerFuncionario)) {
                        funcionarios.remove(i);
                            System.out.print("Funcionário removido!");
                        teclado.nextLine();

                        break;
                    }
                }

            case 6: //remover produto
                teclado.nextLine();
                System.out.println();
                System.out.print("Digite o nome do produto que deseja remover: ");
                    String removerProduto = teclado.nextLine();

                for (int i = 0; i < produtos.size(); i++) {
                    if (produtos.get(i).getNomeDoProduto().equalsIgnoreCase(removerProduto)) {
                            produtos.remove(i);
                                System.out.print("Produto removido!");
                        teclado.nextLine();

                        break;
                    }
                }

            case 7: //listar todos os clientes e seus pets
                for (Cliente c : clientes) {
                        System.out.println();
                        System.out.println(c);
                        System.out.println(c.getPets());
                    teclado.nextLine();
                }

                break;

            case 8: //listar todos os funcionarios
                for (Funcionario f : funcionarios) {
                        System.out.println();
                        System.out.print(f);
                        System.out.println();
                }

            case 9: //listar todos os protutos
                for (Produto p : produtos) {
                        System.out.println();
                        System.out.print(p);
                        teclado.nextLine();
                        System.out.println();

                }

                break;

            case 10: // buscar todos os peixes
                boolean encontrouPeixe = false;
                for (Cliente c : clientes) {
                    for (Pet p : c.getPets()) {
                        if (p instanceof Peixe) {
                            System.out.println();
                            System.out.print(p);

                            encontrouPeixe = true;
                        }
                    }
                }

                if (!encontrouPeixe) {
                    System.out.println();
                    System.out.print("Nenhum Peixe cadastrado/encontrado");
                    System.out.println();
                }

                break;

            case 11: //buscar todos os mamíferos
                boolean encontrouMamifero = false;

                for (Cliente c : clientes) {
                    for (Pet m : c.getPets()) {
                        if (m instanceof Mamifero) {
                            System.out.println();
                            System.out.print(m);
                            System.out.println();

                            encontrouMamifero = true;
                        }
                    }
                }

                if (!encontrouMamifero) {
                    System.out.print("Nenhum Mamífero cadastrado/encontrado");
                }

                break;


            case 12: //buscar todos as aves
                boolean encontrouAve = false;

                for (Cliente c : clientes) {
                    for (Pet a : c.getPets()) {
                        if (a instanceof Ave) {
                            System.out.println();
                            System.out.print(a);
                            System.out.println();

                            encontrouAve = true;
                        }
                    }
                }

                if (!encontrouAve) {
                    System.out.println();
                    System.out.print("Nenhuma Ave cadastrada/encontrada");
                    System.out.println();
                }

                break;

            case 13: //buscar pets por raça
                teclado.nextLine();
                System.out.println();
                System.out.print("Digite a raça a ser procurada: ");
                    String buscaRaca = teclado.nextLine();

                for (Cliente c : clientes) {
                    for (Pet p : c.getPets()) {
                        if (p.getRaca().equalsIgnoreCase(buscaRaca)) {
                            System.out.println();
                            System.out.print(p);
                            System.out.println();
                        }
                    }
                }

                break;


            case 14: //buscar um cliente
                teclado.nextLine();
                System.out.println();
                System.out.print("Digite o nome do cliente a ser encontrado:");
                    String clienteProcurado= teclado.nextLine();

                boolean buscarCliente = false;

                for (Cliente c : clientes) {
                    if (c.getNomeDoCliente().equalsIgnoreCase(clienteProcurado)) {
                        System.out.print(c);
                            c.listarPetsDoCliente();
                        buscarCliente = true;
                    }
                }
                if (!buscarCliente) {
                    System.out.print("Nenhum cliente encontrado");
                    System.out.println();
                }

                break;


            case 15: //buscar um funcionário
                teclado.nextLine();
                System.out.println();
                System.out.print("Digite o nome do funcioário a ser procurado: ");
                    String funcionarioProcurado= teclado.nextLine();

                boolean buscarFuncionario = false;

                for (Funcionario f : funcionarios) {
                    if (f.getNomeDoFuncionario().equalsIgnoreCase(funcionarioProcurado)) {
                        System.out.println();
                        System.out.print(f);
                            f.listarFuncionarios();
                            System.out.println();
                    }

                    buscarFuncionario = true;
                }
                if (!buscarFuncionario) {
                    System.out.print("Nenhum funcionário encontrado");
                    System.out.println();
                }

                break;


            case 16: //buscar um produto
                teclado.nextLine();
                System.out.println();
                System.out.print("Digite o nome do produto a ser pesquisado: ");
                    String produtoProcurado=teclado.nextLine();

                boolean buscarProduto = false;

                for (Produto p : produtos) {
                    if (p.getNomeDoProduto().equalsIgnoreCase(produtoProcurado)) {
                        System.out.print(p);
                            p.listarProdutos();
                            System.out.println();
                    }

                     buscarProduto = true;
                }
                if (!buscarProduto) {
                    System.out.println();
                    System.out.print("Nenhum produto encontrado");
                    System.out.println();
                }

                break;


            case 17: //buscar salário de funcionário
                teclado.nextLine();
                System.out.println();
                System.out.print("Digite o nome do funcionário que deseja consultar o salário: ");
                    String buscarSalarioDoCliente = teclado.nextLine();


                for (Funcionario f : funcionarios) {
                    if (f.getNomeDoFuncionario().equalsIgnoreCase(buscarSalarioDoCliente)){
                        System.out.println();
                        System.out.print("Salário R$: " + f.getSalario());
                        System.out.println();
                    }
                }

                break;
        }

    }

    while (opcao != 0);
}



