import java.util.ArrayList;

public class NyPlainPizza extends Pizza{
    public NyPlainPizza(){
        sauce = "NewYork special creamy";
        //no toppings please
        toppings = new ArrayList<String>();
        crust = "thin";
    }
}
