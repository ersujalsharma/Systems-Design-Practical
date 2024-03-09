public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor nextLogProcessr) {
        super(nextLogProcessr);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == ERROR){
            System.out.println("ERROR"+"->"+message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
