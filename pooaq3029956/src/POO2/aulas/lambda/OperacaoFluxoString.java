package POO2.aulas.lambda;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class OperacaoFluxoString {
    public static void main(String[] args) {
        String strings[] = {"VERMELHO", "laranja", "Amarelo", "verde", "azul", "VIOLETA"}; 
        
        Arrays.stream(strings).map((s) -> s.toUpperCase()).sorted().forEach( (s) -> System.out.println(s + " "));
        System.out.println();
        
        List<String> cores = Arrays.stream(strings)
               .filter( (s) -> s.compareToIgnoreCase("m") < 0) 
               .map((s) -> s.toUpperCase())
               .sorted()
               .collect(Collectors.toList());
        System.out.println(cores);
    }
}
