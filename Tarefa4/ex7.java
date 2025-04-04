import java.util.Scanner;

public class ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int idade, idade_50 = 0, idade_10_20 = 0;
        double peso, altura, peso_40 = 0, altura_10_20 = 0;
        for (int i = 0; i < 5; i++){
            System.out.printf("Digite sua idade: %n");
            idade = sc.nextInt();

            System.out.printf("Digite seu peso: %n");
            peso = sc.nextDouble();

            System.out.printf("Digite sua altura: %n");
            altura = sc.nextDouble();

            if (idade > 50) {
                idade_50++;
            }
            if (idade >= 10 && idade <= 20) {
                altura_10_20 += altura;
                idade_10_20++;
            }
            if (peso < 40) {
                peso_40++;
            }
        }

        // saidas
        System.out.printf("A quatidade de pessoas com mais de 50 anos é: %d%n", idade_50);
        System.out.printf("A media da altura das pessoas entre 10 a 20 anos é: %.2f%n", (altura_10_20 / idade_10_20));
        System.out.printf("A porcentagem de pessoas com menos de 40 kg dentre o total é: %.2f%n", 100 * (peso_40 / 5));

        sc.close();
    }
}
