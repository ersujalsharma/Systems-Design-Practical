package Elevator;

import Display.Direction;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ElevatorController {
    ElevatorCar elevatorCar;
    PriorityQueue<Integer> minPq = new PriorityQueue<>();
    PriorityQueue<Integer> maxPq = new PriorityQueue<>(Comparator.reverseOrder());
    PriorityQueue<Integer> pending = new PriorityQueue<>();
    public ElevatorCar getElevatorCar() {
        return elevatorCar;
    }

    public void setElevatorCar(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
    }

    public void acceptNewRequest(int floorId, Direction direction){
        if(elevatorCar.getDirection() == direction){
            if(elevatorCar.getDirection() == Direction.Up){
                if(elevatorCar.getCurrent_floor().getCurrentFloor()<floorId){
                    minPq.add(floorId);
                }
                else{
                    pending.add(floorId);
                }
            }else{
                if(elevatorCar.getCurrent_floor().getCurrentFloor()>floorId){
                    maxPq.add(floorId);
                }
                else{
                    pending.add(floorId);
                }
            }
        }
        else{
            if(elevatorCar.getDirection() == Direction.Up){
                maxPq.add(floorId);
            }else{
                minPq.add(floorId);
            }
        }
    }
    public void controlCar(){
        if(elevatorCar.getDirection() == Direction.Up){
            // serve
            while (!minPq.isEmpty()){
                System.out.println(minPq.poll());
            }
            while(!maxPq.isEmpty()){
                // serve for all
                System.out.println(maxPq.poll());
            }
            while(!pending.isEmpty()){
                // serve for all
                System.out.println(pending.poll());
            }
        }
        else{
            while(!maxPq.isEmpty()){
                // serve for all
                System.out.println(maxPq.poll());
            }
            while (!minPq.isEmpty()){
                // serve for all
                System.out.println(minPq.poll());
            }
            while(!pending.isEmpty()){
                // serve for all
                System.out.println(pending.poll());
            }
        }
    }
}
