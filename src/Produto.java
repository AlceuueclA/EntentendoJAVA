public class Produto {

    String nome;
    double preco;
    int quantidade;

    public Produto(String a, double b, int c){

        this.nome = a;
        this.preco = b;
        this.quantidade = c;

    }

    public void mostrarTudo(){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    };

}


