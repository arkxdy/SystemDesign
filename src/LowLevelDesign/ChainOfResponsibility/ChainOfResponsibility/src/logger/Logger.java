package logger;

public abstract class Logger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    Logger nextLogger;

    Logger(Logger logger){
        this.nextLogger = logger;
    }

    public void log(int logLevel, String message){
        if(nextLogger != null){
            nextLogger.log(logLevel, message);
        }else {
            System.out.println("UNKNOWN: " + message);
        }
    }

}
