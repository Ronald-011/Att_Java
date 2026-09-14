package br.com.treinamento.conversor;

public class ConversorMoedas implements ConversaoFinanceira {

    private double valorEmDolar;
    private String nome;

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getValorEmDolar() {
        return valorEmDolar;
    }

    public void setValorEmDolar(double valorEmDolar) {
        this.valorEmDolar = valorEmDolar;
    }

    private double resultado;


    @Override
    public double getConverterDolarParaReal() {
        return this.valorEmDolar / 5.12;

    }
}
