public class Main {
    public static void main(String[] args) {
        LogProcessor log = new InfoLogProcessor(new ErrorLogProcessor(new DebugLogProcessor(null)));
        log.log(LogProcessor.ERROR,"error logging method");
        log.log(LogProcessor.DEBUG,"debug logging method");
        log.log(LogProcessor.INFO,"info logging method");
        System.out.println("Hello world!");
    }
}