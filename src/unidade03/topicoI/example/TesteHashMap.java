package unidade03.topicoI.example;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

/**
 * Exemplo de uso da estrutura HashMap para buscas rápidas.
 * O HashMap armazena dados no formato Chave -> Valor.
 */

public class TesteHashMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Instanciação de objetos Pessoa
        Pessoa p1 = new Pessoa("Lucas", "12345698712");
        Pessoa p2 = new Pessoa("Julianne", "78945623544");
        Pessoa p3 = new Pessoa("Sophia", "54678932166");
        Pessoa p4 = new Pessoa("Maria", "23456412599");

        /**
         * 2. Declaração do HashMap:
         * <String, Pessoa> -> O primeiro tipo (String) é a CHAVE, o segundo (Pessoa) é o VALOR.
         * O HashMap é uma implementação da interface Map que armazena os elementos em uma tabela hash.
         */
        Map<String, Pessoa> lista = new HashMap<>();

        /**
         * 3. Adicionando elementos:
         * mapa.put(chave, valor) -> Adiciona um par chave-valor ao mapa.
         * Aqui, usamos o CPF (String) como a chave única para encontrar o objeto Pessoa.
         */
        lista.put(p1.getCpf(), p1);
        lista.put(p2.getCpf(), p2);
        lista.put(p3.getCpf(), p3);
        lista.put(p4.getCpf(), p4);

        // 4. Lógica de busca
        System.out.println("Digite o CPF para busca: ");
        String cpfBusca = input.nextLine();

        /**
         * containsKey(cpfBusca) -> Verifica se existe aquela chave específica no mapa.
         * lista.get(cpfBusca) -> Retorna o objeto (Valor) associado àquela chave.
         */
        if (lista.containsKey(cpfBusca)) {
            Pessoa encontrada = lista.get(cpfBusca);
            System.out.println("Pessoa encontrada: " + encontrada.getNome());
        } else {
            System.out.println("Pessoa não encontrada.");
        }

        // --- CONCEITOS IMPORTANTES PARA APRENDIZAGEM ---

        /**
         * Map.Entry:
         * É uma interface que representa um par chave-valor dentro do mapa.
         * É usada principalmente quando precisamos iterar sobre o mapa completo.
         */

        /**
         * entrySet():
         * Retorna um conjunto (Set) de todas as entradas do mapa.
         * Exemplo de como percorrer:
         * for (Map.Entry<String, Pessoa> entrada : lista.entrySet()) {
         *     System.out.println("CPF: " + entrada.getKey() + " | Nome: " + entrada.getValue().getNome());
         * }
         */

        input.close(); // Boa prática: Fechar o Scanner ao finalizar
    }
}
