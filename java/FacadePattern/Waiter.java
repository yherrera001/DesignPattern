package FacadePattern;

public class Waiter { //facade which hides the implementation
    public static String deliverFood(FoodType foodType) {

        Ingredient ingredient = new Ingredient();

        switch (foodType) {
            case PIZZA:
                Food pizza = new Pizza();
                String pizzaItems = ingredient.getPizzaItems();
                pizza.prepareFood(pizzaItems);
                return pizza.deliverFood();


            case PASTA:
                Food pasta = new Pasta();
                String pastaItems = ingredient.getPastaItems();
                pasta.prepareFood(pastaItems);
                return pasta.deliverFood();

        }
        return null;
    }
}
