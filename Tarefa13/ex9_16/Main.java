package ex9_16;

public class Main {
    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D(3,5);
        Ponto2D p2 = new Ponto2D(6,5);
        Ponto2D p3 = new Ponto2D(1,10);
        Ponto2D p4 = new Ponto2D(8,10);

        Trapezio q1 = new Trapezio(p1, p2, p3, p4);

        System.out.println(q1.calculaArea());
        System.out.println(q1.calculaPerimetro());
        System.out.println(q1.centro());

        System.out.println(q1);
    }
}
