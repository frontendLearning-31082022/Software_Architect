package patterns.Command;

import patterns.Command.devices.Fan;
import patterns.Command.devices.Light;

public interface Command {
    public void execute();

    public void undo();
}

class LightOffCommand implements Command {
    Light light;
    int level;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        level = light.getLevel();
        light.off();
    }

    public void undo() {
        light.dim(level);
    }
}

class CeilingFanHighCommand implements Command {
    Fan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(Fan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    public void undo() {
        if (prevSpeed == Fan.HIGH) ceilingFan.high();
        if (prevSpeed == Fan.MEDIUM) ceilingFan.medium();
        if (prevSpeed == Fan.LOW) ceilingFan.low();
        if (prevSpeed == Fan.OFF) ceilingFan.off();
    }
}

class NoCommand implements Command {
    public void execute() {
    }

    public void undo() {
    }
}
