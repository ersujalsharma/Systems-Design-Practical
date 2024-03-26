public class Number implements ArithmaticExpressionInterface{
    int val;
    public Number(int val){
        this.val = val;
    }
    @Override
    public int evaluate() {
        return val;
    }
}
