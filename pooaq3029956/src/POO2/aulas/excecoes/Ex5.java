package POO2.aulas.excecoes;

public class Ex5 {
    public static void main(String[] args) {
        Data hoje = new Data();
        
        hoje.setDia(2);
        
        try {
            hoje.setMes(2);
            hoje.setAno(-1);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
