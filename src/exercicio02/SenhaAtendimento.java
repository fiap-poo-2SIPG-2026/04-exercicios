package exercicio02;

public class SenhaAtendimento {
    String paciente;
    int senha;
    static int controle = 100;

    public SenhaAtendimento(String paciente) {
        this.paciente = paciente;
        this.senha = controle++;
    }

    public String getDados() {
        return "Paciente: " + paciente + " | Senha # " + senha;
    }

}
