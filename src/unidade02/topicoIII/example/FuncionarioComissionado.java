package unidade02.topicoIII.example;


public class FuncionarioComissionado extends Funcionario implements Calculavel {
    private double totalVendas;
    private double taxaComissao;

    public FuncionarioComissionado(String nome, int codigo, double totalVendas, double taxaComissao) {
        super(nome, codigo);
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }

    @Override
    public double calcularSalario() {
        return totalVendas * taxaComissao;
    }
}