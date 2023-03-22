public class RemoteControlInvoker {
    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();

        //create receivers
        Light livingRoomLight = new Light("Living Room");
        Light kitchenRoomLight = new Light("Kitchen");
        Stereo stereo = new Stereo("Living Room");
        CeilingFan ceilingFan = new CeilingFan("Bed Room");

        //create commands
        Command livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        Command kitchenRoomLightOnCommand = new LightOnCommand(kitchenRoomLight);
        Command kitchenRoomLightOffCommand = new LightOffCommand(kitchenRoomLight);
        Command stereoWithCdOnCommand = new StereoWithCdOnCommand(stereo);
        Command stereoOffCommand = new StereoOffCommand(stereo);
        Command ceilingFanOnCommand = new CeilingFanOnCommand(ceilingFan);
        Command ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);


        //set remote slots
        remoteControl.setCommand(0,livingRoomLightOnCommand,livingRoomLightOffCommand);
        remoteControl.setCommand(1,kitchenRoomLightOnCommand,kitchenRoomLightOffCommand);
        remoteControl.setCommand(2,ceilingFanOnCommand,ceilingFanOffCommand);
        remoteControl.setCommand(3,stereoWithCdOnCommand,stereoOffCommand);

        //button was pressed
        remoteControl.buttonPressed();
    }
}
