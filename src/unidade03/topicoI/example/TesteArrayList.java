package unidade03.topicoI.example;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        // List: Mantém a ordem de inserção e permite duplicatas
        List<Pessoa> lista = new ArrayList<>();

        // Populando a lista com dados completos
        lista.add(new Pessoa("Lucas", "12345698712", 1.63));
        lista.add(new Pessoa("Julianne", "78945623544", 1.62));
        lista.add(new Pessoa("Sophia", "54678932166", 1.22));
        lista.add(new Pessoa("Veronica", "23456412599", 1.50));
        lista.add(new Pessoa("Alice", "33365485236", 1.10));

        // ORDENAÇÃO 1: Usa o compareTo definido na classe Pessoa (Ordem por Nome)
        Collections.sort(lista);

        // ORDENAÇÃO 2: Usa uma classe externa (ProviderAltura) para ordenar por altura
        // Isso permite mudar o critério de ordenação sem mexer na classe Pessoa
        Collections.sort(lista, new ProviderAltura());

        // Saída de dados usando o Enhanced For (For Iterator)
        System.out.println("Percorrendo a lista final (Ordenada por Altura):");
        for (Pessoa p : lista) {
            System.out.println("Nome: " + p.getNome() + ", CPF: " + p.getCpf() + ", Altura: " + p.getAltura());
        }
        System.out.println("----------------------");
    }
}
