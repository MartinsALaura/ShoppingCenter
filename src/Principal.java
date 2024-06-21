import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Criar uma loja");
            System.out.println("2 - Criar um produto");
            System.out.println("3 - Sair");

            do  {
                System.out.print("Digite a opção desejada: ");
                opcao = teclado.nextInt();
                if(opcao < 1 || opcao > 3)
                System.out.println("Opção inválida! Escolha uma das opções disponíveis.");
            }while(opcao < 1 || opcao > 3);

            switch (opcao) {
                case 1:
                System.out.println("Criando uma Loja...");
                Loja l = criarLoja();
                l.toString();
                break;
                case 2:
                System.out.println("Fazendo a opção 2");
                Produto p = criarProduto();
                if(p.estaVencido(new Data (20,10,2023)))
                    System.out.println("PRODUTO VENCIDO");
                else
                    System.out.println("PRODUTO NÃO VENCIDO");
                break;
                case 3:
                System.out.println("Saindo...");
                break;
                default:
                System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
    }

    private static Loja criarLoja(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o nome da loja:");
        String nome = teclado.nextLine();

        System.out.println("Informe a quantidade de funcionários:");
        int quantidadeFuncionarios = teclado.nextInt();
        teclado.nextLine(); 

        Endereco endereco = criarEndereco();

        System.out.println("Informe a data de fundação da loja (dia/mês/ano):");
        Data dataFundacao =  criarData();

        System.out.println("Informe o salário base dos funcionários (ou digite -1 se não especificado):");
        double salarioBaseFuncionario = teclado.nextDouble();

        System.out.println("Informe a quatidade máxima do estoque de produtos:");
        int qtdMaxProdutos = teclado.nextInt();
        
        Loja loja = new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, qtdMaxProdutos);
        System.out.println("Loja criada.");
        teclado.close();
        return loja;

    }

    private static Produto criarProduto(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o nome do produto: ");
        String nome = teclado.nextLine();

        System.out.print("Informe o preço do produto: ");
        double preco = teclado.nextDouble();

        System.out.print("Informe a data de validade (dia mês ano): ");
        Data dataValidade = criarData();
        

        Produto produto = new Produto(nome, preco, dataValidade);
        System.out.println("Produto criado: " + produto.toString());
        teclado.close();
        return produto;
    }

    private static Endereco criarEndereco(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o nome da rua:");
        String nomeDaRua = teclado.nextLine();

        System.out.println("Informe a cidade:");
        String cidade = teclado.nextLine();

        System.out.println("Informe o estado:");
        String estado = teclado.nextLine();

        System.out.println("Informe o país:");
        String pais = teclado.nextLine();

        System.out.println("Informe o CEP:");
        String cep = teclado.nextLine();

        System.out.println("Informe o número:");
        String numero = teclado.nextLine();

        System.out.println("Informe o complemento (ou deixe em branco se não houver):");
        String complemento = teclado.nextLine();

        teclado.close();
        return new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
    }

    private static Data criarData(){
        Scanner teclado = new Scanner(System.in);
        int dia = teclado.nextInt();
        int mes = teclado.nextInt();
        int ano = teclado.nextInt();

        teclado.close();
        return new Data(dia, mes, ano);
    }
}
