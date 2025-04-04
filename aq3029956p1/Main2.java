package aq3029956p1;

public class Main2 {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Onix", 2019, "ARC-8123", true);
    
        Estacionamento e = new Estacionamento("Tiago", "Sao Carlos", "99106XXXX", 5);
    
        e.estacionarVeiculo(3, v1);
        e.liberarVeiculo(3); 
    }
}
