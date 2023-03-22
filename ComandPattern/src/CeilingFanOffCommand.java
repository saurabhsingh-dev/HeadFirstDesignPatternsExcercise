public class CeilingFanOffCommand implements Command{
    public CeilingFan fan;
    public CeilingFanOffCommand(CeilingFan fan){
        this.fan = fan;
    }
    public void execute(){
        fan.off();
    }
}
