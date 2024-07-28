public class Main {
    public static void main(String[] args) {
        Number two = new Number(2);
        Operation operation1 = Operation.MULTIPLICATION;
        Number one = new Number(1);
        Number seven = new Number(7);
        Operation operation2 = Operation.ADD;
        ArithmaticExpressionInterface inner = new Expression(one,seven,operation2);
        ArithmaticExpressionInterface outer = new Expression(two,inner,operation1);
        System.out.println(outer.evaluate());
    }
}