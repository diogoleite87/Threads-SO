package Threads;

public class ThreadsMultiplication extends Thread{
    private int[] vet;
    private int result;

    public ThreadsMultiplication(int[] vet) {
        this.vet = vet;
        this.result = 1;
    }

    @Override
    public void run() {

        for (int j : vet) {
            result *= j;
        }
    }
    public int getResult() {
        return result;
    }
}
