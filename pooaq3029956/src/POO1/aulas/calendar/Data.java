package aulas.calendar;

import java.util.Calendar;

public class Data {
    private int dia, mes, ano;
    
    public Data() {
        
        Calendar data = Calendar.getInstance();
        
        dia = data.get( Calendar.DAY_OF_MONTH );
        mes = data.get( Calendar.MONTH ) + 1;
        ano = data.get( Calendar.YEAR );
    }
    
    public void mostrarData() {
        
        Data dt = new Data();
        dt.mostrarData();
    }
    
}
