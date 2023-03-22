public class CeilingFan {
    public String location = "";
    public CeilingFan(String location){
        this.location = location;
    }
    public void on(){
        System.out.println(location+" Ceiling fan turn on");
    }
    public void off(){
        System.out.println(location+" Ceiling Fan turn off");
    }
}
