package aulas.classe.modificadores.constante;

public class Ponto {
    // a contante precisa ser definada na criacao do objeto
    
    private final String NOME; // campo constante
    private double x,y; // campo variavel (a propria variavel)
    
    public Ponto(double x, double y, String nome){
        setX(x);
        setY(y);
        this.NOME = nome;
    }

    public String getNOME() {
        return NOME;
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
