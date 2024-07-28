public class Expression implements ArithmaticExpressionInterface{
    ArithmaticExpressionInterface left;
    ArithmaticExpressionInterface right;
    Operation operation;
    public Expression(ArithmaticExpressionInterface left,ArithmaticExpressionInterface right,Operation operation) {
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        return switch (operation) {
            case ADD -> left.evaluate()+ right.evaluate();
            case SUBTRACTION -> left.evaluate()- right.evaluate();
            case MULTIPLICATION -> left.evaluate() * right.evaluate();
            case DIVISION -> left.evaluate() / right.evaluate();
        };
    }
}
