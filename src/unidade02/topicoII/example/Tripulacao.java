package unidade02.topicoII.example;

public class Tripulacao {
    private int idTripulacao;
    private Pessoa pessoa;

    public Tripulacao(Pessoa p){
        pessoa = p;
    }

    public int getIdTripulacao(){
        return idTripulacao;
    }

    public void setIdTripulacao(int idTripulacao) {
        this.idTripulacao = idTripulacao;
    }

    public String getNome(){
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
