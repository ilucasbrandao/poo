package unidade02.topicoII.exercicio;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Julianne Kelly", "350045687754", 3200, "Escolar");
        Funcionario estagiario = new Estagiario("Sophia Luz", "12345678999", 1250, 160);
        Funcionario desenvolvedor = new Desenvolvedor("Lucas Brandao", "05277336362", 5900, "Java");

        System.out.println("Gerente: " + gerente.getNome() + "| Salário: " + gerente.getSalario()  + "| Bônus: " + gerente.calcularBonus());
        System.out.println("Estagiario(a): " + estagiario.getNome() + "| Salário: " + estagiario.getSalario()  + "| Bônus: " + estagiario.calcularBonus());
        System.out.println("Desenvolvedor(a): " + desenvolvedor.getNome() + "| Salário: " + desenvolvedor.getSalario()  + "| Bônus: " + desenvolvedor.calcularBonus());
    }
}