public class SteamedMilkDecorator extends CondimentDecorator {
    public float cost(){
        return .10f + beverages.cost();
    }
    public String getDescription(){
        return beverages.getDescription() + "Steamed Milk,";
    }
}
