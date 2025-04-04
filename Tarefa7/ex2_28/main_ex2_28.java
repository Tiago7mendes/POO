package ex2_28;

public class main_ex2_28 {
    public static void main(String[] args) {
        Lampada ligada = new Lampada();

        ligada.acender(); 
        ligada.acender(); 

        System.out.printf("A lâmpada foi acesa %d vezes ao todo.%n", ligada.getContadorAcesa());
    }
}