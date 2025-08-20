package ex2_9;

import java.util.Scanner;

public class Main_Lampada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Lampada lampada = new Lampada();

        System.out.print("Digite a quantidade de energia usada nesta lâmpada (em watts): ");
        int energia = sc.nextInt();
        lampada.setEnergia(energia); 

        if (lampada.eEconomica()) {
            System.out.println("Esta lâmpada é econômica.");
        } else {
            System.out.println("Esta lâmpada não é econômica.");
        }

        sc.close();
    }
}
