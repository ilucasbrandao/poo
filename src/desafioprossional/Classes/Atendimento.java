package desafioprossional.Classes;

import java.util.Date;

public class Atendimento {
    private Date data;
    private String status;
    private Animal animal;
    private Profissional profissional;
    private String tipo;
    private Cliente dono;

    public Atendimento(Date data, String status, Animal animal, Profissional profissional, String tipo, Cliente dono) {
        this.data = data;
        this.dono = dono;
        this.animal = animal;
        this.status = "Agendado";
        this.profissional = profissional;
        this.tipo = tipo;
    }

    public void resumirAtendimento() {
        System.out.println("----- RESUMO DE ATENDIMENTO -----");
        System.out.println("Animal: " + animal.getNome() + " | Proprietário: " + dono.getNome());
        System.out.println("Serviço: " + tipo + " | Profissional: " + profissional.getNome());
        System.out.println("Status: " + this.status);
        System.out.println("---------------------------------");
    }

    public void finalizarAtendimento() {
        this.status = "Finalizado";
        System.out.println("Atendimento do pet " + animal.getNome() + " foi concluído.");
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
