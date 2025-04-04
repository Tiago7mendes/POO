import java.util.Scanner;

public class ex11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double preco, pagar = 0;
        String opcao;

        System.out.printf("Digite o valor do seu carro: ");
        preco = sc.nextDouble();

        System.out.printf("%nComo deseja pagar a vista ou parcelado (V / P): ");
        opcao = sc.next();

        if (opcao.equalsIgnoreCase("V")) {
            pagar = preco - (preco * 0.20);
        }
        else if (opcao.equalsIgnoreCase("P")) {
            System.out.printf("%nQuantas vezes deseja dividir: 6, 12, 18, 24, 30, 36, 42, 48, 54 e 60 %n");
            pagar = sc.nextDouble();

            pagar = preco + (preco * pagar * 0.005);
        }
        else{
            System.out.println("%nVoce digitou errado, tente novamente!");
        }

        System.out.printf("%nO valor do seu carro foi de %.2f%n", pagar);

        sc.close();
    }
}
