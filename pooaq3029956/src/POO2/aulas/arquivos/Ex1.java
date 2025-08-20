package POO2.aulas.arquivos;

import java.io.File;

public class Ex1 {
    public static void main(String[] args) {
        
        File arq0 = new File("./Arquivo0.txt");
        File arq1 = new File("./Arquivo1.txt");
        
        System.out.println( arq0.exists());
        System.out.println( arq1.exists());
        
        File dir = new File("/home/");
        System.out.println(dir.isDirectory());
    }
}
