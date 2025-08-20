package aulas.classe.metodos.predicados;

public class Ponto {
    private double x, y;
    private boolean xPositivo, yPositivo;

    public Ponto(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean isxPositivo() {
        return xPositivo;
    } // método predicato, não usa "get", usa "is"

    public boolean isyPositivo() {
        return yPositivo;
    } // método predicato, não usa "get", usa "is"

    public void setX(double x) {
        this.x = x;
        
        if (x >= 0){
            setxPositivo( true );
        } else{
            setxPositivo ( false );
        }
    }

    public void setY(double y) {
        this.y = y;
        setyPositivo( y >= 0);
    }

    private void setxPositivo(boolean xPositivo) {
        this.xPositivo = xPositivo;
    }

    private void setyPositivo(boolean yPositivo) {
        this.yPositivo = yPositivo;
    }
    
}
