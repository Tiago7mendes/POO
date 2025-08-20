import java.util.Scanner;

//quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg;
//média das idades das pessoas com altura inferior a 1,50 m;
//porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas; 
//quantidade de pessoas ruivas e que não possuem olhos azuis.
// olhos (A - azul; P — preto; V — verde; e C — castanho)
// a cor dos cabelos (P — preto; C — castanho; L — louro; e R — ruivo)

public class ex8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int idade, idade_50 = 0, olhoAzul = 0, ruiva_N_azul = 0, c = 0;
        double peso, altura, altura_150 = 0;
        String olho, cabelo;

        for (int i = 0; i < 6; i++){
            System.out.printf("Digite sua idade: %n");
            idade = sc.nextInt();

            System.out.printf("Digite seu peso: %n");
            peso = sc.nextDouble();

            System.out.printf("Digite sua altura: %n");
            altura = sc.nextDouble();

            System.out.printf("Digite a cor do seu olho (A - azul; P — preto; V — verde; e C — castanho): %n");
            olho = sc.next();

            System.out.printf("Digite a cor do seu cabelo (P — preto; C — castanho; L — louro; e R — ruivo): %n");
            cabelo = sc.next();

            if (idade > 50 && peso < 60) {
                idade_50++;
            }
            if (altura < 1.50) {
                altura_150 += idade;
                c++; // contador das pessoas com 1,50 pra baixo
            }
            if (olho.equalsIgnoreCase("A")) {
                olhoAzul++;
            }
            if (cabelo.equalsIgnoreCase("R") && !olho.equalsIgnoreCase("A")) {
                ruiva_N_azul++;
            }
        }

        // saidas
        System.out.printf("A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg: %d%n", idade_50);
        if (c > 0) {
            System.out.printf("A média das idades das pessoas com altura inferior a 1,50 m: %.2f%n", (altura_150 / c));
        } else {
            System.out.println("Não há pessoas com altura inferior a 1,50 m.");
        }
        System.out.printf("A porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas: %.2f%n", 100.0 * olhoAzul / 6);
        System.out.printf("A quantidade de pessoas ruivas e que não possuem olhos azuis: %d%n", ruiva_N_azul);

        sc.close();
    }
}