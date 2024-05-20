package logger;

public class DebugLogger extends Logger{
    public DebugLogger(Logger logger) {
        super(logger);
    }
    @Override
    public void log(int logLevel, String message) {
        if(logLevel == DEBUG){
            System.out.println("DEBUG: " + message);
        }else {
            super.log(logLevel, message);
        }
    }
}
