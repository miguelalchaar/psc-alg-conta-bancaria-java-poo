import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do titular: ");
        String nome = sc.next();

        System.out.print("Digite o número da conta: ");
        String numeroConta = sc.next();

        System.out.print("Digite o saldo inicial: R$");
        double saldoInicial = sc.nextDouble();

        ContaBancaria conta = new ContaBancaria(nome, numeroConta, saldoInicial);

        System.out.println(">>>>> Conta bancária criada com sucesso. <<<<<\n");

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("0 - Sair");
            System.out.print("\nOpção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDeposito = sc.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 2:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaque = sc.nextDouble();
                    conta.sacar(valorSaque);
                    break;

                case 3:
                    conta.consultarSaldo();
                    break;

                case 0:
                    System.out.println("\n>>>>> Programa Encerrado. <<<<<");
                    break;

                default:
                    System.out.println("Opção inválida - Tente Novamente");
            }
        } while (opcao != 0);

        sc.close();
    }
}
