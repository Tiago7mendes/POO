package POO2.exercicios.tarefa3;

import java.util.List;

// Write a Java program to create a generic method that takes a list of any type and a target element.
// It returns the index of the first occurrence of the target element in the list. 
// Return -1 if the target element cannot be found.

public class Ex3 {
    public <T extends Comparable<T>> int targetElement(List<T> list, T element){
        int i = 0;
        for (T e : list) {
            if (e.compareTo(element) == 0) {
                return i++;
            } else i++;
        }
        return -1;
    }
}
