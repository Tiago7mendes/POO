import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalSim = 0, totalNao = 0;
        int mulheresSim = 0, homensNao = 0, totalHomens = 0;
        String sexo, resposta;
        double porcentagemHomensNao = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o sexo da pessoa (M - masculino, F - feminino): %n");
            sexo = sc.next();

            System.out.printf("Voce gostou do produto? (S / N): %n");
            resposta = sc.next();

            if (resposta.equalsIgnoreCase("S")) {
                totalSim++;
            } else if (resposta.equalsIgnoreCase("N")) {
                totalNao++;
            }

            if (sexo.equalsIgnoreCase("F") && resposta.equalsIgnoreCase("S")) {
                mulheresSim++;
            }

            if (sexo.equalsIgnoreCase("M")) {
                totalHomens++;
                if (resposta.equalsIgnoreCase("N")) {
                    homensNao++;
                }
            }
        }

        if (totalHomens > 0) {
            porcentagemHomensNao = 100.0 * homensNao / totalHomens;
        }

        System.out.printf("O número total de pessoas que responderam 'Sim': %d%n", totalSim);
        System.out.printf("O número total de pessoas que responderam 'Não': %d%n", totalNao);
        System.out.printf("O número de mulheres que responderam 'Sim': %d%n", mulheresSim);
        System.out.printf("A porcentagem de homens que responderam 'Não' entre todos os homens: %.2f%n", porcentagemHomensNao);

        sc.close();
    }
}
