package unidade02;

import unidade02.test.ContaCorrente;
import unidade02.test.Correntista;

public class Main {
    static void main(String[] args) {
        Correntista correntista1 = new Correntista("Lucas", 1234544521, "88988839663", "Doutor Bezerra de Meneses");
        //correntista1.imprimeDados();

        ContaCorrente cc1 = new ContaCorrente(1350, correntista1);
        System.out.println(cc1.getCorrentista().getNome());
        System.out.println(cc1.getCorrentista().getEndereco());
        cc1.depositar(250.00);
        System.out.println(cc1.getSaldo());



    }
}
