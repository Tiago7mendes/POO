package ex2_26;

public class Linha2D {
    private Ponto2D ponto1;
    private Ponto2D ponto2;

    public Linha2D (Ponto2D p1, Ponto2D p2) {
        ponto1 = p1;
        ponto2 = p2;
    }

    public Ponto2D getPonto1() {
        return ponto1;
    }

    public Ponto2D getPonto2() {
        return ponto2;
    }
    public void setPonto1(Ponto2D ponto1) {
        this.ponto1 = ponto1;
    }
    public void setPonto2(Ponto2D ponto2) {
        this.ponto2 = ponto2;
    }

    public void calcularLinha() {
        double eqY1, eqY2, eqResto1, eqResto2, eqY, eqResto;
        eqY1 = ponto1.getY();
        eqY2 = ponto2.getY();

        eqResto1 = ponto1.getX();
        eqResto2 = ponto2.getX();

        double bla = eqResto1;

        eqY1 *= eqResto2;
        eqY2 *= eqResto1;
        eqResto1 *= eqResto2;
        eqResto2 *= bla;

        eqY = eqY1 - eqY2;
        eqResto = eqResto1 + ponto2.getX() - eqResto2 - ponto1.getX();

        double b = eqY / eqResto;

        double a = (ponto1.getY() - b) / ponto1.getX();

        System.out.printf("A equacao da reta ficou y = %fx + %f", a, b);
    }
}
