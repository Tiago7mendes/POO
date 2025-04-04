package Tarefa10.ex10_10;

public class MatrizDouble {
    private int colunas;
    private int linhas;
    private double [][] matriz;

    public MatrizDouble(int colunas, int linhas){
        setColunas(colunas);
        setLinhas(linhas);

    }

    public int getColunas(){
        return colunas;
    }

    public int getLinhas(){
        return linhas;
    }

    public void setColunas(int colunas){
        this.colunas = colunas;
    }

    public void setLinhas(int linhas){
        this.linhas = linhas;
    }

    public void ZerarMatriz(){
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                matriz[i][j] = 0;
            }
        }
    }

    public void Preencher(int l, int c, double valor){
        matriz[l][c] = valor;
    }
}

