import java.math.BigInteger;

public class Factorial implements Runnable{
	protected int number;
	protected BigInteger fact = new BigInteger("1");
    
    public Factorial (int number) {
        this.number = number;
    }
    
    @Override
    public void run() {
        if ( number < 0 ){
            System.out.println("Number should be non-negative.");
        } else {
            for (int c = 1; c <= number; c++) {
                fact = fact.multiply(BigInteger.valueOf(c));
            }
        System.out.println("Factorial of " + number + " is " + fact);
        }
    }
}
