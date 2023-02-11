import java.util.ArrayList;

public class NyVeggiePizza extends Pizza{
    public NyVeggiePizza(){
        toppings = new ArrayList<String>();
        toppings.add("Paneer");
        toppings.add("Jalpeeno");
        sauce = "NewYork Special creamy";
        crust = "thin";
    }
}
