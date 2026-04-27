package unidade02.topicoIII.example;

import unidade02.topicoIII.example.Calculavel;
import unidade02.topicoIII.example.Funcionario;

public class FuncionarioHorista extends Funcionario implements Calculavel {
    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(String nome, int codigo, int horasTrabalhadas, double valorHora) {
        super(nome, codigo);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }
}