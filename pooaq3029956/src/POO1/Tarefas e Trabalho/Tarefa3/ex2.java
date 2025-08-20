public class ex2 {
    public static void main(String[] args) {
        int c = 0, num = 100;
        while (c < 3){
            if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0){ // como o problema nao precisa de mtos primos entao da pra fazer desse jeito
                System.out.printf("Este numero é primo %d%n", num);
                c++;
            }

            num++;
        }
    }
}