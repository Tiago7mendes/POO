package Numcomplexo;

public class NumComplex {
    private double real;
    private double imaginario;

    public NumComplex(double r, double i) {
        real = r;
        imaginario = i;
    }

    public NumComplex(double r) {
        real = r;
        imaginario = 0;
    }

    public NumComplex() {
        real = 0;
        imaginario = 0;
    }

    public void imprimeNumero() {
        System.out.printf("%.2f + %.2fi%n", real, imaginario);
    }

    public void eIgual() {
        if (real == imaginario) {
            System.out.printf("É igual !!");
        }
        else{
            System.out.printf("É diferente !");
        }
    }

    public void soma(NumComplex num1, NumComplex num2) {
        double somaReal = num1.real + num2.real;
        double somaImaginario = num1.imaginario + num2.imaginario;

        System.out.printf("A soma dos numeros ficou: %.2f + %.2fi \n", somaReal, somaImaginario);
    }

    public void subtrai(NumComplex num1, NumComplex num2) {
        double subReal = num1.real - num2.real;
        double subImaginario = num1.imaginario - num2.imaginario;

        System.out.printf("A subtração dos numeros ficou: %.2f - %.2fi \n", subReal, subImaginario);
    }

    public void multiplica(NumComplex num1, NumComplex num2) {
        double multReal = (num1.real * num2.real) - (num1.imaginario * num2.imaginario);
        double multImaginario = (num1.real*num1.imaginario) - (num2.real*num2.imaginario);

        System.out.printf("A multiplicação dos numeros ficou: %.2f + %.2fi \n", multReal, multImaginario);
    }

    public void divide(NumComplex num1, NumComplex num2) {
        double divReal = ((num1.real * num2.real) + (num1.imaginario * num2.imaginario) / ((num2.real * num2.real) + (num2.imaginario * num2.imaginario)));
        double divImaginario = ((num2.real*num2.imaginario) - (num1.real*num1.imaginario) /  ((num2.real * num2.real) + (num2.imaginario * num2.imaginario)));

        System.out.printf("A multiplicação dos numeros ficou: %.2f + %.2fi \n", divReal, divImaginario);
    }
}
