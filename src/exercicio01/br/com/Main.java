package exercicio01.br.com;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo();
        carro.marca = "Ford";
        carro.modelo = "Fiesta";
        carro.placa = "AAA1111";
        carro.cor = "Prata";
        carro.km = 1892.85f;
        carro.isLigado = false;
        carro.litrosCombustivel = 48;
        carro.velocidade = 0;
        carro.preco = 17000d;


        //Método acelerar()
        carro.acelerar();
        System.out.println("Velocidade após acelerar : " + carro.velocidade + " km/h");

        //Método abastecer()
        carro.abastecer(15);
        System.out.println("Quantidade de litros no tanque: " + carro.litrosCombustivel);

        //Método frear()
        carro.frear();
        System.out.println("Velocidade após frear : " + carro.velocidade + " km/h");

        //Método Pintar
        carro.pintar("Preto");
        System.out.println("Nova cor do carro: " + carro.cor);

        //método ligar
        carro.ligar();
        carro.ligar();

        //método desligar()
        carro.desligar();
        carro.desligar();
    }
}
