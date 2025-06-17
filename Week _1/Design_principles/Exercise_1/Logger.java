package Design_principles.Exercise_1;
public class Logger {
    private static Logger instance;

    // Private constructor to prevent instantiation from other classes
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Public static method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Lazy initialization
        }
        return instance;
    }

    // Example method to simulate logging
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
