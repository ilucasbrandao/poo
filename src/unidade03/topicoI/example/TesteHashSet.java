package unidade03.topicoI.example;

import java.util.Set;
import java.util.HashSet;

/**
 * Classe para testar o comportamento da implementação HashSet.
 * O HashSet é uma coleção que não permite elementos duplicados e
 * não garante a ordem dos itens.
 */
public class TesteHashSet {
    public static void main(String[] args) {

        // 1. Instanciação dos objetos do tipo Pessoa
        Pessoa p1 = new Pessoa("Lucas");
        Pessoa p2 = new Pessoa("Julianne");
        Pessoa p3 = new Pessoa("Sophia");
        Pessoa p4 = new Pessoa("Veronica");

        // 2. Declaração do Set usando Polimorfismo
        // Usamos a interface Set do lado esquerdo e a implementação HashSet do lado direito
        Set<Pessoa> lista = new HashSet<>();

        // 3. Adicionando os objetos à coleção
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        // 4. Iteração sobre a coleção
        // O "for-each" percorre cada objeto Pessoa dentro do conjunto 'lista'
        for(Pessoa p : lista) {
            System.out.println("Nome: " + p.getNome());
        }

        // 5. Verificação de existência
        // O método .contains(p2) verifica se a referência do objeto p2 está no conjunto.
        // Nota: Para resultados consistentes, a classe Pessoa deve implementar equals/hashCode.
        if(lista.contains(p2)){
            System.out.println(p2.getNome() + " está na lista.");
        } else {
            System.out.println(p2.getNome() + " não está na lista.");
        }

        // 6. Limpeza da coleção
        // O método .clear() remove todos os elementos do Set de uma vez
        lista.clear();
    }
}
