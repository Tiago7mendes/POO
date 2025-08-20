package ex8_8;

public class Lampada {
    
    private boolean florescente; 

    public Lampada(boolean florescente){
        setEnergia(florescente);
    }

    public void setEnergia(boolean valorEnergia) {
        florescente = valorEnergia;  
    }

    public boolean getEnergia() {
        return florescente;
    }
}
