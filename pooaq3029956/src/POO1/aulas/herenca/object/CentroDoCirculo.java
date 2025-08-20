package aulas.herenca.object;

public class CentroDoCirculo extends Ponto {
    
/*
    CenterDoCirculo "é um" (relacionamento) Ponto
*/ 
    
    public CentroDoCirculo() {
        // nao precisa chamar nada aq pq esta vazio
        // chama implictamente o construtor sem paremetros da superclasse Ponto
    }
    
    public CentroDoCirculo(double x, double y) {
        super(x, y); // é a primeira coisa que precisa chamar 
        System.out.println("CentroDoCirculo");
    }
    
    @Override
    public String toString() {
        String resultado;
        
        System.out.println( super.toString() ); 
        
        resultado = "O centro do circulo é (" + getX() + ", " + getY() + " )";
        
        return resultado;
    }
}
