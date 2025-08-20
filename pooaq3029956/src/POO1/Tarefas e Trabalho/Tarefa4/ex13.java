import java.util.Scanner;

public class ex13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int idade, f1 = 0, f2 = 0, f3 = 0, f4 = 0;
        double peso1 = 0, peso2 = 0, peso3 = 0, peso4 = 0, peso;

        for (int i = 0; i < 15; i++){
            System.out.printf("Digite sua idade: ");
            idade = sc.nextInt();

            System.out.printf("Digite o seu peso: ");
            peso = sc.nextDouble();

            if (idade >= 1 && idade <= 10) {
                peso1 += peso;
                f1++;
            }
            else if (idade > 10 && idade <= 20) {
                peso2 += peso;
                f2++;
            }
            else if (idade > 20 && idade <= 30) {
                peso3 += peso;
                f3++;
            }
            else if (idade > 30) {
                peso4 += peso;
                f4++;
            }
            else{
                System.out.println("Voce digitou errado, tente novamente!");
                i--;
                continue;
            }
        }

        System.out.printf("A media dos pesos da faixa 1 foi: %.2f Kg %n", peso1 / f1);
        System.out.printf("A media dos pesos da faixa 2 foi: %.2f Kg %n", peso2 / f2);
        System.out.printf("A media dos pesos da faixa 3 foi: %.2f Kg %n", peso3 / f3);
        System.out.printf("A media dos pesos da faixa 4 foi: %.2f Kg %n", peso4 / f4);

        sc.close();
    }
}
