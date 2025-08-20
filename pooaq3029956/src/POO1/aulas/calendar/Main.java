package aulas.calendar;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        
        Calendar data = Calendar.getInstance(); //vai pegar a data, hora, min, dia da semana, toda a data...
        // getInstance() vai retornar um objeto da classe Calendar, por isso não precisa usar o new (pois esta padronizado), já esta criado.
        
        int dia = data.get( Calendar.DAY_OF_MONTH );
        int mes = data.get( Calendar.MONTH ) + 1;
        int ano = data.get( Calendar.YEAR );
        
        System.out.println(dia + "/" + mes  + "/" + ano);
        
        System.out.printf( "%tc \n", data ); // o t faz pra imprimir data e hora, e o c imprimi dia, mes, ano, a zona em que vc esta...
        System.out.printf( "%tF \n", data );
        System.out.printf( "%tA \n", data );
       
    }
}
