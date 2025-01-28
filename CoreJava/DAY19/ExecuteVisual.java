package DAY19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ExecuteVisual {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 10; i++) {
            int num = i;
            executorService.submit(() -> {
                System.out.println("Task " + num + " is on =fr " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }
        executorService.shutdown();
    }
}


