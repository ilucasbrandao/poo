package unidade02.topicoI;

public class Item {
    private int quantidade;
    private Produto produto;

    public Item(int quantidade, Produto produto){
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public double calcularSubtotal(){
        return this.quantidade * produto.getPreco();
    }

    // Getters e Setter
    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }
}
