package aulas.classe.metodos.promocao;

public class Main {
    public static void main(String[] args) {
        // promocao é uma troca um tipo mas sem perder sua informacao
        
        int numero = 25;
        
        double resultado;

        // promoção do valor inteiro na variavel 'numero' para um valor double, sem perda da informação
        resultado = Math.sqrt(numero);
        System.out.println("resultado " + resultado);
    }
}
