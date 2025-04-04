import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num, somaPar = 0, somaPrimo = 0;

        for(int i = 0; i < 10; i++){
            int  c = 0;

            System.out.printf("Digite um numero: ");
            num = sc.nextInt();

            if (num % 2 == 0) {
                somaPar += num;
            }
            if(num > 1){
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        c = 1;
                        break;
                    }
                }

                if (c == 0) {
                    somaPrimo += num;
                }
            }
        }

        System.out.printf("A soma dos numeros pares é: %d%n", somaPar);
        System.out.printf("A soma dos numeros primos é: %d%n", somaPrimo);

        sc.close();
    }
}
