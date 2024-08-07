public class Main {
    public static void main(String[] args) {
        Number number1 = new Number(1);
        Number number2 = new Number(2);
        Number number3 = new Number(3);
        ArithmaticExpressions expression1 = new Expression(number1,number2,Operation.MUL);
        ArithmaticExpressions expression2 = new Expression(expression1,number3,Operation.ADD);
        int val = expression2.evaluate();
        System.out.println(val);
    }
}