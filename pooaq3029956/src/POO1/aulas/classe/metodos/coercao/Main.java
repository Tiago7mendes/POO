package aulas.classe.metodos.coercao;

public class Main {
    public static void main(String[] args) {
        double pi;
        pi = Math.PI;
        
        int numero;
        
        // coerção do valor doube em pi para o valor inteiro com a perda de informação 
        numero = (int) pi;
        
        System.out.println(numero);
    }
}
