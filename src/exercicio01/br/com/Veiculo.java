package exercicio01.br.com;

import javax.sound.midi.Soundbank;

public class Veiculo {
    String marca;
    String modelo;
    String placa;
    String cor;
    float km;
    boolean isLigado;
    int litrosCombustivel;
    public int velocidade;
    Double preco;

    /*public exercicio01.br.com.Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado, int litrosCombustivel, int velocidade, Double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.km = km;
        this.isLigado = isLigado;
        this.litrosCombustivel = litrosCombustivel;
        this.velocidade = velocidade;
        this.preco = preco;
    }*/

    public Veiculo() {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void acelerar() {
        this.setVelocidade(getVelocidade() + 20);
    }

    public void abastecer(int combustivel) {
        if (getLitrosCombustivel() + combustivel < 60) {
            this.setLitrosCombustivel(getLitrosCombustivel() + combustivel);
        } else {
            System.out.println("Só couberam " + (60 - getLitrosCombustivel()) + " litros. Sobraram " +
                    (getLitrosCombustivel() + combustivel - 60) + " litros.");
            this.setLitrosCombustivel(60);
        }
    }

    public void frear() {
        if (getVelocidade() > 0 ) {
            this.setVelocidade(getVelocidade() - 20);
            if (getVelocidade() < 0) {
                System.out.println("Carro parou.");
                velocidade = 0;
            }
        } else {
            System.out.println("Carro parado.");
        }
    }

    public void pintar(String cor) {
        this.setCor(cor);
    }

    public void ligar() {
        if (isLigado) {
            System.out.println("O carro está ligado!");
        } else {
            System.out.println("O carro está desligado. Ligando!");
            isLigado = true;
        }
    }

    public void desligar() {
        if (!isLigado) {
            System.out.println("O carro está desligado!");
        } else if (velocidade == 0) {
            System.out.println("O carro está parado e ligado!");
            isLigado = false;
        } else {
            System.out.println("O carro está em movimento.");
        }
    }




}
