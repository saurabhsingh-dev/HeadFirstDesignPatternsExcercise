public class NyPizzaStore extends PizzaStore{
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type == "veggie"){
            pizza = new NyVeggiePizza();
        }
        else if(type == "cheese"){
            pizza = new NyCheesePizza();
        }
        else {
            pizza = new NyPlainPizza();
        }
        return pizza;
    }
}
