package ex1227;

import java.util.ArrayList;

public class MaquinaDeKaraoke {

    private ArrayList<String> fila;

    public MaquinaDeKaraoke() {
        fila = new ArrayList<>();
    }

    public void adicionarMusica(String musica) {
        fila.add(musica);
    }

    public void adia(String musica) {
        int posicao = fila.indexOf(musica);

        if (posicao != -1 && posicao < fila.size() - 1) {
            String proxima = fila.get(posicao + 1);
            fila.set(posicao, proxima);
            fila.set(posicao + 1, musica);
        }
    }

    public void adianta(String musica) {
        int posicao = fila.indexOf(musica);

        if (posicao > 0) {
            String anterior = fila.get(posicao - 1);
            fila.set(posicao, anterior);
            fila.set(posicao - 1, musica);
        }
    }

    public void exibirFila() {
        System.out.println("Fila de músicas: " + fila);
    }
}
