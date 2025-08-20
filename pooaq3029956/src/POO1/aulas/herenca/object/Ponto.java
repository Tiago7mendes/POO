package aulas.herenca.object; // object é a classe mãe 

/*
Toda classe java herda diretamente ou indiretamente da classe object.

object é superclasse
Ponto é subclasse 

Ponto her os recursos (atributos e metodos) da classe Object

Ponto "é um" (relacionamento) Object
*/

public class Ponto { // está implicito a instrução  "extends object {"
    
    private double x, y;
    
    public Ponto() { // sobrecarga
        setX(0.0);
        setY(0.0);
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
    
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    // sobreescreve o metodo, não tiver nenhum metodo dentro da pasta, aparece erro
    @Override // serve para saber se tem metodo ja escrito dentro de object
    // não pode ter nada novo aqui
    public String toString() { // toString() aparece na Main
        String resultado;
        resultado = "O Ponto é (" + getX() + ", " + getY() + ")";
        
        String aux = super.toString();
        System.out.println( aux );
        
        int indice = aux.lastIndexOf("@") + 1;
        
        String endereco = aux.substring(indice);
                
        resultado += ", e o objeto se encontra na posição de memoria da JVM : " + endereco;
        
        return resultado;
    }
    
    /*public double novoPonto() {
        System.out.println("teste");
    }*/
}
