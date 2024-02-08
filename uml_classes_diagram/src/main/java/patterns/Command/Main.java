package patterns.Command;

import patterns.Command.devices.Light;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light deviceLight = new Light("Living Room");

        remoteControl.setCommand(0, new LightOffCommand(deviceLight), new NoCommand());

        //simulate push buttons
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
    }
}
