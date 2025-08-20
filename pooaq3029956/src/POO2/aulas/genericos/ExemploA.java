package POO2.aulas.genericos;

public class ExemploA {
    public static void main(String[] args) {
        Integer vetorInt[] = {5, 3, 1};
        Double vetorDouble[] = {0.6, 92.3, 54.1};
        String vetorString[] = {"abacaxi", "manga", "morango"};
        
        ClasseA objA = new ClasseA();
        
        objA.imprimirVetor(vetorInt);
        objA.imprimirVetor(vetorDouble);
        objA.imprimirVetor(vetorString);
    }
}
