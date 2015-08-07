public class MultiThread implements Runnable{
    protected int number;
    protected int summ;
    protected int[] array;
    

    public MultiThread(int number, int[] array) {
        this.number = number;
        this.array = array;
        this.summ = 0;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i++) {
            if(array[i] % number == 0){
                summ += array[i];
            }
        }
        System.out.println("I'm thread number " + number + " my summ is " + summ);
    }
}
