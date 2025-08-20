package aulas.polimorfismo.interface_;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Empregado emp1 = new Assalariado("Tiago", "123.543.321-87", 100000);
        
        Empregado emp2 = new Assalariado("Chico", "432.321.756-12", 120000);
        
        Boleto b1 = new Boleto("SAEB", 250.0);
        Boleto b2 = new Boleto("CPFL", 1300.0);
        
        ArrayList<Pagavel> pagamento = new ArrayList<>();
        
        pagamento.add(emp1);
        pagamento.add(emp2);
        pagamento.add(b1);
        pagamento.add(b2);
        
        System.out.println("Processamento de Caixa - Semanal");
        double valorTotal = 0;
        
        for(int i = 0; i < pagamento.size(); i++){
            System.out.println( pagamento.get(i).getDescricao() + " ---- " + pagamento.get(i).getValor());
            
            valorTotal += pagamento.get(i).getValor();
            
        }
        
        System.out.println("Valor Total: " + valorTotal);
        
    }
}
