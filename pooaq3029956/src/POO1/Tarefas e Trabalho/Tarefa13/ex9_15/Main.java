package ex9_15;

public class Main {
    public static void main(String[] args) {
        Ponto2D cantoInferior = new Ponto2D(1, 1);
        Quadrado quadrado = new Quadrado(cantoInferior, 5);

        System.out.println(quadrado); 
        System.out.println("Centro: " + quadrado.centro());
        System.out.println("Área: " + quadrado.calculaArea());
        System.out.println("Perímetro: " + quadrado.calculaPerimetro());
    }
}
