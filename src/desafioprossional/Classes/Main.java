package desafioprossional.Classes;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Profissional veterinario = new Profissional("Dr. João", "12345678900", "11987654321", "Veterinário");
        Profissional banhista = new Profissional("Maria", "98765432100", "11912345678", "Banhista");
        Cliente c1 = new Cliente("Joana", "45612378988", "88988744411");
        Animal animal1 = new Animal("Rex", "Cachorro", "Pitbull",3 , c1);
        Atendimento atendimento1 = new Atendimento(new Date(), "Agendado", animal1, veterinario,"Consulta", c1 );
        Cliente c2 = new Cliente("Carlos", "78945612377", "11999887766");
        Animal animal2 = new Animal("Mia", "Gato", "Siamês", 2, c2);
        Atendimento atendimento2 = new Atendimento(new Date(), "Agendado", animal2, banhista,"Banho", c2 );

        // Iniciando resumo dos atendimentos
        atendimento1.resumirAtendimento();
        atendimento2.resumirAtendimento();

        // Finalizando os atendimentos
        atendimento1.finalizarAtendimento();
        atendimento2.finalizarAtendimento();

        // Resumo dos atendimentos após finalização
        atendimento1.resumirAtendimento();
        atendimento2.resumirAtendimento();
    }

}
