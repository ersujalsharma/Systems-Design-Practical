package fascade;

public class Client {
    public static void main(String[] args) {
        OperationalFascade op = new OperationalFascade();
        op.solution(1,2);
    }
}
