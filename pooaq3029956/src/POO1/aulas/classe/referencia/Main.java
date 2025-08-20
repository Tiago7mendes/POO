package aulas.classe.referencia;

public class Main {
    public static void main(String[] args) {
        
        int var = 12;
        System.out.println("var: " + var);
        
        Operador op = new Operador();
        // sera passado uma copia do valor contido em var (tipo primitivo)
        op.zerarInteiro(var);
        
        ValorInteiro vInt = new ValorInteiro(47);
        
        System.out.println("Valor do atributo encapsulado: " + vInt.getValor());
        
        op.zerarValorInt(vInt);
        
        System.out.println("vInt.getValor(): " + vInt.getValor());
    }
}
