package unidade02.topicoII;

public class AlunoGraduacao extends Aluno {
    public AlunoGraduacao(String nome, int matricula, String curso){
        super(nome, matricula, curso);
    }

    protected void imprime(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Curso: " + this.getCurso());
    }
}
