package Linha;

public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
                        
    public double getY() {
        return y;
    }

    private void setX(double x) {
        this.x = x;
    }

    private void setY(double y) {
        this.y = y;
    }
}
