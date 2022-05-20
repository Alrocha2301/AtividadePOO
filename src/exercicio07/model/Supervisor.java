package exercicio07.model;

public class Supervisor extends Funcionario{
    public Supervisor(String nome, int idade, Double salario) {
        super(nome, idade, salario);
    }

    public Double bonificacao(){
        return salario + 5000;
    }
}
