package aulas.variavel.composta;

import java.util.Arrays;

public class ArrayUniD {
    public static void main(String[] args) {
        
    //    int[] vetor = new int[5]; outro jeito para criar um vetor
        
        int [] vetor;
        vetor = new int[5];
        vetor = new int[25]; // perde a alocação anterior (linha 9)
        
        final int TAMANHO = 5;  // final é a constante em java
        vetor = new int [ TAMANHO ];
        
        vetor [ 0 ] = 5;
        vetor [ 1 ] = 3;
        vetor [ 2 ] = 1;
        vetor [ 3 ] = -2;
        vetor [ 4 ] = 10;
        
        System.out.println(vetor [ 0 ]);
        
        vetor [ 4 ] += 10;
        System.out.println(vetor [ 4 ]);
        
        System.out.println("Indice \t Valor");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] *= 2;      // altera o vetor original
            System.out.println(i + " \t " + vetor[i]);
        }
        
        System.out.println("---");
        
        System.out.println("Valor");
        for( int v: vetor) {
            v *= 2;         // esse nao altera o vetor, pois é uma copia
            System.out.println(v);
        }
        
        System.out.println("Indice \t Valor");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(i + " \t " + vetor[i]);
        }
        
        System.out.println("---");
        
        System.out.println("soma dos valores do vetor = " +  OperadorArray.soma(vetor));
        
        System.out.println("---");
        
        OperadorArray.preencher(vetor, 1);
        
        System.out.println("soma dos valores do vetor = " +  OperadorArray.soma(vetor));
        
        System.out.println("---");
        
        Arrays.fill( vetor , 2 ); // faz a mesma coisa que o metodo preencher
        
        System.out.println("soma dos valores do vetor = " +  OperadorArray.soma(vetor));
        
        System.out.println("---");
        
        Ponto p = new Ponto(12.9, 12.5);
        System.out.println( p ); // chama o toString() por causa do override
        
        System.out.println("---");
        
        Ponto[] pontos = new Ponto[5];
        
        System.out.println( pontos[ 1 ] );
        pontos[ 3 ] = p; // p e pontos[ 3 ] apontam para o mesmo objeto(referência) da classe Ponto
        
        pontos[ 3 ].setX(0.25);
        pontos[ 3 ].setY(0.25);
        
        System.out.println("---");
        
        System.out.println( p );
        
        pontos[ 2 ] = new Ponto(5.0, 5.0);
        
        System.out.println("---");
        
        System.out.println("Indice \t Valor");
        for (int i = 0; i < pontos.length; i++) {
            System.out.println(i + " \t " + pontos[i]);
        }
        
        Arrays.fill( pontos, new Ponto(0.0, 0.0));
        System.out.println("---");
        
        System.out.println("Indice \t Valor");
        for (int i = 0; i < pontos.length; i++) {
            System.out.println(i + " \t " + pontos[i]);
        }
        
        pontos[1].setX(4.2);
        System.out.println("---");
        
        System.out.println("Indice \t Valor");
        for (int i = 0; i < pontos.length; i++) {
            System.out.println(i + " \t " + pontos[i]);
        }
        
        System.out.println("---");
        
        for (int i = 0; i < pontos.length; i++){
            pontos[ i ] = new Ponto(0.0, 0.0);
        }
        
        System.out.println("Indice \t Valor");
        for (int i = 0; i < pontos.length; i++) {
            System.out.println(i + " \t " + pontos[i]);
        }
    }
}
