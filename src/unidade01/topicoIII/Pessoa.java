package unidade01.topicoIII;

public class Pessoa {
    public String nome;
    public String cpf;
    public char sexo;

    public void imprimirNome() {
        System.out.println(nome);
    }

    public void validarCPF() {
        boolean retorno = (cpf != null && !cpf.isEmpty());
        System.out.println(retorno);
    }
}
