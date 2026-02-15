//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Produto[] produtos = new Produto[3];

    produtos[0] = new Produto("Teclado", 25.0, 10);
    produtos[1] = new Produto("Mouse", 45.0, 12);
    produtos[2] = new Produto("Monitor", 95.3, 5);



    for(int i = 0; i < produtos.length; i++){
        produtos[i].mostrarTudo();
        System.out.println("--------------------");
    }


    }
}