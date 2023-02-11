public class Driver {
    public static void main(String[] args) {
        PizzaStore pizzaStore = null;
        pizzaStore = new CaliforniaPizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("veggie");
        pizzaStore.orderPizza("plain");

        pizzaStore = new NyPizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("veggie");
        pizzaStore.orderPizza("plain");
    }

}
