package FacadePattern;

public class Pizza implements Food {
public String preparedItem;

    @Override
    public void prepareFood(String itemsRequired) {
    //in the making
        preparedItem = "Thin crust pizza with ingredients - " + itemsRequired;
    }

    @Override
    public String deliverFood() {
        return preparedItem;
    }
}
