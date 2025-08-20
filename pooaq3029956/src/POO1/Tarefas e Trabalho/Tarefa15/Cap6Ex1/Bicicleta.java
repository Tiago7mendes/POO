public class Bicicleta extends Veiculo {

    @Override
    public void listarVerificacoes() {
        System.out.println("Verificações da bicicleta: Verificar pneus, ajustar freios, lubrificar corrente.");
    }

    @Override
    public void ajustar() {
        System.out.println("Ajustando a bicicleta: Ajustando altura do banco e guidão.");
    }

    @Override
    public void limpar() {
        System.out.println("Limpando a bicicleta: Limpando a estrutura e a corrente.");
    }
}
