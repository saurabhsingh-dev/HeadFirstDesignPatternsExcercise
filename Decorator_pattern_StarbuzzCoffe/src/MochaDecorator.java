public class MochaDecorator extends CondimentDecorator {
    public MochaDecorator(Beverages beverages){
        this.beverages = beverages;
    }
    public float cost(){
        return .20f + beverages.cost();
    }
    public String getDescription(){
        return beverages.getDescription() + "Mocha,";
    }
}
