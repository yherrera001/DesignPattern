package FacadePattern;

public class Customer {
    public static void main(String[] args) throws Exception{
    //normal scenario without facade
    Ingredient ingredient = new Ingredient();

    Food pasta = new Pasta();
    String pastaItems = ingredient.getPastaItems();
    pasta.prepareFood(pastaItems);
        System.out.println(pasta.deliverFood());


    Food pizza = new Pizza();
    String pizzaItems = ingredient.getPizzaItems();
    pizza.prepareFood(pizzaItems);
        System.out.println(pizza.deliverFood());

        //using facade
        System.out.println("----------facade----------");
        System.out.println(Waiter.deliverFood(FoodType.PASTA));
        System.out.println(Waiter.deliverFood(FoodType.PIZZA));
    }
}
