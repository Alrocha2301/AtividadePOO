package exercicio03.model;

import exercicio03.interfaces.Acoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem implements Acoes {
    List<String> magias = new ArrayList<>();
    static int CONTADOR_MAGO;

    public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> magias) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        this.magias = magias;
        this.CONTADOR_MAGO++;
    }

    public List<String> getMagias() {
        return magias;
    }

    public void setMagias(List<String> magias) {
        this.magias = magias;
    }

    @Override
    public void lvlUp() {
        setLevel(getLevel() + 1);
        setForca(getForca() + getLevel());
        setVida(getVida() + getLevel());
        setMana(getMana() + getLevel() * 2);
        setInteligencia(getInteligencia() + getLevel() * 2);
    }

    @Override
    public void attack() {
        Random numeroAleatorio = new Random();
        int ataque = (getInteligencia() * getLevel()) + numeroAleatorio.nextInt(300);
        System.out.println("Ataque Mago: " + ataque);
    }

    public void aprenderMagia(String Magia) {
        magias.add(Magia);
    }

    public static int contadorPersonagem() {
        return CONTADOR_MAGO;
    }
}
