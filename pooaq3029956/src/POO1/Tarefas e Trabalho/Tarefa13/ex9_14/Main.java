package ex9_14;

public class Main {
    public static void main(String[] args) {
        Ponto2D cantoInferior = new Ponto2D(0, 0);
        Quadrado quadrado = new Quadrado(cantoInferior, 4);

        System.out.println(quadrado); 
        System.out.println("Centro: " + quadrado.centro());
        System.out.println("Área: " + quadrado.calculaArea());
        System.out.println("Perímetro: " + quadrado.calculaPerimetro());
    }
}
