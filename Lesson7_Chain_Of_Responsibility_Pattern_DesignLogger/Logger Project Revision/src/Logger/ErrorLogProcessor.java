package Logger;

public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    public void log(int loglevel,String message){
        System.out.print("ERROR->");
        if(loglevel == ERROR){
            System.out.println("ERROR"+" "+message);
        }
        else{
            super.log(loglevel,message);
        }
    }
}
