public class WipDecorator extends CondimentDecorator {
    public WipDecorator(Beverages beverages){
        this.beverages = beverages;
    }
    public float cost(){
        return .10f + beverages.cost();
    }
    public String getDescription(){
        return beverages.getDescription() + "Wip,";
    }
}
