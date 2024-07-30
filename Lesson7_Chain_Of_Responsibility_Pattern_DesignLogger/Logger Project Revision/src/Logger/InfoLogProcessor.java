package Logger;

public class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    public void log(int loglevel,String message){
        System.out.print("INFO->");
        if(loglevel == INFO){
            System.out.println("INFO"+" "+message);
        }
        else{
            super.log(loglevel,message);
        }
    }
}
