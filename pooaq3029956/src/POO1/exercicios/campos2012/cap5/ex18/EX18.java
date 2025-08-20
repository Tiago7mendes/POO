package exercicios.campos2012.cap5.ex18;

import java.util.Scanner;

public class EX18 {
    public static void main(String[] args) {
        
        Scanner console;
        console = new Scanner(System.in);
        
        int idade;
        char sexo;
        double salario;
        
        double contador = 0.0;
        double soma_salario = 0.0;
        
        int menor_idade = 1000;
        int maior_idade = -1;
        
        int qtdef200 = 0;
        
        int idade_menor_salario = 10000;
        char   sexo_menor_salario = 's';
        double menor_salario = 1000000.0;
        
        boolean coleta = true;
        
        while (coleta == true) {
            System.out.println("Informe a idade: ");
            idade = console.nextInt();
            
            if( idade < 0) {
                coleta = false;
            }
            else {
                System.out.println("Informe a sexo (M / F): ");
                sexo = console.next().charAt(0); // obter um char, pq nao extiste nextChar()
                
                System.out.println("Informe a salario: ");
                salario = console.nextDouble();
                
                contador += 1.0;
                soma_salario += salario;
                
                if( menor_idade > idade ){
                    menor_idade = idade;
                    sexo_menor_salario = sexo;
                }
                
                if(maior_idade < idade) {
                    maior_idade = idade;
                }
                
                if((sexo == 'F') || (sexo == 'f') && (salario <= 200)){
                   qtdef200++;
                }
                
                if (menor_salario > salario){
                    menor_salario = salario;
                    
                    sexo_menor_salario = sexo;
                    menor_idade = idade;
                }
            }
        }
        
        System.out.println("A media dos salarios do grupo é: " + (soma_salario / contador) );
        System.out.println("A menor idade do grupo é: " + menor_idade);
        System.out.println("A maior idade do grupo é: " + maior_idade);
        System.out.println("A quantidade de mulheres com salarios ate R$ 200,00 é: " + qtdef200);
        System.out.println("A idade " + idade_menor_salario+ " e o sexo " + sexo_menor_salario + " possui o menor salario");
    }
}
