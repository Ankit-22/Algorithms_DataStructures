interface  Command {
    void execute();
}

interface Switch {
    void on();
    void off();
}

class Light implements Switch {
    @Override
    public void on() {
        System.out.println("The Light is On.");
    }

    @Override
    public void off() {
        System.out.println("The Light is Off.");
    }
}

class Button {

    Command onCommand;
    Command offCommand;

    Button(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    void buttonOn() {
        onCommand.execute();
    }

    void buttonOff() {
        offCommand.execute();
    }
}

class OnCommand implements Command {
    Light light;

    OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}

class OffCommand implements Command {
    Light light;

    OffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
       light.off();
    }
}

public class Suraj {
    public static void main(String[] args) {

        Light light = new Light();

        Command onCommand = new OnCommand(light);
        Command offCommand = new OffCommand(light);

        Button btn = new Button(onCommand, offCommand);

        btn.buttonOff();
        btn.buttonOn();
    }
}