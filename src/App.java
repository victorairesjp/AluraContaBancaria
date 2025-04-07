
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double saldo = 2500;
        String nome = "Victor Aires";
        String tipoConta = "Corrente";
        int operacao = 0;

        System.out.println("***********************");
        System.out.println(String.format("\nNome: %s", nome));
        System.out.println(String.format("Conta: %s", tipoConta));
        System.out.println(String.format("Saldo: %.2f", saldo));
        System.out.println("\n***********************");

        String menu = """
            ** Escolha uma opção **
            
            1 - Consultar saldo
            2 - Transferir
            3 - Receber
            4 - Sair        

            Digite a operação que deseja realizar: """;

        while (operacao != 4) {
            System.out.println(menu);
            operacao = leitor.nextInt();

            if (operacao == 1) {
                System.out.println(String.format("%s , seu saldo atual é de R$ %.2f\n", nome, saldo));
            } else if (operacao == 2) {
                System.out.println(String.format("Digite o valor que deseja transferir: "));
                double valorTransferir = leitor.nextDouble();
                if (valorTransferir > saldo) {
                    System.out.println(String.format("Saldo insuficiente\n"));
                } else {
                    saldo -= valorTransferir;
                    System.out.println(String.format("Valor transferido com sucesso. Saldo atual: R$ %.2f\n", saldo));
                }
            } else if (operacao == 3) {
                System.out.println(String.format("Digite o valor a receber: "));
                double valorReceber = leitor.nextDouble();
                saldo += valorReceber;
                System.out.println(String.format("Valor adicionado à conta. Saldo atual: R$ %.2f\n", saldo));
            } else {
                System.out.println(String.format("Operação Inválida.\n"));
            }
        }
    }
}
