package Threads;

public class ThreadSum extends Thread{

    private int[] vet;
    private int result;

    public ThreadSum(int[] vet) {
        this.vet = vet;
        this.result = 0;
    }

    // Método para fazer a soma dos elementos do vetor
    @Override
    public void run() {

        for (int i = 0; i < vet.length; i++) {
            result += vet[i];
        }
    }

    // Método para retornar o resultado
    public int getResult() {
        return result;
    }
}
