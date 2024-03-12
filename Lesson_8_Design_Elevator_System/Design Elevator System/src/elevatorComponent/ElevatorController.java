package elevatorComponent;

import Building.Floor;

import java.util.PriorityQueue;

public class ElevatorController {
    public Elevator elevator;
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
    PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)->b-a);
    public void acceptNewReq(int floor,Direction direction){
        if(Direction.Up == direction){
            minHeap.add(floor);
        }
        else{
            maxHeap.add(floor);
        }
    }
    public void controlCar(){
        while(!minHeap.isEmpty() && !maxHeap.isEmpty()) {
            if(elevator.direction == Direction.Up) {
                while (minHeap.isEmpty()) {
                    System.out.println(minHeap.peek());
                    minHeap.poll();
                }
            }
            else{
                while (maxHeap.isEmpty()) {
                    System.out.println(maxHeap.peek());
                    maxHeap.poll();
                }
            }
        }
    }
}
