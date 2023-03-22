public class Stereo {
    public String location = "";
    public Stereo(String location){
        this.location = location;
    }
    public void on(){
        System.out.println(location+" Stereo Turn on");
    }
    public void off(){
        System.out.println(location+" Stereo turn off");
    }
    public void setCD(){
        System.out.println("Set Cd in Stereo");
    }
    public void setVolume(int volume){
        System.out.println("set Stereo volume to "+ volume);
    }
}
