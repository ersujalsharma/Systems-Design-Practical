public class SharedResource {
    boolean isItemAvailable;
    public synchronized void addItem(){
        System.out.println("added");
        isItemAvailable = true;
        notifyAll();
    }
    public synchronized void consumeItem(){
        if(!isItemAvailable){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        isItemAvailable = false;
        System.out.println("Consumed");
    }
}
