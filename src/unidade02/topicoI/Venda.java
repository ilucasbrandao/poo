package unidade02.topicoI;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private String data;
    private int operador;
    private String cliente;
    private List<Item> itens;

    public Venda(String data, int operador, String cliente){
        this.data = data;
        this.operador = operador;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item){
        this.itens.add(item);
    }

    public double calcularValorTotal(){
        double total = 0;
        for(Item i : itens) {
            total += i.calcularSubtotal();
        }
        return total;
    }

    public void imprimirResumo(){
        System.out.println("Venda p/: " + cliente + " | Data: " + data + " | operação: " + operador);
        System.out.println("----------------------------");
        for(Item i : itens){
            System.out.println(i.getProduto().getNome() + " x" + i.getQuantidade() + " = R$ " + i.calcularSubtotal());
        }
        System.out.println("----------------------------");
        System.out.println("Valor Total: R$ " + calcularValorTotal());
    }
}
