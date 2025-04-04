package ex2_28;

public class Lampada {
    private int contadorAcesa = 0;

    public void acender() {
        contadorAcesa++; 
        quantasVezesLigada();
    }

    public int getContadorAcesa() {
        return contadorAcesa; 
    }

    private void quantasVezesLigada() {
        System.out.printf("A lâmpada foi ligada %d vezes%n", contadorAcesa);
    }
}
