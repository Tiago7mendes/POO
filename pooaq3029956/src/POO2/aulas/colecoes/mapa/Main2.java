package POO2.aulas.colecoes.mapa;

import POO2.aulas.colecoes.Pessoa;
import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        Map<String, Pessoa> funcionarios = new HashMap<>();
        
        funcionarios.put("12345678912", new Pessoa("João", 21));
        funcionarios.put("12345678912", new Pessoa("Pedro", 17));
        funcionarios.put("12345678912", new Pessoa("Maria", 32));
    }
}
