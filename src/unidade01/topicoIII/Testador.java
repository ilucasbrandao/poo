package unidade01.topicoIII;

public class Testador {
    static void main(String[] args){
        Pessoa p;

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
