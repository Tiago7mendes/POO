package POO2.aulas.excecoes;

public class Ex4 {
    public static void main(String[] args) {
        String[] vetor = new String[5];
        
        vetor[0] = "IFSP";
        
        try {
        
            System.out.println(vetor[0]);
            System.out.println(vetor[0].toLowerCase().charAt(1));
//            System.out.println(vetor[1].toLowerCase().charAt(1)); //gera a exceção NullPointerException
            System.out.println(vetor[5]); //gera a exceção ArrayIndexOutOfBoundsException
            System.out.println("asjdfh"); // nao imprime essa frase, pois cancela o try quando acha uma exceção
        } catch (NullPointerException ex1) {
            System.out.println("Ocorreu uma exceção NullPointerException");
        } catch (ArrayIndexOutOfBoundsException ex2){
            System.out.println(ex2.getMessage());
        } finally{
            System.out.println("Bloco finally foi executado.");
        }
        
        System.out.println(vetor[0]);
    }
    
    
}
