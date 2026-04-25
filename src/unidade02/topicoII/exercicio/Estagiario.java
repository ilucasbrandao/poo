package unidade02.topicoII.exercicio;

public class Estagiario extends Funcionario {
    private int horasTrabalhadas;

    public Estagiario(String nome, String cpf, double salario, int horasTrabalhadas){
        super(nome, cpf, salario);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.05;
    }
}
