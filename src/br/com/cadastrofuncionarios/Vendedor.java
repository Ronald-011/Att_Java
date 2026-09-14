package br.com.cadastrofuncionarios;

public class Vendedor extends Funcionarios {
        private double comissao;
        private double salarioTotal;


    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    public double CalcularSalario(Funcionarios funcionarios){
        return getSalario() + comissao;
    }



}
