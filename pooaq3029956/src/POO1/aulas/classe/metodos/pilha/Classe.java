package aulas.classe.metodos.pilha;

public class Classe {
    
    // pilha de metodos, o metodo 1 não termina até finalizar o metodo 2, assim oir diante.
    
    public void metodo1(){
        metodo2();
        System.out.println("metodo1()");
    }
    
    public void metodo2(){
        metodo3();
        System.out.println("metodo2()");
    }
    
    public void metodo3(){
        metodo4();
        System.out.println("metodo3()");
    }
    
    public void metodo4(){
        metodo5();
        System.out.println("metodo4()");
    }
    
    public void metodo5(){
        System.out.println("metodo5()");
    }
    
}
