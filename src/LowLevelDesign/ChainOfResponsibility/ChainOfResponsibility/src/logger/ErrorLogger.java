package logger;

public class ErrorLogger extends Logger{
    public ErrorLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == ERROR){
            System.out.println("ERROR: " + message);
        }else {
            super.log(logLevel, message);
        }
    }
}
