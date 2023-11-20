// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.onButtonPushed(0);
        remoteControl.ofButtonPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}