import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int opcao = 0;


        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Mouse",25.0, 15));
        produtos.add(new Produto("Teclado", 54.0, 16));
        produtos.add(new Produto("Monitor", 95.4, 18));


    while (opcao != 6){
        System.out.println("\n ==== PRODUTOS ====");
        System.out.println("1. Listar produtos");
        System.out.println("2. Vender produto");
        System.out.println("3. Repor estoque ");
        System.out.println("4. Cadastrar novo produto");
        System.out.println("5. Mostrar valor total do estoque");
        System.out.println("6. Sair");

        opcao = scanner.nextInt();


        if(opcao == 1) {
            for(int i = 0; i < produtos.size(); i++){
                System.out.println("ID " + i);
                produtos.get(i).mostrarTudo();
            }
        }

        else if(opcao == 2){
            System.out.println("Digite a ID do Produto:");
            int id = scanner.nextInt();

            if(id < 0 || id >= produtos.size()){
                System.out.println("ID Inválido!");
                continue;
            }
            System.out.println("Quantidade pra vender: ");
            int qtd  = scanner.nextInt();

            produtos.get(id).vender(qtd);

        }
        else if(opcao == 3){
            System.out.println("Digite a ID do Produto:");
            int id = scanner.nextInt();
            if(id < 0 || id >= produtos.size()){
                System.out.println("ID invalido!");
                continue;
            }
            System.out.println("Digite a quantidade para repor:");
            int qtd = scanner.nextInt();

            produtos.get(id).repor(qtd);

        }else if(opcao == 4){
            scanner.nextLine();

            System.out.println("Digite o nome do produto:");
            String nome = scanner.nextLine();

            System.out.println("Digite o preço: ");
            double preco = scanner.nextDouble();

            System.out.println("Digite a quantidade: ");
            int qtd = scanner.nextInt();

            produtos.add(new Produto(nome, preco, qtd));

            System.out.println("Produto adicionado com sucesso!");


        }else if(opcao == 5){
            double totalEstoque = 0;

            for(int i = 0; i<  produtos.size(); i++){
                Produto p = produtos.get(i);

                totalEstoque += p.getPreco() * p.getQuantidade();


                System.out.println(totalEstoque);



            }

        };




    }

        scanner.close();
    }
}