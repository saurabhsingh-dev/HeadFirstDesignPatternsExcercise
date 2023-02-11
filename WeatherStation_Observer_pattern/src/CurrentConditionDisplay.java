public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    Subject subject;
    public CurrentConditionDisplay(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }
    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    public void display(){
        System.out.println("Current Temperature "+temperature+"F degree, humidity "+humidity+" and pressure "+pressure);
    }

}
