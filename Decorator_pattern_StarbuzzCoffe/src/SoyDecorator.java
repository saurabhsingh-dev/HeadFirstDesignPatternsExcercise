public class SoyDecorator extends CondimentDecorator {
    public SoyDecorator(Beverages beverages){
        this.beverages = beverages;
    }
    public float cost(){
        return .15f + beverages.cost();
    }
    public String getDescription(){
        return beverages.getDescription() + "Soy,";
    }
}
