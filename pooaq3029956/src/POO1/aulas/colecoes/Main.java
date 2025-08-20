package aulas.colecoes;

import java.util.ArrayList;
import aulas.variavel.composta.Ponto;

public class Main {
    public static void main(String[] args) {
        
        ArrayList lista = new ArrayList(); // esta implicito o uso do genérico Object (linha 10)
//      ArrayList<Object> lista = new ArrayList(); 
//        ArrayList<Ponto> pontos = new ArrayList<>();
        lista.add(3);
        lista.add(5);
        lista.add(3);
        lista.add(1);
        lista.add(2);
        lista.add(-1);

        System.out.println(lista.get(2));
        
        System.out.println(lista.contains(51));
        System.out.println(lista.contains(2));
        
        System.out.println(lista.size());
        
        System.out.println("---");
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        System.out.println("---");
        
        lista.set(1, 33);
        System.out.println(lista.get(1));
        
        lista.remove(2);
        
        System.out.println("---");
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        int k = lista.indexOf(-1);
        lista.remove(k); // retorna um valor do tipo boolan
        
        System.out.println("---");
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        System.out.println("---");
        ArrayList<Ponto> pontos = new ArrayList<>();    // importante
        
        pontos.add( new Ponto(5.0, 16.7));
        pontos.add( new Ponto(3.9, 4.9));
        pontos.add( new Ponto(4.1, 17.2));
        
        for(int i = 0; i < pontos.size(); i++) {
            System.out.println(pontos.get(i));
        }
    }
}
