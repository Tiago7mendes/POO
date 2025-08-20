package aulas.variavel.composta;

public class OperadorArray {
    
    private OperadorArray() {} // impede a criacao de objetos da classe
    
    public static int soma(int[] vetor /* passado por referencia altera o vetor */ ) {
        int resultado = 0;
        for( int v : vetor ) {
            resultado += v;
        }
        return resultado;
    }
    
    public static void preencher(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++ ){
            vetor[ i ] = valor;
        }
    }
    
    
}
