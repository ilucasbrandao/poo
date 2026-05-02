package desafioprossional.Classes;

public class Animal {
    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private Cliente dono;

    public Animal(String nome, String especie, String raca, int idade, Cliente dono) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public String getEspecie() {
        return especie;
    }
}
