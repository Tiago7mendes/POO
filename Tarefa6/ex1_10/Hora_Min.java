package ex1_10;

public class Hora_Min {
    
    private int min;
    private int hora;

    public Hora_Min(int m, int h) {
        min = m;
        hora = h;
        validoHoraMin();
    }

    public int getHora() {
        if (validoHoraMin()) {
            return hora;
        } else {
            return -1;
        }
    }

    public int getMin() {
        if (validoHoraMin()) {
            return min; 
        } else {
            return -1;
        }
    }

    private boolean validoHoraMin() {
        if (min >= 0 && min < 60 && hora >= 0 && hora < 24) {
            return true;
        } else {
            return false;
        }
    }

    public void setMin(int m) {
        min = m;
        validoHoraMin();
    }

    public void setHora(int h) {
        hora = h;
        validoHoraMin();
    }
}
