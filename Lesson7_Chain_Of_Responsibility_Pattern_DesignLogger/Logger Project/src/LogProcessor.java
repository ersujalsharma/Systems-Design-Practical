public abstract class LogProcessor {
    static int ERROR = 1;
    static int DEBUG = 2;
    static int INFO = 3;
    LogProcessor nextLogProcessr;
    public LogProcessor(LogProcessor nextLogProcessr){
        this.nextLogProcessr = nextLogProcessr;
    }
    public void log(int logLevel, String message){
        if(nextLogProcessr!=null){
            nextLogProcessr.log(logLevel,message);
        }
    }
}
