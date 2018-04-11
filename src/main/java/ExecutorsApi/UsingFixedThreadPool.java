package ExecutorsApi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import Commons.LoopTaskA;

public class UsingFixedThreadPool {

    public static void main(String[] args) {
        System.out.println("Main thread begins");

        /**
         * When you set this number, only those many threads run in parallel.
         * Remaining gets picked up one by one as the previous ones completes.
         */
        ExecutorService executorService  = Executors.newFixedThreadPool(3);

        // Submitting 8 tasks
        executorService.execute(new LoopTaskA());
        executorService.execute(new LoopTaskA());
        executorService.execute(new LoopTaskA());

        executorService.execute(new LoopTaskA());
        executorService.execute(new LoopTaskA());
        executorService.execute(new LoopTaskA());

        executorService.execute(new LoopTaskA());
        executorService.execute(new LoopTaskA());

        if(!executorService.isShutdown()) {
            System.out.println("Shut down service.");
            executorService.shutdown();
        }
        System.out.println("Main thread ends");
    }
}
