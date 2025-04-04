import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalV = 0, totalP = 0; 

        for (int i = 0; i < 15; i++) {
            System.out.printf("Você deseja pagar à vista ou a prazo? (V / P): ");
            String opcao = sc.next();

            if (opcao.equalsIgnoreCase("V")) { 
                System.out.printf("Qual o valor: ");
                totalV += sc.nextDouble(); 
            } else if (opcao.equalsIgnoreCase("P")) {
                System.out.printf("Qual o valor: ");
                totalP += sc.nextDouble(); 
            } else {
                System.out.println("Você digitou errado, tente novamente.");
                i--; 
                continue;
            }
        }

        // Saídas
        System.out.printf("O valor total pago à vista foi: %.2f%n", totalV);
        System.out.printf("O valor total pago a prazo foi: %.2f%n", totalP);
        System.out.printf("O valor das primeiras parcelas  foram: %.2f%n", totalP / 3);

        sc.close(); // Fecha o scanner
    }
}
