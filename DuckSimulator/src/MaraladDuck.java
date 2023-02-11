public class MaraladDuck extends Duck{
    public MaraladDuck(){
        flyVar = new FlyWithWings();
        quackVar = new Quack();
    }
    public void display(){
        System.out.println("I am real Marallad Duck!!");
    }
}
