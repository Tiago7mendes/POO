package Lampada;
public class Lampada_main {
    public static void main(String[] args) {
        
        Lampada l = new Lampada(true);
        Lampada l2 = new Lampada();
        Lampada l3 = new Lampada(45);

        l.estadoLampada();
        l2.numeroWatts();
        l3.numeroWatts();
    }
}
