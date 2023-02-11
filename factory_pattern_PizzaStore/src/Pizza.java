import java.util.ArrayList;
public abstract class Pizza{
    String sauce;
    String crust;
    ArrayList<String> toppings = null;
    public void prepare(){
        System.out.println("put "+crust+ " crust, add "+sauce+" sauce");
        for(int i=0; i<toppings.size(); i++){
            System.out.println("add topping "+ toppings.get(i));
        }
        System.out.println("Toss it!! Put on Pan !! Bake for 30 minutes!!");
    }
    public void cut(){
        System.out.println("Cutting Pizza into Six pieces");
    }
    public void box(){
        System.out.println("Packing Pizza");
    }
}
