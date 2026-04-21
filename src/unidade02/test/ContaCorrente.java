package unidade02.test;

public class ContaCorrente {
    private double saldo;
    private int numeroConta;
    private Correntista correntista;

    public ContaCorrente(int numero, Correntista corr){
        numeroConta = numero;
        correntista = corr;
    }

    public double depositar(double valor) {
       return saldo += valor;
    }

    public void sacarValor(double valor){
        if(existeSaldo(valor) == true) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");}
    }

    private boolean existeSaldo(double valor) {
        boolean resultado = (valor <= saldo) ? true : false;
        return resultado;
    }

    public Correntista getCorrentista(){
        return correntista;
    }

    public int getNumero(){
        return  numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
