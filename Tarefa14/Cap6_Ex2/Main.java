package Cap6_Ex2;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("João", "12345678901");
        Poupanca poupanca = new Poupanca(1, cliente, 1000.0);

        System.out.println(poupanca);
        poupanca.reajustar(5);
        System.out.println(poupanca);
    }
}

