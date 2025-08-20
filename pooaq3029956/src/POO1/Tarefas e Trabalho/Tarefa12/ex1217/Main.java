package ex1217;

public class Main {
    public static void main(String[] args) {
        ListaDePalavras listaDePalavras = new ListaDePalavras();

        listaDePalavras.adicionar("maçã");
        listaDePalavras.adicionar("banana");
        listaDePalavras.adicionar("maçã");
        listaDePalavras.adicionar("laranja");
        listaDePalavras.adicionar("banana");

        System.out.println("Frutas: " + listaDePalavras); 
        System.out.println("Tamanho da Lista: " + listaDePalavras.tamanho()); 

        listaDePalavras.remove("banana");
        System.out.println("Nova Lista: " + listaDePalavras);
        System.out.println("Qauntidade de 'banana': " + listaDePalavras.conta("banana"));
    }
}
