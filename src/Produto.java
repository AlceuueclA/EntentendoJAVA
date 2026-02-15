public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String a, double b, int c){

        this.nome = a;
        this.preco = b;
        this.quantidade = c;

    }

    public void mostrarTudo(){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

    public void vender(int qtd){


        if(qtd <= quantidade) {
            quantidade-= qtd;
            System.out.println("Venda realizada!");
            System.out.println("Restam " + quantidade + " unidades no estoque");
        } else{
            System.out.println("Sem estoque!");
        }
    }
    public void repor(int qtd){
        quantidade += qtd;
        System.out.println("Estoque atualizado!");
    }
    public String getNome(){
        return nome;

    }

    public double getPreco(){
      return preco;
    }

    public int getQuantidade(){
        return  quantidade;
    }

}


