public class ex1 {
    public static void main(String[] args) {
        int num;
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                num = i * j;
                System.out.printf(" %d x %d = %d \n", i, j, num);
            }
        }
    }
}