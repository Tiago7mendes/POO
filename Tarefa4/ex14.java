import java.util.Scanner;

public class ex14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int idade, filme, filmeO = 0, filmeR = 0;
        double mediaIdade = 0, filmeB = 0;

        for(int i = 0; i < 15; i++){
            System.out.printf("Digite sua idade: ");
            idade = sc.nextInt();

            System.out.printf("Digite o que achou do filme (ótimo — 3; bom — 2; regular — 1): ");
            filme = sc.nextInt();

            if (filme == 1) {
                filmeR++;
            }
            else if (filme == 2) {
                filmeB++;
            }
            else if (filme == 3) {
                mediaIdade += idade;
                filmeO++;
            }
            else{
                System.out.println("Voce digitou errado, tente novamente");
                i--;
                continue;
            }
        }

        System.out.printf("A media das idades das pessoas que responderam ótimo é: %.2f%n", mediaIdade / filmeO);
        System.out.printf("A quantidade das pessoas que responderam regular foram %d%n", filmeR);
        System.out.printf("A porcentagem das pessoas que responderam bom dentre todas foi %.2f%n", 100 * filmeB / 15);

        sc.close();
    }
}
