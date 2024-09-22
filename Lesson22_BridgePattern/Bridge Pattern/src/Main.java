 public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Shape triangleWithRedColor = new Triangle(new RedColor());
        triangleWithRedColor.applyColor();
        Shape pentagoneWithGreenColor = new Pentagone(new GreenColor());
        pentagoneWithGreenColor.applyColor();

        // Here the colors are working like a bridge to deliver the shape we have to connect via color bridge.
        // Shape and color both can expand independently.
    }
}