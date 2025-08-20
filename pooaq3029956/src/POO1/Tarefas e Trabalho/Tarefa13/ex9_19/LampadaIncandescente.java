package ex9_19;

public class LampadaIncandescente implements Lampada {
    private boolean acesa;

    @Override
    public void acende() {
        acesa = true;
    }

    @Override
    public void apaga() {
        acesa = false;
    }

    @Override
    public void mostraEstado() {
        if (acesa) {
            System.out.println("A lâmpada incandescente está acesa.");
        } else {
            System.out.println("A lâmpada incandescente está apagada.");
        }
    }
}
