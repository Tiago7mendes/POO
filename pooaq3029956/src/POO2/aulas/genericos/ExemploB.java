package POO2.aulas.genericos;
import POO2.aulas.colecoes.Pessoa;

public class ExemploB {
    public static void main(String[] args) {
        Integer vetorInt[] = {5, 3, 1};
        Double vetorDouble[] = {0.6, 92.3, 54.1};
        String vetorString[] = {"abacaxi", "manga", "morango"};
        
        Pessoa vetorPessoa[] = {new Pessoa("Tonhao", 78), new Pessoa("Marta", 36), new Pessoa("Thais", 27), new Pessoa("TiagoSetti", 20)};
        
        ClasseB objB = new ClasseB();
        
        objB.printVector(vetorInt);
        objB.printVector(vetorDouble);
        objB.printVector(vetorString);
        objB.printVector(vetorPessoa);
        
        System.out.println("---");
        
        Pessoa older = objB.maximo(vetorPessoa[0], vetorPessoa[1], vetorPessoa[2]);
        System.out.println(older);
        
        System.out.println(objB.maximo(vetorInt[0], vetorInt[1], vetorInt[2]));
        
        System.out.println(objB.maximo(vetorString[0], vetorString[1], vetorString[2]));
    }
}
