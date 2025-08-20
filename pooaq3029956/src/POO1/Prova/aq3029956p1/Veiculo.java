package aq3029956p1;

public class Veiculo {
    private String nome;
    private int ano;
    private String placa;
    private boolean pequeno;
    
    public Veiculo(String n, int a, String plc, boolean pqn){
        nome = n;
        setAno(a);
        placa = plc;
        pequeno = pqn;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public String getPlaca() {
        return placa;
    }

    public boolean isPequeno() {
        return pequeno;
    }

    private void setNome(String n) {
        nome = n;
    }

    private void setAno(int a) {
        if (a >= 0){
           ano = a; 
        }
        else{
            ano = 0;
        }
    }

    private void setPlaca(String p) {
        placa = p;
    }

    private void setPequeno(boolean p) {
        pequeno = p;
    }

    public void imprimirDadoVeiculo(){
        System.out.println("O veiculo é um " + nome);
        System.out.println("O ano do veiculo é " + ano);
        System.out.println("A placa do veiculo é " + placa);
        System.out.println(" ");
    }
    
    
}
