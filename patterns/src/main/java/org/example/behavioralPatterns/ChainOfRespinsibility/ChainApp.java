package main.java.org.example.behavioralPatterns.ChainOfRespinsibility;

// Логгер который присылает сообщения

public class ChainApp {
    public static void main(String[] args) {
        Logger logger = new SMSLogger(Level.ERROR);
        Logger fileLogger = new FileLogger(Level.DEBUG);
        Logger emailLogger = new EmailLogger(Level.INFO);

        logger.setNext(fileLogger);
        fileLogger.setNext(emailLogger);

        logger.writeMessage("All ok", Level.INFO);
        logger.writeMessage("Critical error", Level.ERROR);
        logger.writeMessage("In debug", Level.DEBUG);

    }
}


class Level {
    public static final int ERROR = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;
}
//handler
abstract class Logger {
    private int priority;
    private Logger next;

    public void setNext(Logger next) {
        this.next = next;
    }

    public Logger(int priority) {
        this.priority = priority;
    }

     public void writeMessage(String message, int level) {
         if (level <= priority) {
             write(message);
         }
         if (next != null) {
             next.writeMessage(message, level);
         }
     }

     abstract void write(String message);
}

class SMSLogger extends Logger {
    public SMSLogger(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("SMS: " + message);
    }
}

class FileLogger extends Logger {
    public FileLogger(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Write in file: " + message);
    }
}

class EmailLogger extends Logger {
    public EmailLogger(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Email: " + message);
    }
}
