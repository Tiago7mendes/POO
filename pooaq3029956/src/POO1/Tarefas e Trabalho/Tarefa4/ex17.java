import java.util.Scanner;

public class ex17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int totalPessoas = 0, pessoas, canal;
        double mediaC1 = 0, mediaC2 = 0, mediaC3 = 0, mediaC4 = 0;
        String assistindo;

        while (true) {
            System.out.printf("Voce estava assistindo algum canal (S / N): ");
            assistindo = sc.next();

            if (assistindo.equalsIgnoreCase("N")) {
                continue;
            }
            else{
                System.out.printf("Qual canal voce esta assisntindo (4,5,7,12 e 0 para sair): ");
                canal = sc.nextInt();

                System.out.printf("Quantas pessoas tem na sua casa assistindo: ");
                pessoas = sc.nextInt();
                totalPessoas += pessoas;

                if (canal == 4) {
                    mediaC1 += pessoas;
                }
                else if (canal == 5) {
                    mediaC2 += pessoas;
                }
                else if (canal == 7) {
                    mediaC3 += pessoas;
                }
                else if (canal == 12) {
                    mediaC4 += pessoas;
                }
                else if (canal == 0) {
                    totalPessoas -= pessoas;
                    break;
                }
                else{
                    System.out.printf("Voce digitou errado, tente novamente ! %n");
                    totalPessoas -= pessoas;
                }
            }
        }

        System.out.printf("A porcentagem do canal 4 foi %.2f%n", 100.0 * mediaC1 / totalPessoas);
        System.out.printf("A porcentagem do canal 5 foi %.2f%n", 100.0 * mediaC2 / totalPessoas);
        System.out.printf("A porcentagem do canal 7 foi %.2f%n", 100.0 * mediaC3 / totalPessoas);
        System.out.printf("A porcentagem do canal 12 foi %.2f%n", 100.0 * mediaC4 / totalPessoas);

        sc.close();
    }
}