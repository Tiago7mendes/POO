package POO2.exercicios.tarefa3;

// Write a Java program to create a generic method that takes two arrays of the same type and checks if they have the same elements in the same order.

public class Ex1 {
    public < T extends Comparable<T>> boolean check(T value1[], T value2[]){
        int i = 0;
        
        if (value1.length == value2.length) {
            for (T value : value1) {
                if (value.compareTo(value2[i]) != 0) {
                    return false;
                }
                i++;
            }
            return true;
        } else return false;
    }
    
    public static void main(String[] args) {
        String vectorString1[] = {"abc", "dsf"};
        String vectorString2[] = {"abc", "dsf"};
        String vectorString3[] = {"abc", "def"};
        
        Ex1 obj1 = new Ex1();
        
        System.out.println(obj1.check(vectorString1, vectorString2));
        System.out.println(obj1.check(vectorString1, vectorString3));
    }
}
