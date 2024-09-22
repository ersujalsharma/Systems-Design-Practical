public class Triangle extends Shape {

    public Triangle(Color color){
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Triangle Filled with Color ");
        color.applyColor();
    }

}
