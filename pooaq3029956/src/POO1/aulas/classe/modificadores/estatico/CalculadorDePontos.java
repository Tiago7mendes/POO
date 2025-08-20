package aulas.classe.modificadores.estatico;

import aulas.classe.metodos.sobrecarga.Ponto;

public class CalculadorDePontos {
    
    private CalculadorDePontos(){}
    
    public static double calcularDistanciaDePontos(Ponto a, aulas.classe.metodos.sobrecarga.Ponto b) {
        double resultado;
        
        resultado = Math.sqrt(Math.pow(( a.getX() - b.getX() ), 2.0 ) + Math.pow((a.getY() - b.getY() ), 2.0));
        
        return resultado;
    }
}
