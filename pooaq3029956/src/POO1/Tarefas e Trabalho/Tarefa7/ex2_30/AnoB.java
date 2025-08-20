package ex2_30;

public class AnoB {
    private int mes;
    private int dia;
    private int ano;

    public AnoB (int m, int d, int a) {
        mes = m;
        dia = d;
        ano = a;
    }

    public int getAno() {
        return ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void validarData() {
        validarMes();
        validarDia();
        anoBissexto();
    }

    private void validarMes() {
        if (mes > 0 && mes <= 12) {
            System.out.println("Este mes esta valido !");
        }
        else {
            System.out.println("Mes invalido !!!");
        }
    }

    private void validarDia() {
        if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia < 32 && dia > 0) {
            System.out.println("Este dia esta valido !");
        }
        else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia < 31 && dia > 0) {
            System.out.println("Este dia esta valido !");
        } else if (mes == 2 && dia < 29 && dia > 0) {
            System.out.println("Este dia é valido !");
        }
        else if (mes == 2 && dia == 29) {
            System.out.println("Este dia é valido, porem precisa ver se é ano bissexto!");
        }
        else {
            System.out.println("Dia invalido !!!");
        }
    }

    private void anoBissexto() {
        if (ano % 4 == 0 && ano != 1900) {
            System.out.println("Este ano é bissexto !!!");
        }
        else if (mes == 2 && dia == 29) {
            System.out.println("Esta data nao é valida, pois nao é ano bissexto!");
        }
        else{
            System.out.println("Este ano não é bissexto!");
        }
    }
}
