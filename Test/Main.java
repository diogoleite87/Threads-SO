package Test;

import Threads.ThreadsMultiplication;
import Threads.ThreadsIncremental;
import Threads.ThreadSum;
import Threads.ThreadCont;

import java.util.Scanner;

public class Main {

    public static void ex1() throws InterruptedException {
        System.out.println("Executando exercicio 1...");

        int[] vet = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ThreadSum thread1 = new ThreadSum(vet);
        ThreadsMultiplication thread2 = new ThreadsMultiplication(vet);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        int resultSum = thread1.getResult();
        int resultMultiplication = thread2.getResult();

        System.out.println("Id thread 1: " + thread1.getId());
        System.out.println("Id thread 2: " + thread2.getId());

        System.out.println("Resultado soma: " + resultSum);
        System.out.println("Resultado multiplicação: " + resultMultiplication);
    }

    public static void ex2() throws InterruptedException {
        System.out.println("Executando exercicio 2...");

        ThreadCont cont = new ThreadCont();
        ThreadsIncremental t1 = new ThreadsIncremental(cont);
        ThreadsIncremental t2 = new ThreadsIncremental(cont);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Resultado contador: " + cont.getCont());
    }

    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        int aux;

        System.out.print("Deseja exercutar qual exercicio: \n 1 - Exercicio 1;\n 2 - Exercicio 2.\n --->  ");
        aux = input.nextInt();

        if (aux == 1) {
            ex1();
        } else {
            ex2();
        }
    }
}
