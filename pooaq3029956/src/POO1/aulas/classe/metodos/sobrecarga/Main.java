package aulas.classe.metodos.sobrecarga;

import aulas.classe.modificadores.estatico.CalculadorDePontos;

public class Main {
    public static void main(String[] args) {
        
        Ponto origem = new Ponto();
        
        Ponto p = new Ponto(5.0, 5.0);
        
        Ponto k = new Ponto("x", 3.0);
        
        Ponto o = new Ponto("y", -2.0);
        
        // sobrecarga do método setX
        p.setX();
        
        /*CalculadorDePontos calc = new CalculadorDePontos();
        System.out.println(calc.calcularDistanciaDePontos(origem, k));
        
        System.out.println(" ");*/
        
        System.out.println(CalculadorDePontos.calcularDistanciaDePontos(origem, k));
    }
}