package exercicio02.br.com.model;

import exercicio02.br.com.interfaces.Imposto;
import jdk.jshell.ImportSnippet;

public abstract class Produto {
    String nome;
    Double preco;
    int qtd;

    public Produto(String nome, Double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
