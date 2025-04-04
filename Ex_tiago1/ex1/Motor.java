package ex1;

public class Motor{
    private String tipo;
    private int potencia;

    public Motor(String t, int p){
        tipo = t;
        potencia = p;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        tipo = t;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int p) {
        potencia = p;
    }

    public void exibirInfo(){
        System.out.println("O tipo do motor é: " + tipo);
        System.out.println("A potencia do motor é: " + potencia + " hp");
    }
}
