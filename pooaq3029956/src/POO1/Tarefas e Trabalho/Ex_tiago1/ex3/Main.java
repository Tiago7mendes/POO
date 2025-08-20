package ex3;

public class Main {
    public static void main(String[] args) {
        	Cliente cl1 = new Cliente("Tiago", "tiagosettimendes@gmail.com");
            Pedido p1 = new Pedido(1, "2 paes puma", cl1);
            Pedido p2 = new Pedido(2, "Arroz", cl1);

            p1.exibirDetalhe();
            p2.exibirDetalhe();
    }
}
