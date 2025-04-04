package ex1216;

import java.util.ArrayList;

public class ListaDePalavras {

    private ArrayList<String> lista;

    public ListaDePalavras() {
        lista = new ArrayList<>();
    }

    public void adicionar(String palavra) {
        lista.add(palavra); 
    }

    public boolean remove(String palavra) {
        return lista.remove(palavra); 
    }

    @Override
    public String toString() {
        String resultado = "";

        for (String str : lista) {
            resultado += str + " ";
        }

        return resultado.trim();
    }

    public int tamanho() {
        return lista.size();
    }
}
