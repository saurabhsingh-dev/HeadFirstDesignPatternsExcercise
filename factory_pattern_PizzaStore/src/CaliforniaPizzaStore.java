public class CaliforniaPizzaStore extends PizzaStore {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type == "veggie"){
            pizza = new CaliforniaVeggiePizza();
        }
        else if(type == "cheese"){
            pizza = new CaliforniaCheesePizza();
        }
        else{
            pizza = new CaliforniaPlainPizza();
        }
        return pizza;
    }
}
