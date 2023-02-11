public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverages beverages1 = new Espresso();
        System.out.println(beverages1.getDescription()+" $"+beverages1.cost());

        Beverages beverages2 = new DarkRoast();
        beverages2 = new MochaDecorator(beverages2);
        beverages2 = new MochaDecorator(beverages2);
        beverages2 = new WipDecorator(beverages2);
        System.out.println(beverages2.getDescription()+" $"+beverages2.cost());

        Beverages beverages3 = new HouseBlend();
        beverages3 = new SoyDecorator(beverages3);
        beverages3 = new MochaDecorator(beverages3);
        beverages3 = new WipDecorator(beverages3);
        System.out.println(beverages3.getDescription()+" $"+beverages3.cost());
    }
}