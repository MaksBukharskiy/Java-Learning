package PracticeCompletableFuture;

import java.util.concurrent.CompletableFuture;

public class Test {
    public static void main(String[] args) {

    PizzaServise service = new PizzaServise();
    Notification notification = new Notification();

    CompletableFuture <String> pizzaFuture = service.getPizzaName()
            .thenApply(name -> {
                System.out.println("Oficcial " + name);
                return name;
            })
            .thenApply(name -> name.toUpperCase())
            .thenApply(name -> name + " с сыром")
            .thenApply(name -> "Готовая " + name)
            .thenApply(name -> "Упакованная " + name);

            pizzaFuture.thenAccept(pizza -> {
                System.out.println("Вы получили: " + pizza);
            });

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
