package exercicio02;

public class Main {
    public static void main(String[] args) {
        SenhaAtendimento s1 = new SenhaAtendimento("Ana");
        SenhaAtendimento s2 = new SenhaAtendimento("João");
        SenhaAtendimento s3 = new SenhaAtendimento("Maria");

        System.out.println(s1.getDados());
        System.out.println(s2.getDados());
        System.out.println(s3.getDados());

        System.out.println("Próxima senha disponível --> " + SenhaAtendimento.controle);

    }
}
