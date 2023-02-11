import java.util.ArrayList;

public class CaliforniaPlainPizza extends Pizza{
    public CaliforniaPlainPizza(){
        sauce = "California Cheesy";
        crust = "Thick";
        //no toppings please
        toppings = new ArrayList<String>();
    }
}
