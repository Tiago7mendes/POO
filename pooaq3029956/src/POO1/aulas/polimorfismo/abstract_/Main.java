package aulas.polimorfismo.abstract_;

public class Main {
    public static void main(String[] args) {
        
        // variavel de superclasse pode receber referncia de objeto de subclasse
        Empregado emp1 = new Assalariado("João", "851.741.364-45", 4200.40);
        
        System.out.println( emp1.proventoSemanal() );
        // a variavel de subclasse so tem acesso aos recursos (atribuidos e metodos) definidos superclasse
        //System.out.println(emp1.getSalario());
        System.out.println( emp1 );
        
        Assalariado ass1;
        
        ass1 = (Assalariado) emp1;
        
        // getNome() foi definido na superclasse (base)
        System.out.println(ass1.getNome());
        // getSalario()foi definid na superclasse (derivada)
        System.out.println(ass1.getSalario());
        
        System.out.println("  ");
        System.out.println("-------");
        System.out.println("  ");
        
        Empregado emp2 = new Horista("Carlos", "465.653.234-11", 30, 12.0);
        Empregado emp3 = new Comissao("Ana", "324.565.786-60", 10000.0, 15.0);
        Empregado emp4 = new ComissionadoAssalariado("Maria", "132.546.123-65", 10000.0, 15.0, 4000.0);
        
        Empregado[] folhaSalarial = new Empregado[100];
        
        folhaSalarial[0] = emp1;
        folhaSalarial[21] = emp2;
        folhaSalarial[25] = emp3;
        folhaSalarial[37] = emp4;
        
        System.out.println("Processamento de Folha Salarial Semanal:");
        System.out.println("Nome \t\tProventos");
        
        for(int i = 0; i < folhaSalarial.length; i++){
            if(folhaSalarial[i] != null){
                
                if(folhaSalarial[i] instanceof ComissionadoAssalariado){
                    ComissionadoAssalariado aux;
                    aux = (ComissionadoAssalariado) folhaSalarial[i];
                    
                    aux.setSalario(aux.getSalario() * 1.10 );
                }
                        
                        
                System.out.println(folhaSalarial[i].getNome() + "\t\t" + folhaSalarial[i].proventoSemanal());
            }
        }
        
        System.out.println("-----");
        
        Empregado emp5 = new Horista("João", "851.741.364-45", 25,20.0);
        
        System.out.println(emp1);
        System.out.println(emp5);
        System.out.println(emp1.equals(emp5));
        
    }
}
