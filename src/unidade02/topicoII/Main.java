package unidade02.topicoII;

public class Main {
    static void main(String[] args) {
        AlunoGraduacao alunoCalouro = new AlunoGraduacao("Lucas", 456, "Analise e Desenvolvimento de Sistemas");
        alunoCalouro.imprime();
        System.out.println("---------------------------------------");
        AlunoPosGraduacao alunoVeterano = new AlunoPosGraduacao("Maria", 789, "Engenharia de Software", "Uniasselvi");
        alunoVeterano.imprimeInfos();
    }
}
