package exercicio07.model;

public class Vendedor extends Funcionario{
    public Vendedor(String nome, int idade, Double salario) {
        super(nome, idade, salario);
    }

    public Double bonificacao(){
        return salario + 3000;
    }
}
