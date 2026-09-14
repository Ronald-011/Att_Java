package br.com.cadastrofuncionarios;

public class Gerente extends Funcionarios {

    private double bonificacao;
    private double salarioTotal;

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    public double CalcularSalario(Funcionarios funcionarios){
        return getSalario() + bonificacao;
    }


}
