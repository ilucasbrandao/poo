package desafioprossional.Classes;

import java.util.ArrayList;

public class Cliente extends Pessoa{
    private ArrayList<Animal> animais;

    public Cliente(String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal){
        this.animais.add(animal);
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }
}
