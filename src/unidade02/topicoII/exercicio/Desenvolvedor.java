package unidade02.topicoII.exercicio;

public class Desenvolvedor extends Funcionario {
    private String linguagem;

    public Desenvolvedor(String nome, String cpf, double salario, String linguagem) {
        super(nome, cpf, salario);
        this.linguagem = linguagem;
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.15;
    }
}