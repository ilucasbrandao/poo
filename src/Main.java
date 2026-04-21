import unidade02.topicoI.Fatorial;
import unidade02.topicoI.Item;
import unidade02.topicoI.Produto;
import unidade02.topicoI.Venda;

class Main {
    static void main(String[] args) {
        System.out.println("Hello World!");

        // instanciando um obj Fatorial
        Fatorial fatorial = new Fatorial();

        // retornando o valor da fatoriação
        System.out.println(fatorial.calcularFatorial(0));

        System.out.println("----------------------------");
        System.out.println(" Exemplo do sistema de Venda");
        System.out.println("----------------------------");

        // Instanciando o obj P1 que é um Produtos
        Produto p1 = new Produto("Teclado Mecânico", 250.00, "Teclado Kumara RGB", 15);
        Produto p2 = new Produto("Mouse Gamer", 150.00, "Mouse Logitech G502", 30);

        // Instanciando o obj Venda que é uma Venda
        Venda venda1 = new Venda("20-04-2026", 123, "Lucas Brandão");

        // Adicionando itens a venda
        venda1.adicionarItem(new Item(1, p1));
        venda1.adicionarItem(new Item(1, p2));

        // Imprime nota da venda
        venda1.imprimirResumo();
    }

}