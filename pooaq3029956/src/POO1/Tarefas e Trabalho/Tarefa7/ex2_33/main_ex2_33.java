package ex2_33;

public class main_ex2_33 {
    public static void main(String[] args) {
        RestauranteCaserio restaurante = new RestauranteCaserio(5);

        restaurante.adicionarAoPedido(0, "cerveja", 4);
        restaurante.adicionarAoPedido(0, "sobremesa", 7);
        restaurante.adicionarAoPedido(2, "refrig2L", 2);

        System.out.printf("O total da mesa 0 foi: %f \n", restaurante.totalMesa(0));
        System.out.printf("O total da mesa 2 foi: %f \n", restaurante.totalMesa(2));

        restaurante.zerarPedidoDaMesa(2);
    }
    
}