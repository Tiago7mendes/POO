package POO2.aulas.colecoes.mapa;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        // chave (imutavel) -> valor
        Map< String, Double > nota = new HashMap<>();
        
        nota.put("João", 10.0);
        nota.put("Maria", 6.8);
        nota.put("Setti", 7.9);
        
        System.out.println(nota.get("João"));
        
        for (String chave : nota.keySet()) {
            double valor = (double) nota.get(chave);
            System.out.println(chave + " : " + valor);
        }
        
        nota.put("João", 9.0);
        System.out.println(nota);
    }
}
