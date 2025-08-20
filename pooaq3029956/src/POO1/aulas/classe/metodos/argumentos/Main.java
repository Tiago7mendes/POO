package aulas.classe.metodos.argumentos;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        double aux = calc.somatorio(13.25, 5.0); // isso é uma lista de argumentos
        System.out.println("aux " + aux);
        
        double[] vetor = new double[5];
        vetor[0] = 11.0;
        vetor[1] = 10.0;
        vetor[2] = 5.6;
        vetor[3] = 2.0;
        vetor[4] = 0.5;
        
        aux = calc.somatorio(vetor);
        System.out.println("aux " + aux);
    }
}
