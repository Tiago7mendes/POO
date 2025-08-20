package aulas.classe.autoreferencia;

public class Ponto {
    
    private double x, y;
    
    public void imprimirA(double x, double y) {
        // parametros ocultam campos de mesmo nome ,ou seja, nao importa se o parametro tem o mesmo nome das variaveis.
        System.out.println("(" + x  + ", " + y + ")");
    }
    
    public void imprimirB(double x, double a) {
        // a variavel local "sombreia" o atributo/campo no escopo do método
        // this vai apontar para a variavel de instancia
        System.out.println("(" + this.x + ", " + y + ")");
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
}
