package POO2.aulas.threads.procon;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        
        Buffer bf = new Buffer();
        Produtor prod = new Produtor(bf, 1000);
        Consumidor cons = new Consumidor(bf, 500);
        
        ExecutorService executorThreads = Executors.newCachedThreadPool();
            
        executorThreads.execute(prod);
        executorThreads.execute(cons);
            
        // encerrar as threads quando as tarefas forem executadas
        executorThreads.shutdown();
    }
}
