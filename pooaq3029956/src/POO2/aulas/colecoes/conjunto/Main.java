package POO2.aulas.colecoes.conjunto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Set<String> conjunto = new TreeSet<>(); // conjunto por árvore
        Set<String> conjunto = new HashSet<>(); // conjunto por tabela

        conjunto.add("azul");
        conjunto.add("azul");
        conjunto.add("azul");
        conjunto.add("azul");
        conjunto.add("verde");
        
        System.out.println(conjunto);
            
        
    }
}
