package POO2.aulas.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex3 {
    
    public static void main(String[] args) {
        
        File arq = new File("./Arquivo2.txt");
        
        FileWriter fileWriter;
        
        try {
            
            if(arq.exists()){
                fileWriter = new FileWriter(arq, true);
            } else{
                fileWriter = new FileWriter(arq);
            }
            
            fileWriter.write("\n\nEste é o conteúdo dp Arquivo2.txt\n\n");
            fileWriter.close();
            
        }catch (IOException ex){
            System.out.println( ex.getMessage());
        }
        
    }
}
