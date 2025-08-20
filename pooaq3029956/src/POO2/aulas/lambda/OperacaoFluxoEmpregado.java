package POO2.aulas.lambda;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Comparator;

public class OperacaoFluxoEmpregado {
    public static void main(String[] args) {
        List<Empregado> empregados = new ArrayList<>();
        
        empregados.add( new Empregado("Mario", "TI", 1350.00));
        empregados.add( new Empregado("Joana", "TI", 3750.00));
        empregados.add( new Empregado("Carlos", "Compras", 5050.00));
        empregados.add( new Empregado("Ana", "Compras", 2350.00));
        
        empregados.stream().forEach((emp) -> System.out.println(emp));
        System.out.println();
        
        empregados.stream().sorted().forEach((emp) -> System.out.println(emp));
        System.out.println();
        
        empregados.stream().filter((emp) -> emp.getSalario() >= 2000.00 && emp.getSalario() <= 4000.00).sorted().forEach((emp) -> System.out.println(emp));
        System.out.println();
        
        List<Empregado> lista = empregados.stream()
                .sorted( Comparator.comparing( (e) -> e.getNome()))
                .collect(Collectors.toList());
        System.out.println(lista);
    }
}
