package exercicio03.model;

import exercicio03.interfaces.Acoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem implements Acoes {
    List<String> habilidades = new ArrayList<>();
    static int CONTADOR_GUERREIRO = 0;

    public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> habilidades) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.habilidades = habilidades;
        this.CONTADOR_GUERREIRO++;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public void lvlUp() {
        setLevel(getLevel() + 1);
        setForca(getForca() + getLevel() * 2);
        setVida(getVida() + getLevel() * 2);
        setMana(getMana() + getLevel());
        setInteligencia(getInteligencia() + getLevel());
    }

    @Override
    public void attack() {
        Random numeroAleatorio = new Random();
        int ataque = (getForca()*getLevel()) + numeroAleatorio.nextInt(300);
        System.out.println("Ataque Guerreiro: " + ataque);
    }

    public void aprenderHabilidade (String habilidade) {
        habilidades.add(habilidade);
    }

    public static int contadorPersonagem() {
        return CONTADOR_GUERREIRO;
    }
}
