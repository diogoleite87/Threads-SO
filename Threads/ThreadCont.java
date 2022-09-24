package Threads;

public class ThreadCont {
    private int cont;

    public ThreadCont() {
        this.cont = 0;
    }

    public void contIncremental() {
        cont++;
    }

    public int getCont() {
        return cont;
    }

}
