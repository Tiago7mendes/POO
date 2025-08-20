import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int id1 = 0, id2 = 0, id3 = 0, id4 = 0, id5 = 0;

        for (int i = 0; i < 8; i++){
            System.out.println("Digite sua idade: ");
            int num = sc.nextInt();
            if (num <= 15) {
                id1++;
            }
            else if (num <= 30) {
                id2++;
            }
            else if (num <= 45) {
                id3++;
            }
            else if (num <= 60) {
                id4++;
            }
            else {
                id5++;
            }
        }

        System.out.printf("A qdd de pessoas na faixa 1 é: %d%n", id1);
        System.out.printf("A qdd de pessoas na faixa 2 é %d%n", id2);
        System.out.printf("A qdd de pessoas na faixa 3 é %d%n", id3);
        System.out.printf("A qdd de pessoas na faixa 4 é %d%n", id4);
        System.out.printf("A qdd de pessoas na faixa 5 é %d%n", id5);

        System.out.printf("A porcentagem de pessoa na faixa 1 entre todas é %d", (id1 / 8));
        System.out.printf("A porcentagem de pessoa na faixa 5 entre todas é %d", (id5 / 8));

        sc.close();
    }
}