package POO2.aulas.threads;

import java.util.Arrays;

public class Fila {
    
    private int[] vetor;
    private int indice;
    
    public Fila(int tamanho){
        vetor = new int[tamanho];
        indice = 0;
    }
    
//    public void adicionar(int valor, int delay){
    public synchronized void adicionar(int valor, int delay){ // garante q quem chegar primeiro realiza o codigo
        
        try{
            int i = indice;
            Thread.sleep(delay);
            
            vetor[i] = valor;
            System.out.println("O número " + valor + " foi adicionado na fila.");
            indice++;
            
        } catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
    
    @Override
    public String toString(){
        return Arrays.toString(vetor);
    }
}
