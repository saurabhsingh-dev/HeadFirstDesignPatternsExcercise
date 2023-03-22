public class CeilingFanOnCommand implements Command{
    public CeilingFan fan;
    public CeilingFanOnCommand(CeilingFan fan){
        this.fan = fan;
    }
    public void execute(){
        fan.on();
    }
}
