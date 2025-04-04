package ex2_9;

public class Lampada {
    
    private int energia; 

    public boolean eEconomica() {
        if (energia > 40) {
            return false;
        } 
        else{
            return true;
        }
    }

    public void setEnergia(int valorEnergia) {
        energia = valorEnergia;  
    }

    public int getEnergia() {
        return energia;
    }
}
