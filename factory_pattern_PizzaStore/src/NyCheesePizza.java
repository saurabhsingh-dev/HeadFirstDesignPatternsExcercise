import java.util.ArrayList;

public class NyCheesePizza extends Pizza {
    public NyCheesePizza(){
        toppings = new ArrayList<String >();
        toppings.add("Extra Cheese");
        sauce = "NewYork special creamy";
        crust = "thin";
    }
    public void cut(){
        System.out.println("Cut into 4 pieces! NewYork Cheese Style");
    }
}
