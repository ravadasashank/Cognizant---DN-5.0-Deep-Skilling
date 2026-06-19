//  Exercise 1: Implementing the Singleton Pattern

//  The Singleton Pattern is a Creational Design Pattern that ensures only one object of a class is created and provides a global point of access to that object.

class Logger {

    // Creating a single instance of the Logger class and making it private to prevent direct access
    private static Logger instance;

    // Private constructor prevents object creation from outside the class and ensures that only one instance can be created
    private Logger() {
        System.out.println("Logger Instance Created");
    }

    // Method to get the single instance of the Logger class. If the instance does not exist, it creates one; otherwise, it returns the existing instance.
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