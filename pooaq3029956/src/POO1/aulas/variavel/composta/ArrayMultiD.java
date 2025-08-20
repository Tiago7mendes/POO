package aulas.variavel.composta;

public class ArrayMultiD {
    public static void main(String[] args) {
        
        int [][] b = new int[2][];
        
        b[0] = new int [5];
        
        System.out.println( b[0][0] );
        System.out.println( b[0][1] );
        System.out.println( b[0][2] );
        System.out.println( b[0][3] );
        System.out.println( b[0][4] );
        System.out.println(" ");
        
        b[1] = new int[3];
        
        System.out.println( b[1][0] );
        System.out.println( b[1][1] );
        System.out.println( b[1][2] );
        System.out.println(" ");
        
        System.out.println("colunas: " + b.length);
        System.out.println("linhas: " + b[0].length);
        System.out.println("linhas: " + b[1].length);
        System.out.println(" ");
        
        for( int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + "\t");
            }
            
            System.out.println(" ");
        }
        
        System.out.println("---");
        
        int[][][] mtz = new int[4][6][3];
        
        mtz[3][0][0] = 256;
        mtz[2][5][1] = 1024;
        
        for(int k = 0; k < mtz[0][0].length; k++) {
            System.out.print("Camada K: " + k + "\n");
            for( int i = 0; i < mtz.length; i++){
                for(int j = 0; j < mtz[0].length; j++){
                    System.out.print( mtz[i][j][k] + "\t");
                }
                System.out.println(" ");
            }
            System.out.println(" \n");
        }
        
        System.out.println(mtz.length);
        System.out.println(mtz[0].length);
        
    }
}
