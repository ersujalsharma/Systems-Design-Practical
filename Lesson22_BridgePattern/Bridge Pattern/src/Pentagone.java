public class Pentagone extends Shape{

    public Pentagone(Color color){
        super(color);
    }
    @Override
    public void applyColor() {
        System.out.println("Pentagone color is ");
        color.applyColor();
    }
}
