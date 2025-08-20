import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade, countPesoAltura = 0, countIdadeAltura = 0, countAltura190 = 0;
        double peso, altura, somaIdades = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite a idade da pessoa: %n");
            idade = sc.nextInt();

            System.out.printf("Digite o peso da pessoa: %n");
            peso = sc.nextDouble();

            System.out.printf("Digite a altura da pessoa: %n");
            altura = sc.nextDouble();

            somaIdades += idade;

            if (peso > 90 && altura < 1.50) {
                countPesoAltura++;
            }
            if (altura > 1.90) {
                countAltura190++;
                if (idade >= 10 && idade <= 30) {
                    countIdadeAltura++;
                }
            }
        }

        double porcentagemIdadeAltura = (countAltura190 > 0) ? 100.0 * countIdadeAltura / countAltura190 : 0;

        // Saídas
        System.out.printf("A média das idades das dez pessoas é: %.2f%n", somaIdades / 10);
        System.out.printf("A quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 m é: %d%n", countPesoAltura);
        System.out.printf("A porcentagem de pessoas com idade entre 10 e 30 anos que medem mais de 1,90 m é: %.2f%n", porcentagemIdadeAltura);

        sc.close();
    }
}