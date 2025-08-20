package ex2;

public class PlanoAula {

     private String topico;
     private int duracao;

    public PlanoAula(String topico, int duracao) {
        this.topico = topico;
        this.duracao = duracao;
    }
     
    public void exibirPlano(){
        
        System.out.println("Tópico: " + topico);
        System.out.println("Duração: " + duracao);
        
    }
     
    
}
