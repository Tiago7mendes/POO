package ex3;

public class Pedido {
    private int numPedido;
    private String descricao;
    private Cliente cliente;

    public Pedido(int n, String d, Cliente c){
        numPedido = n;
        descricao = d;
        cliente = c;
    }

    public void exibirDetalhe(){
        System.out.println("O pedido " + numPedido + "foi feito pelo" + cliente.getNome());
        cliente.exibirInfo();
        System.out.println("O pedido foi: " + descricao);
    }
}
