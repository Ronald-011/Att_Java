import br.com.cadastrofuncionarios.Funcionarios;
import br.com.cadastrofuncionarios.Gerente;
import br.com.cadastrofuncionarios.Vendedor;
import br.com.treinamento.conversor.ConversorMoedas;
import br.com.treinamento.conversor.ConversaoFinanceira;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

        static void main(String[] args){

            ConversorMoedas converter = new ConversorMoedas();
            converter.setValorEmDolar(5.12);
            System.out.println("O valor convertido para real é: R$" + converter.getConverterDolarParaReal() );

            // consultando os funcionarios comuns
            Funcionarios func = new Funcionarios();
            func.setNome("Jean Almeida");
            func.setIdade(30);
            func.setSalario(1699.00);
            System.out.println("===============================\n" + "O nome do Funcionario é: " + func.getNome() + "\ntem " + func.getIdade()
                    + " anos de idade\nseu seu salário é de R$" + func.getSalario());

            // consultando o gerente
            Gerente ger = new Gerente();
            ger.setNome("Vitor Hugo");
            ger.setIdade(48);
            ger.setSalario(7000);
            ger.setBonificacao(1560);
            ger.CalcularSalario(ger);
            System.out.println("===============================\n" + "O nome do Funcionario é: " + ger.getNome() + "\ntem " + ger.getIdade()
                    + " anos de idade\nseu seu salário é de R$" + ger.getSalario());

            // consultando o Vendedor
            Vendedor vendedor = new Vendedor();
            vendedor.setNome("Alex Campos");
            vendedor.setIdade(35);
            vendedor.setSalario(4750);
            vendedor.setComissao(750);
            vendedor.CalcularSalario(vendedor);
            System.out.println( "===============================\n" + "O nome do Funcionario é: " + vendedor.getNome() + "\ntem " + vendedor.getIdade()
                    + " anos de idade \nseu salário é de R$" + vendedor.getSalario());



            // criando arraylist
            ArrayList<Funcionarios> funcionarios = new ArrayList<>();

            Funcionarios func2 = new Funcionarios();
            funcionarios.add(func2);
            func2.setNome("Armando Lima");
            func2.setIdade(33);
            func2.setSalario(1999.00);



            Vendedor vendedor2 = new Vendedor();
            funcionarios.add(vendedor2);
            vendedor2.setNome("Felipe Souza");
            vendedor2.setIdade(26);
            vendedor2.setSalario(4750);
            vendedor2.setComissao(750);

            Gerente ger2 = new Gerente();
            funcionarios.add(ger2);
            ger2.setNome("karina da Silva");
            ger2.setIdade(38);
            ger2.setSalario(7000);
            ger2.setBonificacao(1560);

            for (Funcionarios funcionario : funcionarios) {

                System.out.println( "===============================\n" + "O nome do Funcionario é: " + funcionario.getNome() + "\ntem "
                        + funcionario.getIdade() + " anos de idade \nseu salário é de R$" + funcionario.getSalario());


            }


            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite o nome do funcionario: ");
            String search = leitura.nextLine();


            for (Funcionarios funcionario : funcionarios) {
                if (funcionario.getNome().toLowerCase().contains(search.toLowerCase())) {
                    System.out.println( "===============================\n" + "O nome do Funcionario é: " + funcionario.getNome() + "\ntem "
                            + funcionario.getIdade() + " anos de idade \nseu salário é de R$" + funcionario.getSalario());
                }


            }



        }



}