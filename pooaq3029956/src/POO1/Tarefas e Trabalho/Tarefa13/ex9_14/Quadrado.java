package ex9_14;

public class Quadrado implements ObjetoGeometrico {
    private Ponto2D cantoInferiorEsquerdo;
    private double lado;

    public Quadrado(Ponto2D cantoInferiorEsquerdo, double lado) {
        setCantoInferiorEsquerdo(cantoInferiorEsquerdo);
        setLado(lado);
    }

    public Ponto2D getCantoInferiorEsquerdo() {
        return cantoInferiorEsquerdo;
    }

    public double getLado() {
        return lado;
    }

    public void setCantoInferiorEsquerdo(Ponto2D cantoInferiorEsquerdo) {
        this.cantoInferiorEsquerdo = cantoInferiorEsquerdo;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public Ponto2D centro() {
        double centroX = cantoInferiorEsquerdo.getX() + lado / 2.0;
        double centroY = cantoInferiorEsquerdo.getY() + lado / 2.0;
        return new Ponto2D(centroX, centroY);
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }

    @Override
    public double calculaPerimetro() {
        return 4 * lado;
    }

    @Override
    public String toString() {
        return "Quadrado com canto inferior esquerdo em " + cantoInferiorEsquerdo + 
               " e lado de comprimento " + lado;
    }
}
