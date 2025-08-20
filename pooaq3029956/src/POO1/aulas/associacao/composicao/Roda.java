package aulas.associacao.composicao;
 
public class Roda {
    
    private boolean girando;
    
    // construtor
    public Roda() {
        girando = false;
    }
    
    // metodos 
    public boolean estaGirando() {
        return girando;
    }
    
    public void setGirando(boolean g) {
        girando = g;
    }
    
    
}
