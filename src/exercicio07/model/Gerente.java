package exercicio07.model;

public class Gerente extends Funcionario{
    public Gerente(String nome, int idade, Double salario) {
        super(nome, idade, salario);
    }

    public Double bonificacao(){
        return salario + 10000;
    }
}
