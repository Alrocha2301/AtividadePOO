package exercicio040506;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("João", 15));
        pessoas.add(new Pessoa("Leandro", 21));
        pessoas.add(new Pessoa("Paulo", 17));
        pessoas.add(new Pessoa("Jessica", 18));

        //04 - Pessoa mais velha da lista
        System.out.println("Pessoa mais velha: " + Pessoa.pessoaMaisVelha(pessoas));

        //05 - Excluindo menores de 18 anos
        System.out.println("Quantidade de pessoas na lista antes da exclusão dos menores de 18: " + pessoas.size());
        Pessoa.removerMenor18(pessoas);
        System.out.println("Quantidade de pessoas na lista depois da exclusão dos menores de 18: " + pessoas.size());

        //06 - Consultando Jessica
        System.out.print("Consta o nome de Jessica na lista: ");
        Pessoa.consultarPessoa(pessoas, "Jessica");

    }
}
