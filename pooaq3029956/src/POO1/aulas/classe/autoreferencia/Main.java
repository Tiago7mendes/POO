package aulas.classe.autoreferencia;

public class Main {
    public static void main(String[] args) {
        Ponto p = new Ponto();
        
        p.setX(12.0);
        p.setY(4.0);
        
        p.imprimirA(5.0, 5.0);
        p.imprimirB(0, 0);
    }
}
