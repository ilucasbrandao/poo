package unidade03.topicoI.example;

import java.util.Comparator;

/**
 * Classe comparadora externa para objetos do tipo Pessoa.
 * Implementar Comparator permite criar ordens alternativas à ordem natural (compareTo).
 */
public class ProviderAltura implements Comparator<Pessoa> {

    /**
     * Compara duas pessoas baseando-se na altura.
     *
     * Nota de aprendizagem:
     * Da forma que está escrito (p2 comparado a p1), a lista será ordenada
     * de forma DECRESCENTE (do mais alto para o mais baixo).
     */
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        // Uso do Double para acessar o método compareTo de objetos numéricos
        // Aprendizado: new Double() está depreciado desde o Java 9.
        // Em um projeto real, usa-se: Double.valueOf(p2.getAltura()).compareTo(p1.getAltura());
        return new Double(p2.getAltura()).compareTo(p1.getAltura());
    }
}
