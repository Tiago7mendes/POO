public class ex2_23 {
    
    private int contador, cont;

    public ex2_23 (int c) {
        contador = c;
        incremento();
    }

    public int getCont() {
        return contador;
    }

    public int getIncremento() {
        return cont;
    }

    private void incremento() {
        int resultado = 0;

        resultado = contador + 1;

        setIncremento(resultado);
    }
    
    public void setCont(int c) {
        contador = c;
    }

    private void setIncremento(int t) {
        if (contador > 0) {
            cont = t;
        }
    }
}
