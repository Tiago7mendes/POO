package ex2_24;
public class Data {
    private int ano;
    private int mes;
    private int dia;
    
    public Data(int a, int m, int d) {
        ano = a;
        mes = m;
        dia = d;
    }

    public int getAno() {
        return ano;
    }
    
    public void setAno(int a) {
        ano = a;
    }
    
    public int getMes() {
        return mes;
    }
    
    public void setMes(int m) {
        mes = m;
    }
    
    public int getDia() {
        return dia;
    }
    
    public void setDia(int d) {
        dia = d;
    }
    

    public void duplicaData () {
        dia = dia * 2;
        mes = mes * 2;
        ano = ano * 2;
    }

    public void imprimirData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

}
