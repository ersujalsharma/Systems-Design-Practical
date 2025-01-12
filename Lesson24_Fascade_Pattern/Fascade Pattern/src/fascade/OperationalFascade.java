package fascade;

public class OperationalFascade {
    BitwiseOperation bitwiseOperation;
    DecimalOperation decimalOperation;
    public OperationalFascade(){
        bitwiseOperation = new BitwiseOperation();
        decimalOperation = new DecimalOperation();
    }
    public void solution(int val,int val2){
        System.out.println("Sum => "+decimalOperation.sum(val,val2));
        System.out.println("Xor => "+bitwiseOperation.xor(val,val2));
    }
}
