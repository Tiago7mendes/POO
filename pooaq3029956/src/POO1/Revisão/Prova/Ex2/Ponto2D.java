package Revisão.Prova.Ex2;

public class Ponto2D {
    private double x;
    private double y;
    
    public Ponto2D(double x, double y) {
        setX(x);
        setY(y);
    }

    private Ponto2D() {
        this(0.0 , 0.0);
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

    public double distP(Ponto2D ponto){
        double dist;
        
        double dX = Math.pow(ponto.getX() - getX(), 2 );
        double dY = (ponto.getY() - getY()); // outro jeito de fazer, mais simples
        
        dY *= dY;
        
        dist = Math.sqrt(dX + dY);
        
        return dist;
    }
    
    public Ponto2D getPontoMedio(Ponto2D ponto) {
        
        Ponto2D pontoMedio = new Ponto2D();
        
        pontoMedio.setX( ( ponto.getX() + getX() ) / 2.0);
        pontoMedio.setY( ( ponto.getY() + getY() ) / 2.0);
        
        return pontoMedio;
    }
    
}
