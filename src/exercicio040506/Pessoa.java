package exercicio040506;

import java.util.List;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static String pessoaMaisVelha(List<Pessoa> pessoas) {
        int maiorIdade = 0;
        String nomeMaisVelha = "";
        for (int i = 0; i < pessoas.size(); i++) {
            if (maiorIdade < pessoas.get(i).getIdade()) {
                maiorIdade = pessoas.get(i).idade;
                nomeMaisVelha = pessoas.get(i).nome;
            }
        }
        return nomeMaisVelha;
    }

    public static void removerMenor18 (List<Pessoa> pessoas) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).idade < 18) {
                pessoas.remove(i);
            }
        }
    }

    public static void consultarPessoa (List<Pessoa> pessoas, String nome) {
        int count = 0;
        for (int i = 0; i < pessoas.size(); i++) {
            if (nome.equals(pessoas.get(i).getNome())) {
                System.out.println("Sim. Sua idade é de " + pessoas.get(i).getIdade() + " anos.");
                count++;
            }
        }
        if (count == 0){
            System.out.println("Não.");
        }
    }
}
