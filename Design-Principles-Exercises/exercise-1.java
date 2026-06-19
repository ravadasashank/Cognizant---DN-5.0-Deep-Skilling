//  Exercise 1: Implementing the Singleton Pattern

//  The Singleton Pattern is a Creational Design Pattern that ensures only one object of a class is created and provides a global point of access to that object.

class Logger {

    // Create a single instance
    private static Logger instance;

    // Private constructor prevents object creation from outside
    private Logger() {
        System.out.println("Logger Instance Created");
    }

    // Method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

public class SingletonDemo {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First Message");
        logger2.log("Second Message");

        System.out.println(logger1 == logger2);
    }
}