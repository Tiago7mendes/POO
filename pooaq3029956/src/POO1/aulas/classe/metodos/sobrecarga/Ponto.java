package aulas.classe.metodos.sobrecarga;

public class Ponto {
    private double x, y;
    private boolean xPositivo, yPositivo;
    
    //exemplos de sobrecarga de construtor
    public Ponto(String coordenada, double v){
        if (coordenada.equals("x") ){
            setX(v);
            setY(0.0);
        }else {
            if(coordenada.equals("y") ){
                setX(0.0);
                setY(v);
            } else{
                setX(0.0);
                setY(0.0);
            }
        }
    }
    
    public Ponto() { // sobrecarga do construtor
        /*setX(0.0);
        setY(0.0);*/
        this(0.0, 0.0); // irá chamar o construtor assinado com dois paramentros double
        // isso demostra que o construtor principal é o outro
        // mas isso só é possivel pois ambos construtores tem o double double
    }

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
    } 

    public boolean isyPositivo() {
        return yPositivo;
    } 

    public void setX(double x) {
        this.x = x;
        
        if (x >= 0){
            setxPositivo( true );
        } else{
            setxPositivo ( false );
        }
    }
    
    public void setX(){
        setX(0.0);
    }

    public void setY(double y) {
        this.y = y;
        setyPositivo( y >= 0);
    }
    
    public void setY(){
        setY(0.0);
    }

    private void setxPositivo(boolean xPositivo) {
        this.xPositivo = xPositivo;
    }

    private void setyPositivo(boolean yPositivo) {
        this.yPositivo = yPositivo;
    }
    
}
