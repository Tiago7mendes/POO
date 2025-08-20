package aulas.classe.referencia;


public class Operador {
    // tipos primitivos são passados como copias em parametros de metodos
    public void zerarInteiro(int valor) {
        //
        System.out.println("zerar valor: " + valor);
        valor = 0;
        System.out.println("zerarInteiro valor: " + valor);
    }
    
    // tipos referencia são passados literalmente em parâmetros de métodos
    public void zerarValorInt(ValorInteiro v) {
        System.out.println("v.getValor()" + v.getValor());
        v.setValor(0);
        System.out.println("v.getValor()" + v.getValor());
    }
}
