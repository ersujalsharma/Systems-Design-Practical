public class Expression implements ArithmaticExpressions{

    ArithmaticExpressions left;
    ArithmaticExpressions right;
    Operation operation;

    public Expression(ArithmaticExpressions left,ArithmaticExpressions right,Operation op){
        this.left = left;
        this.right = right;
        this.operation = op;
    }
    @Override
    public int evaluate() {
        switch (operation){
            case ADD -> {
                return left.evaluate()+ right.evaluate();
            }
            case SUB -> {
                return left.evaluate()- right.evaluate();
            }
            case MUL -> {
                return left.evaluate()* right.evaluate();
            }
            case DIV -> {
                return left.evaluate() / right.evaluate();
            }
            case null, default -> {
                return 0;
            }
        }
    }
}
