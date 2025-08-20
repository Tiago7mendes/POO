package POO2.aulas.genericos;

import POO2.aulas.colecoes.Pessoa;

public class ExemploPilha {
    public static void main(String[] args) {
        
        Pilha<Integer> pilhaInt = new Pilha<>();
        
        pilhaInt.add(22);
        pilhaInt.add(654);
        pilhaInt.add(12123);
        
        System.out.println(pilhaInt);
        System.out.println(pilhaInt.remove());
        System.out.println(pilhaInt);
        
        System.out.println("---");
        
        Pessoa p1 = new Pessoa("Jao", 21);
        Pessoa p2 = new Pessoa("Marcos", 23);
        Pessoa p3 = new Pessoa("Klaiton", 13);
        
        Pilha pilhaO = new Pilha();
        
        pilhaO.add(p1);
        pilhaO.add(p2);
        pilhaO.add(p3);
        
        System.out.println(pilhaO);
        System.out.println(pilhaO.remove());
        System.out.println(pilhaO);
        System.out.println(pilhaO.remove() instanceof Object);
        
        Pessoa aux = (Pessoa) pilhaO.remove();
        
        System.out.println("---");
        
        Pilha<Pessoa> pilhaP = new Pilha();
        
        pilhaP.add(p1);
        pilhaP.add(p2);
        pilhaP.add(p3);
        
        System.out.println(pilhaP);
        System.out.println(pilhaP.remove().getIdade());
        System.out.println(pilhaP);
    }
}
