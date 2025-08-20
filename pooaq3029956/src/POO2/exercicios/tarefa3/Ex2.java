package POO2.exercicios.tarefa3;

// Write a Java program to create a generic method that takes a list of numbers and returns the sum of all the even and odd numbers.


public class Ex2 {
    public <T extends Integer> void evenAndOdds(T listN[]){
        int listEven = 0, listOdd = 0;
        
        for (T n : listN) {
            if (n % 2 == 0) {
                listEven += n;
            }else{
                listOdd += n;
            }
        }
        
        System.out.println("The sum of the even numbers is " + listEven);
        System.out.println("The sum of the odd numbers is " + listOdd);
    }
    
    public static void main(String[] args) {
        Integer listInt[] = {12, 23, 54, 234, 67};
        
        Ex2 obj = new Ex2();
        
        obj.evenAndOdds(listInt);
    }
}
