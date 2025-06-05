import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Peter Parker";
        String tipoDeConta = "Corrente";
        double saldo = 2500;
        int opcao = 0;

        System.out.println("---------------------");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Total de saldo: " + saldo);
        System.out.println("\n---------------------");

        String menu = """
                Menu de Opções:
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é de " + saldo);
            } else if (opcao == 2){
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
            if (valor > saldo ) {
                System.out.println("Não há saldo suficiente");
            } else {
                saldo -= valor;
                System.out.println("Novo saldo: " + saldo);
            }
            } else if (opcao == 3) {
                System.out.println("valor recebido:");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida, escolha entre 1 à 4");
            }
        }
    }
}
