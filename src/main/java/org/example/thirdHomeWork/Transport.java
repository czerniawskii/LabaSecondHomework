package org.example.thirdHomeWork;

public abstract class Transport {
    protected int j = 0;
    public Transport(){
        System.out.println(++j + " object of parent type Transport has been created:");
    }
    public abstract void speedUp();

}
