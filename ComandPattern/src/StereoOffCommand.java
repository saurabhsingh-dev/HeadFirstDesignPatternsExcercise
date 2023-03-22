public class StereoOffCommand implements Command{
    public Stereo stereo;
    public StereoOffCommand(Stereo stereo){
        this.stereo = stereo;
    }
    public void execute(){
        stereo.off();
    }
}
