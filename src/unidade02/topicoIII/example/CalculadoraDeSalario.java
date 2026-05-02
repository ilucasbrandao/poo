package unidade02.topicoIII.example;

public class CalculadoraDeSalario {

    // Metodo polimórfico: aceita qualquer coisa que implemente Calculavel
    public double calcular(Calculavel funcionario) {
        return funcionario.calcularSalario();
    }
}
