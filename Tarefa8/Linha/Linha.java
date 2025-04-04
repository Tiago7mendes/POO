package Linha;

public class Linha {
    private Ponto2D pont1;
    private Ponto2D pont2;

    public Linha() {
        pont1 = new Ponto2D(0, 0);
        pont2 = new Ponto2D(0, 0);
    }

    public Linha(Ponto2D p) {
        pont1 = new Ponto2D(0, 0);
        pont2 = p;
    }

    public Linha(Ponto2D p1, Ponto2D p2) {
        pont1 = p1;
        pont2 = p2;
    }

    public Linha(double x1, double x2, double y1, double y2) {
        pont1 = new Ponto2D(x1, y1);
        pont2 = new Ponto2D(x2, y2);
    }

    public void calcularLinha() {
        double eqY1, eqY2, eqResto1, eqResto2, eqY, eqResto;
        eqY1 = pont1.getY();
        eqY2 = pont2.getY();

        eqResto1 = pont1.getX();
        eqResto2 = pont2.getX();

        double bla = eqResto1;

        eqY1 *= eqResto2;
        eqY2 *= eqResto1;
        eqResto1 *= eqResto2;
        eqResto2 *= bla;

        eqY = eqY1 - eqY2;
        eqResto = eqResto1 + pont2.getX() - eqResto2 - pont1.getX();

        double b = eqY / eqResto;

        double a = (pont1.getY() - b) / pont1.getX();

        System.out.printf("A equacao da reta ficou y = %fx + %f", a, b);
    }
}
