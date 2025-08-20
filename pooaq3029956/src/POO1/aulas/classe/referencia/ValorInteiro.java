package aulas.classe.referencia;

public class ValorInteiro {
    private int valor;
    
    public ValorInteiro( int v) {
        valor = v;
    }
    
    // dinâmica de acesso ao conteudo (valor) 
    public int getValor() {
        return valor;
    }
    
    // o valor fica imutavel, so muda dentro desta classe
    // dinâmica de alteração do campo/atributo encapsulado
    public void setValor(int v) {
        valor = v;
    }
    
    
}
