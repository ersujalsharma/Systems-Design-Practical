import java.util.ArrayDeque;

public class SharedResourcesQueue {
    int size = 5;
    int count=0;
    boolean isEmpty = true;
    boolean isFull = false;
    public synchronized void addItem(){
        while(isFull) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        count++;
        if(count == 5){
            isFull = true;
        }
        if(isEmpty){
            isEmpty = false;
            notifyAll();
        }
        System.out.println("Added");
    }
    public synchronized void consumeItem(){
        while(isEmpty){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        count--;
        if(count == 0){
            isEmpty = true;
        }
        if(isFull){
            isFull = false;
            notifyAll();
        }
        System.out.println("Consumed");
    }
}
