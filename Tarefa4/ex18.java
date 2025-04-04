import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        char sexo;
        double salario;
        double contador = 0.0;
        double soma_salario = 0.0;
        int menor_idade = 1000; 
        int maior_idade = -1; 
        int qtdef200 = 0;
        int idade_menor_salario = 0; 
        char sexo_menor_salario = ' '; 
        double menor_salario = 1000000.0; 
        boolean coleta = true;

        while (coleta) {
            System.out.println("Informe a idade: ");
            idade = sc.nextInt();
            
            if (idade < 0) {
                coleta = false;
            } else {
                System.out.println("Informe o sexo (M / F): ");
                sexo = sc.next().charAt(0); 

                System.out.println("Informe o salário: ");
                salario = sc.nextDouble();
                contador += 1.0;
                soma_salario += salario;

                if (idade < menor_idade) {
                    menor_idade = idade;
                }
                if (idade > maior_idade) {
                    maior_idade = idade;
                }

                if ((sexo == 'F') && (salario <= 200)) {
                    qtdef200++;
                }

                if (salario < menor_salario) {
                    menor_salario = salario;
                    sexo_menor_salario = sexo;
                    idade_menor_salario = idade; 
                }
            }
        }


        System.out.println("A média dos salários do grupo é: " + (soma_salario / contador));
        System.out.println("A menor idade do grupo é: " + menor_idade);
        System.out.println("A maior idade do grupo é: " + maior_idade);
        System.out.println("A quantidade de mulheres com salários até R$ 200,00 é: " + qtdef200);
        System.out.println("A pessoa com menor salário tem " + idade_menor_salario + " anos e o sexo é: " + sexo_menor_salario);

        sc.close();
    }
}
