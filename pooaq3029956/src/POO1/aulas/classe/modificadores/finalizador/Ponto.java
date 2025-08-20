package aulas.classe.modificadores.finalizador;

public class Ponto {
    
    // chamado na construção do objeto, JVM aloca na memória
    public Ponto(){
    }
    
    // chamado quando a JVM libera espoaços de memória alocados mas não referenciados
    public void finalize(){
    }
    
}
