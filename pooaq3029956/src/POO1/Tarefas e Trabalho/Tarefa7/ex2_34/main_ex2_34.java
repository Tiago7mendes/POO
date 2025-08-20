package ex2_34;

public class main_ex2_34 {
    public static void main(String[] args) {
        NumeroComplexo num1 = new NumeroComplexo();
        NumeroComplexo num2 = new NumeroComplexo();

        num1.inicializaNumero(2, 3);
        num2.inicializaNumero(3, 1);

        num1.soma(num1, num2);
        num1.subtrai(num1, num2);
        num1.multiplica(num1, num2);
        num1.divide(num1, num2);
    }
    
}