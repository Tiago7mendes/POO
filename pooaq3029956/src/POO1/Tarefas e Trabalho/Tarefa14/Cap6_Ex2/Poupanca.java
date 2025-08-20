package Cap6_Ex2;

public class Poupanca extends Conta implements Investimento {

    public Poupanca(int num, Cliente titular, double saldo) {
        super(num, titular, saldo);
    }

    public Poupanca(int num, Cliente titular) {
        super(num, titular);
    }

    public Poupanca(int num, String nomeTitular, String cpfTitular) {
        super(num, nomeTitular, cpfTitular);
    }
    
    @Override
    public void reajustar(double taxa) {
        if (taxa > 0) {
            saldo += saldo * (taxa / 100);
        } else {
            System.out.println("A taxa de reajuste deve ser positiva.");
        }
    }

    @Override
    public String toString() {
        return "Poupança [Número: " + num + ", Titular: " + getTitular().getNome() + 
               ", Saldo: R$ " + saldo + "]";
    }
}

