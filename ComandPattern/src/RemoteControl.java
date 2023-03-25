public class RemoteControl {
    public Command[] onCommands;
    public Command[] offCommands;
    public Command undoCommand;
    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for(int i=0; i<onCommands.length; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
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
    public void onButtonPressed(int idx){
        onCommands[idx].execute();
        undoCommand = onCommands[idx];
    }
    public void offButtonPressed(int idx){
        offCommands[idx].execute();
        undoCommand = offCommands[idx];
    }
    public void undoButtonPressed(){
        undoCommand.undo();
    }
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------------ Remote Control -------------\n");
        for(int i=0; i< onCommands.length; i++){
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName() +
                    "      " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuffer.append("Undo Button set to --> " + undoCommand.getClass().getName() + "\n");
        return stringBuffer.toString();
    }
}
