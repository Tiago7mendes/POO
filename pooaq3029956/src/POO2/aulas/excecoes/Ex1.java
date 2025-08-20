package POO2.aulas.excecoes;

public class Ex1 { // excecao em java é erro
    public static void main(String[] args) {
        String[] vetor = new String[5];
        
        vetor[0] = "IFSP";
        
        System.out.println(vetor[0]);
        System.out.println(vetor[0].toLowerCase().charAt(1));
//      System.out.println(vetor[1].toLowerCase().charAt(1)); gera a exceção NullPointerException
//        System.out.println(vetor[5]); gera a exceção ArrayIndexOutOfBoundsException
    }
}
