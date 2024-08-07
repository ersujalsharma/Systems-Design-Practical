public class Number implements ArithmaticExpressions{
    int value;
    public Number(int value){
        this.value = value;
    }
    @Override
    public int evaluate() {
        return value;
    }
}
