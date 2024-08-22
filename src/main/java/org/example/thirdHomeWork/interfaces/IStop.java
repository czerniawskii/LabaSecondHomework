package org.example.thirdHomeWork.interfaces;

public interface IStop {

    void stopNow();

    default void whatICanDo4() {
        System.out.println("I can stop the movement");
    }
}
