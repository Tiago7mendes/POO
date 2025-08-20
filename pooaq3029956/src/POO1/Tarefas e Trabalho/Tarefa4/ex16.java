import java.util.Scanner;

public class ex16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double idade = -1, mediaIdade = 0, c = 0;

        while (idade != 0) {
            System.out.printf("Digite sua idade (para sair digite 0): ");
            idade = sc.nextDouble();

            mediaIdade += idade;
            c++;
        }

        System.out.printf("A media das idades foi %.2f", mediaIdade / (c - 1));
        sc.close();
    }
}
