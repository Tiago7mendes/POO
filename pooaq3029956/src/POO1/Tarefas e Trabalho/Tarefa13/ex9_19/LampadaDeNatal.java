package ex9_19;

public class LampadaDeNatal implements Lampada {
    private boolean acesa;
    private String cor;

    public LampadaDeNatal(String cor) {
        setCor(cor);
        this.acesa = false; 
    }

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
            System.out.println("A lâmpada de Natal está acesa na cor " + cor + ".");
        } else {
            System.out.println("A lâmpada de Natal está apagada.");
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
