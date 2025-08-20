package aq3029956p1;

public class Main1 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Tiago", 19, 70.1, 1.80);
        
        p1.imprimirPessoa();
        p1.imprimirStatus();
        p1.eMaisVelho(10);
    }
    
}
