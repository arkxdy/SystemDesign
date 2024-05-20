package logger;

public class InfoLogger extends Logger{

    public InfoLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == INFO){
            System.out.println("INFO: " + message);
        }else{
            super.log(logLevel,message);
        }
    }
}
