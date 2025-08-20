import java.util.Scanner;

public class ex12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num, cPrimo = 0;

        for(int i = 0; i < 10; i++){
            int  c = 0;

            System.out.printf("Digite um numero: ");
            num = sc.nextInt();

            if(num > 1){
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        c = 1;
                        break;
                    }
                }

                if (c == 0) {
                    cPrimo++;
                }
            }
        }

        System.out.printf("A quantidade de numeros primos é: %d", cPrimo);

        sc.close();
    }
}
