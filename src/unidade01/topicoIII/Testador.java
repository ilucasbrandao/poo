package unidade01.topicoIII;

public class Testador {
    public static void main(String[] args){
        Pessoa p;
        int contador;

        p = new Pessoa();
        p.nome = "Lucas";
        p.cpf = "1234567899";
        p.sexo = 'M';

        // Instanciando um novo objeto Pessoa
        Pessoa p2 = new Pessoa();
        p2.nome ="Julianne";
        p2.cpf = "321654987";
        p2.sexo = 'F';

        p.imprimirNome();
        p.validarCPF();
    }
}
