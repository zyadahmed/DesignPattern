public class RemoteControl {
    Command[] onCommands ;
    Command[] offCommands;
    Command undoCommand;
    public RemoteControl(){
        onCommands =  new Command[7];
        offCommands = new Command[7];
        Command Ncommand = new noCommand();
        for (int i = 0 ;i < 7 ;i++){
            onCommands[i] = Ncommand;
            offCommands[i] = Ncommand;
        }
        undoCommand = Ncommand;
    }
    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand ;
        offCommands[slot] = offCommand;
    }
    public void onButtonPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    public void ofButtonPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\\n------ Remote Control -------\\n");
        for (int i = 0 ; i< onCommands.length;i++){
            stringBuffer.append(" Slot " + (i+1) + onCommands[i].getClass().getName()
                                +"  " +offCommands[i].getClass().getName()) ;
        }
        return stringBuffer.toString();
    }
}
