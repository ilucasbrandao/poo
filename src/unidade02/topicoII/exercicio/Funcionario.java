package unidade02.topicoII.exercicio;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public abstract double calcularBonus();

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}