import AbstractFactoryPattern.AbstractFactory.VehicleGroupFactory;
import AbstractFactoryPattern.Factory.Factory;
import AbstractFactoryPattern.Factory.LuxuryFactory;
import AbstractFactoryPattern.Factory.OrdinaryFactory;
import AbstractFactoryPattern.Objects.Vehicle;
import FactoryPattern.Factory.ShapeFactory;
import FactoryPattern.Objects.Shape;

public class Main {
    public static void main(String[] args) {

//        ShapeFactory shapeFactory = new ShapeFactory();
//        Shape shape = shapeFactory.getShape("CIRCLE");
//        shape.draw();
//        Shape shape1 = shapeFactory.getShape("RECTANGLE");
//        shape1.draw();
//        Shape shape2 = shapeFactory.getShape("SQUARE");
//        shape2.draw();
        Factory factory = new LuxuryFactory();
        Vehicle vehicle = factory.getVehicle("V1");
        Vehicle vehicle1 = factory.getVehicle("V2");
        vehicle.average();
        vehicle1.average();
        Factory factory1 = new OrdinaryFactory();
        Vehicle vehicle2 = factory1.getVehicle("V1");
        Vehicle vehicle3 = factory1.getVehicle("V2");
        vehicle2.average();
        vehicle3.average();

        VehicleGroupFactory vehicleGroupFactory = new VehicleGroupFactory();
        Factory factory2 = vehicleGroupFactory.getVehicleGroup("LUXURY");
        Vehicle vehicle4 = factory2.getVehicle("V1");
        vehicle4.average();
        Factory factory3 = vehicleGroupFactory.getVehicleGroup("LUXURY");
        Vehicle vehicle5 = factory3.getVehicle("V2");
        vehicle5.average();
        Factory factory4 = vehicleGroupFactory.getVehicleGroup("ORDINARY");
        Vehicle vehicle6 = factory4.getVehicle("V1");
        vehicle6.average();
        Factory factory5 = vehicleGroupFactory.getVehicleGroup("ORDINARY");
        Vehicle vehicle7 = factory5.getVehicle("V2");
        vehicle7.average();
    }
}