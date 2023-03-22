public class RemoteControl {
    public Command[] onCommands;
    public Command[] offCommands;
    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for(int i=0; i<onCommands.length; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }
    public void setCommand(int i, Command onCommand, Command offCommand){
        onCommands[i] = onCommand;
        offCommands[i] = offCommand;
    }
    public void buttonPressed(){
        for(int i=0; i<onCommands.length; i++){
            onCommands[i].execute();
            offCommands[i].execute();
        }
    }
}
