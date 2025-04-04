package ex9_15;

public class Retangulo implements ObjetoGeometrico {
    private Ponto2D primeiroCanto, segundoCanto;

    public Retangulo(Ponto2D primeiroCanto, Ponto2D segundoCanto) {
        setPrimeiroCanto(primeiroCanto);
        setSegundoCanto(segundoCanto);
    }

    public Ponto2D getPrimeiroCanto() {
        return primeiroCanto;
    }

    public Ponto2D getSegundoCanto() {
        return segundoCanto;
    }

    public void setPrimeiroCanto(Ponto2D primeiroCanto) {
        this.primeiroCanto = primeiroCanto;
    }

    public void setSegundoCanto(Ponto2D segundoCanto) {
        this.segundoCanto = segundoCanto;
    }

    @Override
    public Ponto2D centro() {
        double centroX = (primeiroCanto.getX() + segundoCanto.getX()) / 2.0;
        double centroY = (primeiroCanto.getY() + segundoCanto.getY()) / 2.0;
        return new Ponto2D(centroX, centroY);
    }

    @Override
    public double calculaArea() {
        double ladoX = Math.abs(primeiroCanto.getX() - segundoCanto.getX());
        double ladoY = Math.abs(primeiroCanto.getY() - segundoCanto.getY());
        return ladoX * ladoY;
    }

    @Override
    public double calculaPerimetro() {
        double ladoX = Math.abs(primeiroCanto.getX() - segundoCanto.getX());
        double ladoY = Math.abs(primeiroCanto.getY() - segundoCanto.getY());
        return 2 * (ladoX + ladoY);
    }

    @Override
    public String toString() {
        return "Retângulo com cantos " + primeiroCanto + " e " + segundoCanto;
    }
}
