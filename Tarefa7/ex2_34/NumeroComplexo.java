package ex2_34;

public class NumeroComplexo {
    private double real;
    private double imaginario;

    public void inicializaNumero(double r, double i) {
        real = r;
        imaginario = i;
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

    public void soma(NumeroComplexo num1, NumeroComplexo num2) {
        double somaReal = num1.real + num2.real;
        double somaImaginario = num1.imaginario + num2.imaginario;

        System.out.printf("A soma dos numeros ficou: %.2f + %.2fi \n", somaReal, somaImaginario);
    }

    public void subtrai(NumeroComplexo num1, NumeroComplexo num2) {
        double subReal = num1.real - num2.real;
        double subImaginario = num1.imaginario - num2.imaginario;

        System.out.printf("A subtração dos numeros ficou: %.2f - %.2fi \n", subReal, subImaginario);
    }

    public void multiplica(NumeroComplexo num1, NumeroComplexo num2) {
        double multReal = (num1.real * num2.real) - (num1.imaginario * num2.imaginario);
        double multImaginario = (num1.real*num1.imaginario) - (num2.real*num2.imaginario);

        System.out.printf("A multiplicação dos numeros ficou: %.2f + %.2fi \n", multReal, multImaginario);
    }

    public void divide(NumeroComplexo num1, NumeroComplexo num2) {
        double divReal = ((num1.real * num2.real) + (num1.imaginario * num2.imaginario) / ((num2.real * num2.real) + (num2.imaginario * num2.imaginario)));
        double divImaginario = ((num2.real*num2.imaginario) - (num1.real*num1.imaginario) /  ((num2.real * num2.real) + (num2.imaginario * num2.imaginario)));

        System.out.printf("A multiplicação dos numeros ficou: %.2f + %.2fi \n", divReal, divImaginario);
    }
}
