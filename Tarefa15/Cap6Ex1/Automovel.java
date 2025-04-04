public class Automovel extends Veiculo {

    @Override
    public void listarVerificacoes() {
        System.out.println("Verificações do automóvel: Verificar nível de óleo, calibrar pneus, verificar sistema elétrico.");
    }

    @Override
    public void ajustar() {
        System.out.println("Ajustando o automóvel: Ajustando os espelhos e alinhamento das rodas.");
    }

    @Override
    public void limpar() {
        System.out.println("Limpando o automóvel: Lavando o exterior e limpando o interior.");
    }

    public void mudarOleo() {
        System.out.println("Mudando o óleo do automóvel: Substituindo o óleo do motor.");
    }
}
