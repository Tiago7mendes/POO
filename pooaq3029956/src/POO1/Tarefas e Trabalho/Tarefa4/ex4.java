import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual numero vc deseja ver a tabuada: ");
        int num = sc.nextInt();

        for (int i = 1; i < 11; i++){
            System.out.printf("%d x %d = %d%n", num, i, (num * i));
        }

        sc.close();
    }
}
