package org.example.thirdHomeWork.interfaces;

public interface IBeep {

    void beep();
    default void doSmth() {
        System.out.println("I can beep");
    }
}
