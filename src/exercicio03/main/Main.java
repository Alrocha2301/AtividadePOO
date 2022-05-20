package exercicio03.main;

import exercicio03.model.Guerreiro;
import exercicio03.model.Mago;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //criar lista de magia
        List<String> magias = new ArrayList<>();
        magias.add("cura");
        magias.add("fogo");
        magias.add("água");

        //criar lista de habilidades
        List<String> habilidades = new ArrayList<>();
        habilidades.add("soco forte");
        habilidades.add("soco fraco");
        habilidades.add("esquiva");

        //criar mago
        Mago mago = new Mago("Harry", 50, 75, 30f,40, 15, 2, magias);
        Mago mago2 = new Mago("Rony", 50, 75, 30f,40, 15, 2, magias);

        //criar guerreiro
        Guerreiro guerreiro = new Guerreiro("Conan", 75,50,30f, 20, 35, 2, habilidades );

        guerreiro.mostrarPersonagem();
        guerreiro.attack();
        guerreiro.lvlUp();
        guerreiro.mostrarPersonagem();
        guerreiro.attack();

        mago.mostrarPersonagem();
        mago.attack();
        mago.lvlUp();
        mago.mostrarPersonagem();
        mago.attack();

        mago.aprenderMagia("gelo");
        System.out.println("Magias do Mago: " + magias);

        guerreiro.aprenderHabilidade("bloqueio");
        System.out.println("Habilidades do guerreiro: " + habilidades);

        System.out.println("Quantidade de Guerreiros: " + guerreiro.contadorPersonagem());

        System.out.println("Quantidade de Magos: " + mago.contadorPersonagem());

    }
}
