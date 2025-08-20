package Cap6_Ex2;

public abstract class Conta {
    protected int num;
    private Cliente titular;
    protected double saldo;

    public Conta(int num, Cliente titular, double saldo){
        setNum(num);
        setSaldo(saldo);
        setTitular(titular);
    }

    public Conta(int num, Cliente titular) {
        setNum(num);
        setTitular(titular);
        saldo = 0;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(int num, String nomeTitular, String cpfTitular) {
        setNum(num);
        this.titular = new Cliente(nomeTitular, cpfTitular);
        saldo = 0;
    }

    public Cliente getTitular(){
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
