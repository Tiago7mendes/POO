public class Main {
    public static void main(String[] args) {
        Veiculo bicicleta = new Bicicleta();
        System.out.println("Operações com a bicicleta:");
        bicicleta.listarVerificacoes();
        bicicleta.ajustar();
        bicicleta.limpar();

        Automovel automovel = new Automovel();
        System.out.println("\nOperações com o automóvel:");
        automovel.listarVerificacoes();
        automovel.ajustar();
        automovel.limpar();
        automovel.mudarOleo();
    }
}
