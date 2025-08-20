package aulas.variavel.composta;

public class Ponto {
    
    private double x, y;

    public Ponto(double x, double y) {
        setX(x);
        setY(y);
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override // atalho ctrl mais barra de espaço
    public String toString() { // objeto foi transformado em string, pois toda classe java recebe a classe object
        return super.toString() +  "\n(" + getX() + " , " + getY() + ")";
    }
    
    
}
