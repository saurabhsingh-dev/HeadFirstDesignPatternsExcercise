public abstract class Duck {
    FlyBehaviour flyVar;
    QuackBehaviour quackVar;
    public void swim() {
        System.out.println("Every duck swims");
    }
    public abstract void display();
    public void performFly(){
        flyVar.fly();
    }
    public void performQuack(){
        quackVar.quack();
    }
}
