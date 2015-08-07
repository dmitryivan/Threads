import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
    	//Factorial
        for (int i = 0; i < 100 ; i++) {
            (new Thread(new Factorial(i+1))).start();
        }
        
        // Array summ
    	int[] array = new int[400];
        Random rn = new Random();
       
        for (int i = 0; i < 400 ; i++) {
            array[i] = rn.nextInt(20);
        }
        for (int i = 0; i < 10 ; i++) {
            (new Thread(new MultiThread(i+1, array))).start();
        }
    }
}
