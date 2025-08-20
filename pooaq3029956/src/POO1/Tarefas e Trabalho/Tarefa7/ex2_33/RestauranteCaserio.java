package ex2_33;

public class RestauranteCaserio {
    private MesadeRestaurante[] mesas;

    public RestauranteCaserio (int numMesa) {
        mesas = new MesadeRestaurante[numMesa]; // criacao da lista das mesas

        for (int i = 0; i < numMesa; i++) {
            mesas[i] = new MesadeRestaurante(); // para que cada mesa tenha os metodos da classe MesaRestaurante
        }
    }

    public void adicionarAoPedido(int numMesa, String item, int qddt) {
        if (numMesa >= 0 && numMesa < mesas.length) {
            mesas[numMesa].adicionarPedido(item, qddt);
        }
        else {
            System.out.println("Essa mesa não existe! \n");
        }
    }

    public double totalMesa(int numMesa) {
        if (numMesa >= 0 && numMesa < mesas.length) {
            return mesas[numMesa].calculoTotal();
        }
        else {
            return 0.0;
        }
    }

    public void zerarPedidoDaMesa(int numMesa) {
        if (numMesa >= 0 && numMesa < mesas.length) {
            mesas[numMesa].zerarPedidos();
        }
    }
}
