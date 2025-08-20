package ex2_29;

public class Conta {
    private int pessoas;
    private double contaSimples;
    private double total;

    public Conta (int p, double c) {
        pessoas = p;
        contaSimples = c;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public double getContaSimples() {
        return contaSimples;
    }

    public void setContaSimples(double contaSimples) {
        this.contaSimples = contaSimples;
    }

    public void contaSimplificada() {
        total = contaSimples / pessoas;
        System.out.printf("O total para cada pessoa pagar é: %f", total);
    }
}
