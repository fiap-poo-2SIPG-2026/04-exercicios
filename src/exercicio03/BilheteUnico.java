package exercicio03;

import java.util.Random;

public class BilheteUnico {
    int numero;
    String usuario;
    double saldo;
    String tipoTarifa;
    final static double TARIFABASE = 5.40;

    public BilheteUnico(String usuario, String tipoTarifa) {
        Random random = new Random();
        this.usuario = usuario;
        this.tipoTarifa = tipoTarifa;
        this.numero = random.nextInt(1000, 9999);
    }

    public void passarNaCatraca() {
        double valor = TARIFABASE;
        if(tipoTarifa.equalsIgnoreCase("estudante") ||
                tipoTarifa.equalsIgnoreCase("professor")) {
            valor = valor / 2;
        }

        if(saldo < valor) {
            return;
        }

        saldo = saldo - valor;

    }

}
