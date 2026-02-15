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


    while (opcao != 4){
        System.out.println("\n ==== PRODUTOS ====");
        System.out.println("1. Listar produtos");
        System.out.println("2. Vender produto");
        System.out.println("3. Repor estoque ");
        System.out.println("4. Sair");

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

        }



    }

        scanner.close();
    }
}