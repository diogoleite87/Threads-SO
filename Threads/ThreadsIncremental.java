package Threads;

public class ThreadsIncremental extends Thread{

    private ThreadCont cont;

    public ThreadsIncremental(ThreadCont c) {
        cont = c;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            cont.contIncremental();
        }

    }

}

