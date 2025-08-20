package aulas.math;

// todas as classes existentes no pacote lang são incluídas por padrão
//import java.lang.Math; // tem constantes matemáticas e operações

public class Main {
    public static void main(String[] args) {
        
        // a classe math dispõe de seus atributos, as propriedades dessa classe consegue usar os operadores para usar a classe/ atributos
        // pois esses atributos são estaticos, nao precis criar o objeto para existir na memoria, pois quando importa ja esta tudo na memoria
        
        double numero = Math.PI;
        System.out.println(numero);
        
        numero = -2.0;
        numero = Math.abs(numero);
        System.out.println(numero);
        
        numero = Math.sqrt(36.0);
        System.out.println( numero );
        
        numero = Math.pow(2.0, 3.0);
        System.out.println(numero);
        
        numero = Math.pow(2.0, 1.0/2.0);
        System.out.println(numero);
        
        numero = Math.exp(1.0);
        System.out.println(numero);
        
        System.out.println( numero == Math.E);        
    }
}