package unidade03.topicoI.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Testador02 {

        public static void main(String[] args) {
            Pessoa p1 = new Pessoa("Lucas", "12345698712");
            Pessoa p2 = new Pessoa("Julianne", "78945623544");
            Pessoa p3 = new Pessoa("Sophia", "54678932166");
            Pessoa p4 = new Pessoa("Maria", "23456412599");

            HashMap<String, Pessoa> mapa = new HashMap<>();
            mapa.put(p1.getCpf(), p1);
            mapa.put(p2.getCpf(), p2);
            mapa.put(p3.getCpf(), p3);
            mapa.put(p4.getCpf(), p4);


            String cpfBusca = "78945623544";
            if(mapa.containsKey(cpfBusca)){
                System.out.println("Pessoa encontrada: " + mapa.get(cpfBusca).getNome());
            }


            System.out.println("Percorrendo o mapa com for-each");
            System.out.println("------------------------");
            for(Map.Entry<String, Pessoa> elemento : mapa.entrySet()){
                System.out.println("Nome: " + elemento.getValue().getNome());
                System.out.println("CPF: "+ elemento.getValue().getCpf());
                System.out.println("------------------------");

            }

        }

        // HashMap -> é uma implementação da interface Map que armazena os elementos em uma tabela hash.
        // <String, Pessoa> ->
        // mapa.put(chave, valor) -> é um metodo da interface Map que adiciona um par chave-valor ao mapa.

        // Map.Entry -> é uma interface que representa um par chave-valor em um mapa.
        // Ela é usada para iterar sobre os elementos de um mapa, permitindo acessar tanto a
        // chave quanto o valor de cada entrada.

        // EntrySet() retorna um conjunto de entradas (pares chave-valor) do mapa,
        // que pode ser percorrido usando um loop for-each ou um iterador.



}
