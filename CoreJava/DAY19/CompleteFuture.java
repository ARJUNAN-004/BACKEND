package DAY19;

import java.util.concurrent.CompletableFuture;

public class CompleteFuture {
    public static void main(String[] args) {
        CompletableFuture<String> task = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Fetching user data...");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "User: Sanji";
        });

        CompletableFuture<String> userOrdersTask = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("Fetching user orders...");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Orders: [Laptop, Phone, Tablet]";
        });

        CompletableFuture<String> combinedTask = task.thenCombine(userOrdersTask, (userData, userOrders) -> {
            return userData + "\n" + userOrders;
        });

        combinedTask.thenAccept(result -> {
            System.out.println("\nCombined Result:");
            System.out.println(result);
        });

        combinedTask.join();
    }
}

