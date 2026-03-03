package exercicio01;

public class Produto {
    String nome;
    double valor;
    int quantidade;

    public Produto(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public void aumentarValor(double porcentagem) {
        this.valor *= (1 + porcentagem / 100);
    }

}
