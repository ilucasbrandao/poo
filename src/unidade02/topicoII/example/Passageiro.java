package unidade02.topicoII.example;

public class Passageiro {
    private int numeroSmiles;
    private Pessoa pessoa;

    public int getNumeroSmiles() {
        return numeroSmiles;
    }

    public void setNumeroSmiles(int numeroSmiles) {
        this.numeroSmiles = numeroSmiles;
    }

    public String getNome() {
        return pessoa.getNome();
    }

    public void setNome(String nome) {
        pessoa.setNome(nome);
    }

    public String getEndereco(){
        return pessoa.getEndereco();
    }

    public void setEndereco(String endereco){
        pessoa.setEndereco(endereco);
    }

}
