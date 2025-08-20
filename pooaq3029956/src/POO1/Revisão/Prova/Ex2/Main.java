package Revisão.Prova.Ex2;

import Revisão.Prova.Ex2.Circulo;

public class Main {
    public static void main(String[] args) {
        ObjetoBidimensional[] conjunto = new ObjetoBidimensional[5];
        
        for( ObjetoBidimensional obj : conjunto){
            System.out.println( obj );
        }
        
        System.out.println("---");
        
        conjunto[ 0 ] = new Circulo(
                new Ponto2D(5.0, 8.0), // A
                new Ponto2D(10.0, 8.0) // B
        );
        conjunto[ 0 ].getPontoB().setX(15.0);
        
        Ponto2D a = new Ponto2D(1, 1); // é um exemplo promocao pois muda o tipo da variavel, nesse exemplo era double e transformou para int
        Ponto2D b = new Ponto2D(8, 5);
        conjunto[ 3 ] = new Retangulo(a , b);
        System.out.println(conjunto[3]);
        System.out.println("---");
        System.out.println(conjunto[0]);
    }
}
