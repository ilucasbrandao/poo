package unidade02.topicoIII.example;

public class Testador {
    public static void main(String[] args) {
        Double f1[] = new Double[50];
        Double f2[] = new Double[50];

        Copier<Double> cpDouble = new Copier<>();

        cpDouble.copy(f1, f2, 10);

        CalculadoraDeSalario calc = new CalculadoraDeSalario();

        Calculavel func1 = new FuncionarioComissionado("Lucas", 100, 50000.0, 0.1);
        Calculavel func2 = new FuncionarioHorista("Julianne Kelly", 180, 180, 12.80);

        System.out.println("Salário do Comissionado: "  + calc.calcular(func1));
        System.out.println("Salário do Horista: "+ calc.calcular(func2));
    }
}
