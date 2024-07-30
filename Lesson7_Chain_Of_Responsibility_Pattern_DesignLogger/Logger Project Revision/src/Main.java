import Logger.DebugLogProcessor;
import Logger.ErrorLogProcessor;
import Logger.InfoLogProcessor;
import Logger.LogProcessor;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogProcessor.INFO,"LOGGED INFO");
        logProcessor.log(LogProcessor.DEBUG,"LOGGED DEBUG");
        logProcessor.log(LogProcessor.ERROR,"LOGGED ERROR");

    }
}