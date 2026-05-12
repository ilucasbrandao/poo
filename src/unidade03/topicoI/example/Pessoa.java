package unidade03.topicoI.example;

import java.util.Objects;

/**
 * Classe que representa uma Entidade Pessoa.
 * Implementa Comparable para permitir ordenação natural (por nome).
 */
public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private String cpf;
    private double altura;

    // --- CONSTRUTORES ---

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Construtor completo utilizando encadeamento (this) para evitar repetição de código.
     */
    public Pessoa(String nome, String cpf, double altura) {
        this(nome, cpf); // Chama o construtor acima
        this.altura = altura;
    }

    // --- GETTERS E SETTERS ---

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    // CPF geralmente é imutável após definido, por isso omitimos o setCpf para maior segurança

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) { // Validação simples e profissional
            this.altura = altura;
        }
    }

    // --- CONTRATOS DA LINGUAGEM (Essencial para Collections) ---

    /**
     * Define a ordem natural: Alfabética por nome.
     * Retorna: 0 se igual, < 0 se menor, > 0 se maior.
     */
    @Override
    public int compareTo(Pessoa outraPessoa) {
        if (outraPessoa == null) return 1;
        return this.nome.compareToIgnoreCase(outraPessoa.getNome());
    }

    /**
     * Fundamental para uso em HashSets e HashMaps.
     * Compara o estado dos objetos, não apenas o endereço de memória.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Double.compare(pessoa.altura, altura) == 0 &&
                Objects.equals(nome, pessoa.nome) &&
                Objects.equals(cpf, pessoa.cpf);
    }

    @Override
    public int hashCode() {
        // Gera um hash único baseado nos campos, evitando colisões em coleções
        return Objects.hash(nome, cpf, altura);
    }

    @Override
    public String toString() {
        return String.format("Pessoa[nome=%s, cpf=%s, altura=%.2f]", nome, cpf, altura);
    }
}
