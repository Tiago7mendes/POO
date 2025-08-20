package ex2_33;

public class MesadeRestaurante {
    private int sobremesa;
    private int refrig600mL;
    private int refrig2L;
    private int refrigLata;
    private int refeiçãoKg; 
    private int cerveja;

    public void adicionarPedido(String intem, int qddt) {
        switch (intem) {
            case "sobremesa":
                sobremesa += qddt;
                break;
            case "refrig600ml":
                refrig600mL += qddt;
                break;
            case "refrigLata":
                refrigLata += qddt;
                break;
            case "refrig2L":
                refrig2L += qddt;
                break;
            case "refeiçãoKg":
                refeiçãoKg += qddt;
                break;
            case "cerveja":
                cerveja += qddt;
                break;
            default:
                System.out.println("Não temos este item digite outro! \n");
        }
    }

    public void zerarPedidos() {
        sobremesa = 0;
        refrig600mL = 0;
        refrig2L = 0;
        refrigLata = 0;
        refeiçãoKg = 0;
        cerveja = 0;
    }

    public double calculoTotal() {
        double total = 0.0;
        total += sobremesa * 10;
        total += refrig600mL * 8.2;
        total += refrig2L * 10.5;
        total += refrigLata * 5.0;
        total += refeiçãoKg * 29.9;
        total += cerveja * 4.5;

        return total;
    }
}
