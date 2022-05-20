package exercicio02.br.com.model;

import exercicio02.br.com.interfaces.Imposto;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    String nome;
    String cnpj;

    List<VideoGame> videoGames = new ArrayList<>();
    List<Livro> livros = new ArrayList<>();

    public Loja() {
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

    public void listaLivros() {
        if (!livros.isEmpty()) {
            System.out.println("\nA loja " + getNome() + " possui estes livros para venda: ");
            for (int i = 0; i < livros.size(); i++) {
                System.out.println("Título: " + livros.get(i).getNome() + ", preço: " +
                        livros.get(i).getPreco() + ", quantidade: " + livros.get(i).getQtd() + " em estoque.");
            }
        } else {
            System.out.println("A loja não tem livros no seu estoque.");
        }
    }

    public void listaGames() {
        if (!videoGames.isEmpty()) {
            System.out.println("\nA loja " + getNome() + " possui estes vídeo-games para venda: ");
            for (int i = 0; i < videoGames.size(); i++) {
                System.out.println("Título: " + videoGames.get(i).getModelo() + ", preço: " +
                        videoGames.get(i).getPreco() + ", quantidade: " + videoGames.get(i).getQtd() + " em estoque.");
            }
        } else {
            System.out.println("A loja não tem video-games no seu estoque.");
        }
    }

    public Double calculaPatrimonio() {
        Double totalLivros = 0d;
        Double totalGames = 0d;
        for (int i = 0; i < livros.size(); i++) {
            totalLivros += livros.get(i).getPreco() * livros.get(i).getQtd();
        }
        for (int i = 0; i < videoGames.size(); i++) {
            totalGames += videoGames.get(i).getPreco() * videoGames.get(i).getQtd();
        }
        Double patrimonio = totalLivros + totalGames;
        System.out.print("\nO Patrimônio da loja: " + getNome() + " é de R$ ");

        return patrimonio;

    }
}
