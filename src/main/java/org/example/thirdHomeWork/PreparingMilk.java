package org.example.thirdHomeWork;

public class PreparingMilk extends Thread {

    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }    }
}
