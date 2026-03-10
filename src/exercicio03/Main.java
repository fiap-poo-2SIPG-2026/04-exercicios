package exercicio03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static BilheteUnico bilhete;

    static {
        System.out.print("Nome do usuário --> ");
        String nome = sc.nextLine();
        System.out.print("Tipo de tarifa (Professor ou Estudante ou Normal) --> ");
        String tipoTarifa = sc.next();
        bilhete = new BilheteUnico(nome, tipoTarifa);
    }

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("*************************");
            System.out.println("1. Carregar bilhete");
            System.out.println("2. Consultar saldo");
            System.out.println("3. Passar na catraca");
            System.out.println("4. Finalizar");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1 -> carregarBilhete();
                case 2 -> consultarSaldo();
                case 3 -> passarNaCatraca();
                case 4 -> System.out.println("Obrigado por usar o nosso App");
                default -> System.out.println("Opção inválida");
            }

        } while(opcao != 4);

    }

    private static void passarNaCatraca() {
        if(!bilhete.passarNaCatraca()) {
            System.out.println("Saldo insuficiente");
        }
        consultarSaldo();
    }

    private static void consultarSaldo() {
        System.out.println("Saldo atual R$ " + bilhete.saldo);
    }

    private static void carregarBilhete() {
        double valor;
        System.out.print("Valor para carregar o bilhete --> R$ ");
        valor = sc.nextDouble();
        bilhete.carregar(valor);
    }
}
