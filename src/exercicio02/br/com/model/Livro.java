package exercicio02.br.com.model;

import exercicio02.br.com.interfaces.Imposto;

import java.util.ArrayList;
import java.util.List;

public class Livro extends Produto implements Imposto {
    String autor;
    String tema;
    int qtdPaginas;

    public Livro(String nome, Double preco, int qtd, String autor, String tema, int qtdPaginas) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPaginas = qtdPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    @Override
    public Double calcularImposto() {
        if (getTema().equals("educativo")) {
            System.out.println("Livro educativo não tem imposto: " + getNome() + ".");
            return 0d;
        } else {
            Double imposto = getPreco() * 0.10;
            System.out.println("R$ " + imposto + " de impostos sobre o livro " + getNome() + ".");
            return 0d;
        }
    }
}
