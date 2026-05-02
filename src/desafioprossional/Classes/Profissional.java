package desafioprossional.Classes;

public class Profissional extends Pessoa{
    private String crmv;
    public Profissional(String nome, String cpf, String telefone, String crmv) {
        super(nome, cpf, telefone);
        this.crmv = crmv;
    }

    public String getCrmv() {
        return crmv;
    }
}
