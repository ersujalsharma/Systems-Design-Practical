public class Car {
    // lazy Initialization
    static Car carObject;
    // private constructor
    private Car(){
        // Private Constructor Calling
        System.out.println("Private Constructor Calling");
    }
    // static methods car
    static Car getCar(){
        if(carObject == null){
            // first time object creation
            carObject = new Car();
        }
//        else {
//            System.out.println("Same object is calling ");
//        }
        System.out.println(carObject+" "+ " -> object is this.");
        // same object is called.
        return carObject;
    }
}
