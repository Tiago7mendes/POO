package Lampada;
public class Lampada{
    private boolean lampada;
    private float watts;

    public Lampada(boolean lampada) {
        setLampada(lampada);
    }

    public Lampada(float watts) {
        setWatts(watts);
    }

    public Lampada() {
        watts = 60;
    }

    public boolean getLampada() {
        return lampada;
    }

    public float getWatts() {
        return watts;
    }

    private void setLampada(boolean l) {
        if (l == true || l == false) {
            lampada = l;
        }
        else{
            lampada = false;
        }
    }

    private void setWatts(float w) {
        if (w > 0) {
            watts = w;
        }
        else{
            watts = 0;
        }
    }

    public void estadoLampada() {
        if(lampada == true) {
            System.out.println("A lampada esta ligada");
        }
        else{
            System.out.println("A lampada esta desligada");
        }
    }

    public void numeroWatts() {
        System.out.println("Essa lampada tem" + watts + " watts");
    }
}