public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(LogProcessor nextLogProcessr) {
        super(nextLogProcessr);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == INFO){
            System.out.println("INFO"+"->"+message);
        }
        else {
            super.log(logLevel, message);
        }
    }
}
