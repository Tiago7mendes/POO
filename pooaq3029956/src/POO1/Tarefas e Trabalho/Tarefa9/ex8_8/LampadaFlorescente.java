package ex8_8;

public class LampadaFlorescente extends Lampada {
    
    private int tamanho;

    public LampadaFlorescente(int t) {
        super(true);
        setTamanho(t);
    }

    public void setTamanho(int t){
        if(t > 0){
            tamanho = t;
        }
        else{
            tamanho = 0;
        }
    }

    public int getTamanho() {
        return tamanho;
    }
}
