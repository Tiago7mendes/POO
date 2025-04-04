package ex9_16;

public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distancia(Ponto2D outro) {
        double deltaX = this.x - outro.getX();
        double deltaY = this.y - outro.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

