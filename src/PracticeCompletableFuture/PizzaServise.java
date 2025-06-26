package PracticeCompletableFuture;

import java.util.concurrent.CompletableFuture;

public class PizzaServise {

    public CompletableFuture<String> getPizzaName(){
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Ты вызвал getPizza name");
            return "Margarita";
        });
    }

    public CompletableFuture <String> addCheese(CompletableFuture <String> pizzaName){
        return pizzaName.thenApply(pizza -> {
            System.out.println("Добавили сыр в " + pizza);
            return pizza + "С сыром";
        });
    }

    public CompletableFuture <String> cookingPizza(CompletableFuture <String> pizzaName){
        return pizzaName.thenApply(name -> {
            System.out.println("Is cooking " + name);
            return "Упакованная " + name;
        });
    }

}
