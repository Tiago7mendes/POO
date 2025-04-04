package ex1_10;

public class Main_Hora_Min{
    public static void main(String[] args) {
        
        Hora_Min time = new Hora_Min(30, 12);

        System.out.println("São " + time.getHora() + " horas e " + time.getMin() + " minutos.");
    }
}