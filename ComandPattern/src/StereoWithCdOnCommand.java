public class StereoWithCdOnCommand implements Command{
    public Stereo stereo;
    public StereoWithCdOnCommand(Stereo stereo){
        this.stereo = stereo;
    }
    public void execute(){
        stereo.on();
        stereo.setCD();
        stereo.setVolume(10);
    }
    public void undo(){
        stereo.off();
    }
}
