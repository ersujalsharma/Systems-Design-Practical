package FactoryPattern.Factory;

import FactoryPattern.Objects.Circle;
import FactoryPattern.Objects.Rectangle;
import FactoryPattern.Objects.Shape;
import FactoryPattern.Objects.Square;

public class ShapeFactory {
    public Shape getShape(String input){
        return switch (input) {
            case "CIRCLE" -> new Circle();
            case "SQUARE" -> new Square();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }
}
