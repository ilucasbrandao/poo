package unidade03.topicoI.example;

import java.util.ArrayList;
import java.util.List;

public class Testador01 {
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();

        Pessoa p1 = new Pessoa("Lucas", "12345698712");
        Pessoa p2 = new Pessoa("Julianne", "78945623544");
        Pessoa p3 = new Pessoa("Sophia", "54678932166");
        Pessoa p4 = new Pessoa("Maria", "23456412599");

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        System.out.println("Percorrendo com um for interator");
        for (Pessoa p : lista) {
            System.out.println("Nome: " + p.getNome() + ", CPF: " + p.getCpf());
        }
        System.out.println("----------------------");

        System.out.println("Percorrendo com um for tradicional");
        for(int i = 0; i < lista.size(); i++){
            Pessoa p = lista.get(i);
            System.out.println("Nome: " + p.getNome() + ", CPF: " + p.getCpf());
        }
        System.out.println("----------------------");

    }
}
