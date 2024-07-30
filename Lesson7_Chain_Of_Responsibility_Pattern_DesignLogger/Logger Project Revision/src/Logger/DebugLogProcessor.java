package Logger;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    public void log(int loglevel,String message){
        System.out.print("DEBUG->");
        if(loglevel == DEBUG){
            System.out.println("DEBUG"+" "+message);
        }
        else{
            super.log(loglevel,message);
        }
    }
}
