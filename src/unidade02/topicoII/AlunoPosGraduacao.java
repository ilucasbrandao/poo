package unidade02.topicoII;

public class AlunoPosGraduacao extends Aluno {
    private String instituicaoDeGraduacao;
    public AlunoPosGraduacao(String nome, int matricula, String curso, String instituicao) {
        super(nome, matricula, curso);
        this.instituicaoDeGraduacao = instituicao;
    }

    protected void imprimeInfos(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("Instituição de Graduação: " + this.instituicaoDeGraduacao);
    }

    public String getCursoDeGraduacao(){
        return instituicaoDeGraduacao;
    }
}
