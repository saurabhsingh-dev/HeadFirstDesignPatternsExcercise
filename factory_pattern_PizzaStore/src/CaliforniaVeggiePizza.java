import java.util.ArrayList;

public class CaliforniaVeggiePizza extends Pizza{
    public CaliforniaVeggiePizza(){
        toppings = new ArrayList<String>();
        toppings.add("Mushrooms");
        toppings.add("Capscicume");
        sauce = "California Cheese";
        crust = "thick";
    }
}
