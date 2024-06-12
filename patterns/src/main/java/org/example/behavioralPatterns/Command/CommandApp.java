package org.example.behavioralPatterns.Command;

public class CommandApp {
    public static void main(String[] args) {
        Comp comp = new Comp();
        User user = new User(new StartCommand(comp), new StopCommand(comp), new ResetCommand(comp));

        user.startComputer();
        user.stopComputer();
        user.resetComputer();

    }
}

interface Command {
    void execute();
}

//Reciver
class Comp {
    void start() {
        System.out.println("Start");
    }
    void stop() {
        System.out.println("Stop");
    }
    void reset() {
        System.out.println("Reset");
    }
}
//ConcreteCommand
class StartCommand implements Command {
    private Comp comp;

    public StartCommand(Comp comp) {
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.start();
    }
}
class StopCommand implements Command {
    private Comp comp;

    public StopCommand(Comp comp) {
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.stop();
    }
}

class ResetCommand implements Command {
    private Comp comp;

    public ResetCommand(Comp comp) {
        this.comp = comp;
    }

    @Override
    public void execute() {
        comp.reset();
    }
}
//Invoker
class User {
    private Command start;
    private Command stop;
    private Command reset;

    public User(Command start, Command stop, Command reset) {
        this.start = start;
        this.stop = stop;
        this.reset = reset;
    }

    public void startComputer() {
        start.execute();
    }

    public void stopComputer() {
        stop.execute();
    }

    public void resetComputer() {
        reset.execute();
    }
}

