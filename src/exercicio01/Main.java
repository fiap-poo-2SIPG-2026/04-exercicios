package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        double valor;
        int quantidade;
        double porcentagem;

        System.out.print("Nome do produto --> ");
        nome = sc.next();
        System.out.print("Valor do produto --> R$ ");
        valor = sc.nextDouble();
        System.out.print("Quantidade inicial em estoque --> ");
        quantidade = sc.nextInt();
        Produto p = new Produto(nome, valor, quantidade);

        // porcentagem para aumentar o valor do produto
        System.out.print("Qual a porcentagem de aumento? ");
        porcentagem = sc.nextDouble();

        p.aumentarValor(porcentagem);
        System.out.println(p.valor);

    }
}
