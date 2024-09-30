public class Main {
    public static void main(String[] args) {
        SharedResourcesQueue sharedResource = new SharedResourcesQueue();
        Thread producerThread = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedResource.addItem();
        });
        Thread consumerThread = new Thread(() -> {sharedResource.consumeItem();});
//        producerThread.start();
        producerThread.start();
        producerThread.run();
        producerThread.run();
        consumerThread.start();
        consumerThread.run();
        consumerThread.run();
    }
}